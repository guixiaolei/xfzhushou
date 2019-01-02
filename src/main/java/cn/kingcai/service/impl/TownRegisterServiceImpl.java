package cn.kingcai.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.kingcai.dao.BipTCustEventmessageMapper;
import cn.kingcai.dao.BipTPeopleentryMapper;
import cn.kingcai.entity.CustEventmessage;
import cn.kingcai.entity.PageResult;
import cn.kingcai.entity.Peopleentry;
import cn.kingcai.service.TownRegisterService;
import cn.kingcai.util.UploadUtil;

@Service
public class TownRegisterServiceImpl implements TownRegisterService {

	@Autowired
	private BipTPeopleentryMapper peopleentryMapper;

	@Autowired
	private BipTCustEventmessageMapper custEventmessageMapper;


	int number = 0;

	/**
	 * 保存单据体
	 */
	@Override
	public void saveToBody(Peopleentry peopleentry) {

		String localPath = "D:\\File\\";
		MultipartFile headimage = peopleentry.getHeadimage();
		MultipartFile recentphotos = peopleentry.getRecentphotos();
		String headimageName = null;
		String recentphotosName = null;
		if (headimage != null) {
			if (!headimage.isEmpty()) {
				headimageName = UploadUtil.upload(headimage, localPath);
			}
		}
		if (recentphotos != null) {
			if (!recentphotos.isEmpty()) {
				recentphotosName = UploadUtil.upload(recentphotos, localPath);
			}
		}
		peopleentry.setfBipHeadimage(headimageName);
		peopleentry.setfBipRecentphotos(recentphotosName);
		peopleentryMapper.saveToBody(peopleentry);
	}

	/**
	 * 保存单据头
	 */
	@Override
	public void saveToHead(CustEventmessage custEventmessage) {
		String localPath = "D:\\File\\";
		MultipartFile headimage = custEventmessage.getHeadimage();
		MultipartFile recentphotos = custEventmessage.getRecentphotos();
		String headimageName = null;
		String recentphotosName = null;
		if (headimage != null) {
			if (!headimage.isEmpty()) {
				headimageName = UploadUtil.upload(headimage, localPath);
			}
		}
		if (recentphotos != null) {
			if (!recentphotos.isEmpty()) {
				recentphotosName = UploadUtil.upload(recentphotos, localPath);
			}
		}
		//自动生成单据编号(身份证号+日期)
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		String billNo = custEventmessage.getfBipComplainantsnumerid() + df.format(new Date()) + number;
		custEventmessage.setFbillno(billNo);
		custEventmessage.setfBipHeadimage(headimageName);
		custEventmessage.setfBipRecentphotos(recentphotosName);
		custEventmessageMapper.saveToHead(custEventmessage);
	}

	@Override
	public PageResult selectList(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<Map> list = (Page<Map>) custEventmessageMapper.selectList();
		return new PageResult(list.getTotal(), list.getResult());
	}

	@Override
	public List<Map> showBodyList(String fid) {
		return peopleentryMapper.showBodyList(fid);
	}

	/**
	 * 修改时显示乡镇登记单据头信息
	 */
	@Override
	public List<Map> showHeadData(String fid) {
		return custEventmessageMapper.showHeadData(fid);
	}


	/*@Override
	public void saveToPetitionerfile(PetitionerfileSave petitionerfile) {
		String localPath = "D:\\File\\";
		MultipartFile headimage = petitionerfile.getHeadimage();
		MultipartFile recentphotos = petitionerfile.getRecentphotos();
		String headimageName = null;
		String recentphotosName = null;
		if (headimage != null) {
			if (!headimage.isEmpty()) {
				headimageName = UploadUtil.upload(headimage, localPath);
			}
		}
		if (recentphotos != null) {
			if (!recentphotos.isEmpty()) {
				recentphotosName = UploadUtil.upload(recentphotos, localPath);
			}
		}
		petitionerfile.setFid(uuid);
		petitionerfile.setfBipHeadimage(headimageName);
		petitionerfile.setfBipRecentphotos(recentphotosName);
	}
	*/
}
