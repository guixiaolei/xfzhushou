package cn.kingcai.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.kingcai.dao.BipTComplaintmanageheadMapper;
import cn.kingcai.entity.BipTComplaintmanagehead;
import cn.kingcai.entity.PageResult;
import cn.kingcai.service.PetitionHandleService;

@Service
public class PetitionHandleServiceImpl implements PetitionHandleService {

	@Autowired
	private BipTComplaintmanageheadMapper complaintmanageheadMapper;

	int number = 1;
	/**
	 * 信访处理列表分页
	 * 
	 */
	@Override
	public PageResult selectHandleList(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<Map> page = (Page<Map>) complaintmanageheadMapper.selectHandleList();
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 信访处理单显示信息
	 */
	@Override
	public List<Map> showData(String billno) {
		return complaintmanageheadMapper.showData(billno);
	}

	/**
	 * 保存到信访处理单
	 */
	@Override
	public void saveToPetitionHandle(BipTComplaintmanagehead complaintmanagehead) {
		//自动生成单据编号(身份证号+日期)
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		String billNo = complaintmanagehead.getfBipComplainantsnumerid() + df.format(new Date()) + number;
		complaintmanagehead.setFbillno(billNo);
		number++;
		while (number >= 1000) {
			number = 1;
		}
		complaintmanageheadMapper.saveToPetitionHandle(complaintmanagehead);
	}

	/**
	 * 知悉后更新信访处理信息
	 */
	@Override
	public void updateLearned(BipTComplaintmanagehead complaintmanagehead) {
		complaintmanagehead.setfBipAwareoftime(new Date());
		complaintmanageheadMapper.updateLearned(complaintmanagehead);

	}

}
