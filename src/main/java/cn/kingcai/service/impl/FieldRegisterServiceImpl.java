package cn.kingcai.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.kingcai.dao.BipTFieldMapper;
import cn.kingcai.entity.BipTField;
import cn.kingcai.entity.PageResult;
import cn.kingcai.service.FieldRegisterService;
import cn.kingcai.util.UploadUtil;

@Service
public class FieldRegisterServiceImpl implements FieldRegisterService {

	@Autowired
	private BipTFieldMapper fieldMapper;
	//uuid作为联系人id

	String uuid = null;

	int number = 1;

	/**
	 * 添加到现场登记
	 */
	@Override
	public void saveToField(BipTField field) {
		//文件保存到本地的路径
		String localPath = "D:\\File\\";
		MultipartFile headimage = field.getHeadimage();
		MultipartFile recentphotos = field.getRecentphotos();
		MultipartFile[] images = field.getImage();

		//定义文件名
		String headimageName = null;
		if (headimage != null) {
			if (!headimage.isEmpty()) {
				headimageName = UploadUtil.upload(headimage, localPath);
			}
		}

		String recentphotosName = null;
		if (recentphotos != null) {
			if (!recentphotos.isEmpty()) {
				recentphotosName = UploadUtil.upload(recentphotos, localPath);
			}
		}

		String bipImage = "";
		//多张现场照片保存
		for (MultipartFile image : images) {
			String imageName = null;
			if (image != null) {
				if (!image.isEmpty()) {
					imageName = UploadUtil.upload(image, localPath);
				}
			}
			bipImage = bipImage + "/" + imageName;
		}
		//单据编号
		getBillno(field);
		//设置fid
		field.setfBipImage(bipImage);
		field.setfBipHeadimage(headimageName);
		field.setfBipRecentphotos(recentphotosName);
		fieldMapper.insert(field);
	}

	/**
	 * 保存时自动生成单据标号
	 * @param field
	 * @author volcano
	 * @version 1.0
	 */
	private void getBillno(BipTField field) {
		//自动生成单据编号(身份证号+日期)
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		String billNo = field.getfBipComplainantsnumerid() + df.format(new Date()) + number;
		field.setFbillno(billNo);
		number++;
		while (number >= 100000) {
			number = 1;
		}
	}

	/**
	 * 查询现场登记列表
	 */
	@Override
	public PageResult selectFieldList(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<Map> list = (Page<Map>) fieldMapper.selectFieldList();
		return new PageResult(list.getTotal(), list.getResult());
	}


}
