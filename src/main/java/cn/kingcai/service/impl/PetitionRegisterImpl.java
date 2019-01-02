package cn.kingcai.service.impl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.kingcai.dao.BipComplainantslistMapper;
import cn.kingcai.dao.BipTPetitionerfileMapper;
import cn.kingcai.dao.BipTPetitionregisterMapper;
import cn.kingcai.entity.BipTPetitionregister;
import cn.kingcai.entity.Complainantslist;
import cn.kingcai.entity.PageResult;
import cn.kingcai.entity.PetitionerfileSave;
import cn.kingcai.service.PetitionRegisterService;

@Service
public class PetitionRegisterImpl implements PetitionRegisterService {

	@Autowired
	private BipTPetitionregisterMapper petitionregisterMapper;

	@Autowired
	private BipComplainantslistMapper complainantslistMapper;

	@Autowired
	private BipTPetitionerfileMapper petitionerfileMapper;

	//uuid作为联系人id

	String uuid = null;

	int number = 0;


	/**
	 * 保存信访登记的信息
	 */
	@Override
	public int insert(BipTPetitionregister record) {

		//文件保存到本地的路径
		String localPath = "D:\\File\\";
		MultipartFile headimage = record.getHeadimage();
		MultipartFile recentphotos = record.getRecentphotos();
		//定义文件名
		String headimageName = null;
		if (!headimage.isEmpty()) {
			headimageName = uploadUtil(headimage, localPath);
		}
		String recentphotosName = null;
		if (!recentphotos.isEmpty()) {
			recentphotosName = uploadUtil(recentphotos, localPath);
		}

		getBillno(record);
		//设置fid
		record.setFid(uuid);
		record.setfBipHeadimage(headimageName);
		record.setfBipRecentphotos(recentphotosName);
		int count = petitionregisterMapper.insert(record);
		return count;
	}

	private void getBillno(BipTPetitionregister record) {
		//自动生成单据编号(身份证号+日期)
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		String billNo = record.getfBipComplainantsnumerid() + df.format(new Date()) + number;
		record.setFbillno(billNo);
		number++;
		while (number >= 1000) {
			number = 0;
		}
	}

	/**
	 * 查询一级分类
	 */
	@Override
	public List<Map> selectFirstclass() {
		List<Map> firstclass = petitionregisterMapper.selectFirstclass();
		return firstclass;
	}

	/**
	 * 查询二级分类
	 */
	@Override
	public List<Map> findByParentId1(String fBipFirstclassify) {
		//根据一级分类的名称查询二级分类的名称
		List<Map> secondcatName = petitionregisterMapper.findByParentId1(fBipFirstclassify);
		return secondcatName;
	}

	/**
	 * 查询三级分类
	 */
	@Override
	public List<Map> findByParentId2(String fBipSecondclassify) {
		//根据一级分类的名称查询二级分类的名称
		List<Map> secondcatName = petitionregisterMapper.findByParentId2(fBipSecondclassify);
		return secondcatName;
	}

	/**
	 * 查询政治面貌
	 * @param example
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@Override
	public List<Map> findOutlook() {
		List<Map> outlook = petitionregisterMapper.findOutlook();
		return outlook;
	}

	/**
	 * 保存的信访人列表
	 */
	@Override
	public void saveToList(Complainantslist complainantslist) {
		//图片保存到数据库的路径
		//		String sqlPath=null;
		//文件保存到本地的路径
		String localPath = "D:\\File\\";
		MultipartFile headimage = complainantslist.getHeadimage();

		MultipartFile recentphotos = complainantslist.getRecentphotos();

		//定义文件名
		String headimageName = null;
		if (headimage != null) {
			if (!headimage.isEmpty()) {
				headimageName = uploadUtil(headimage, localPath);
			}
		}
		String recentphotosName = null;
		if (recentphotos != null) {
			if (!complainantslist.getRecentphotos().isEmpty()) {
				recentphotosName = uploadUtil(recentphotos, localPath);
			}
		}
		//设置fid
		complainantslist.setFid(uuid);
		complainantslist.setfBipHeadimage(headimageName);
		complainantslist.setfBipRecentphotos(recentphotosName);
		complainantslist.setFseq(1);
		complainantslistMapper.saveToList(complainantslist);
	}

	/**
	 * 文件上传的方法
	 * @param complainantslist
	 * @param localPath
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	private String uploadUtil(MultipartFile file, String localPath) {
		String filename;
		//生成uuid作为文件名称
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		//获得后缀
		String contentType = file.getContentType();
		String suffixName = contentType.substring(contentType.indexOf("/") + 1);
		//拼接获得文件名
		filename = uuid + "." + suffixName;
		//文件保存路径
		try {
			file.transferTo(new File(localPath + filename));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return filename;
	}

	/**
	 * 删除信访人
	 */
	@Override
	public void deleteListByEntryid(long entryId) {
		complainantslistMapper.deleteListByEntryid(entryId);
	}

	/**
	 * 查询信访登记列表
	 */
	@Override
	public PageResult selectRegisterList(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<Map> list = (Page<Map>) petitionregisterMapper.selectRegisterList();
		return new PageResult(list.getTotal(), list.getResult());
	}

	/**
	 * 显示信访人列表
	 */
	@Override
	public List<Map> showPetitionList(String fid) {
		return complainantslistMapper.showPetitionList(fid);
	}

	/**
	 * 保存到信访人档案
	 * @param file
	 * @author volcano
	 * @version 1.0
	 */
	@Override
	public void saveToPetitionerFile(PetitionerfileSave file) {
		//文件保存到本地的路径
		String localPath = "D:\\File\\";
		MultipartFile headimage = file.getHeadimage();
		MultipartFile recentphotos = file.getRecentphotos();
		MultipartFile imageface = file.getImageface();
		MultipartFile imageback = file.getImageback();

		//定义文件名
		String headimageName = null;
		if (headimage != null) {
			if (!headimage.isEmpty()) {
				headimageName = uploadUtil(headimage, localPath);
			}
		}
		String recentphotosName = null;
		if (recentphotos != null) {
			if (!recentphotos.isEmpty()) {
				recentphotosName = uploadUtil(recentphotos, localPath);
				//有近照设置已注册人脸样本
				file.setfBipIsregisterfacedemo("1");
			}
		}

		String imagefaceName = null;
		if (imageface != null) {
			if (!imageface.isEmpty()) {
				imagefaceName = uploadUtil(imageface, localPath);
			}
		}
		String imagebackName = null;
		if (imageback != null) {
			if (!imageback.isEmpty()) {
				imagebackName = uploadUtil(imageback, localPath);
			}
		}
		//自动生成单据编号(身份证号+日期)
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		String billNo = file.getfBipComplainantsnumerid() + df.format(new Date()) + number;
		file.setFnumber(billNo);
		number++;
		while (number >= 1000) {
			number = 0;
		}
		file.setFnumber(billNo);
		file.setfBipUsername(file.getfBipPetitionername());
		file.setfBipRecentphotos(recentphotosName);
		file.setfBipHeadimage(headimageName);
		file.setfBipImageface(imagefaceName);
		file.setfBipImageback(imagebackName);
		file.setFmasterid(1111);

		petitionerfileMapper.saveToPetitionerFile(file);
	}

	/**
	 * 修改时回显联系人数据
	 */
	@Override
	public List<Map> showDataList(String fid) {
		return petitionregisterMapper.showDataList(fid);
	}

	/**
	 * 更新信访联系人
	 */
	@Override
	public void updateDataList(BipTPetitionregister register) {
		petitionregisterMapper.updateDataList(register);
	}

}
