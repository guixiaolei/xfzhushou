package cn.kingcai.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kingcai.dao.BipTJointMapper;
import cn.kingcai.dao.BipTJointcommitteeMapper;
import cn.kingcai.entity.BipTJointcommittee;
import cn.kingcai.entity.ManaegeUtils;
import cn.kingcai.service.JointService;

@Service
public class JointServiceImpl implements JointService {
	@Autowired
	private BipTJointMapper jointMapper;

	@Autowired
	private BipTJointcommitteeMapper jointcommitteeMapper;

	/**
	 * 查询联席会成员
	 */
	@Override
	public List<BipTJointcommittee> selectJointCommittee() {
		List<BipTJointcommittee> jointCommittee = jointcommitteeMapper.selectJointCommittee();
		return jointCommittee;
	}

	/**
	 * 根据联席会成员id 查询管理单位
	 */
	@Override
	public List<ManaegeUtils> selectManageUtils(Integer fBipPoweraffairs) {
		List<Integer> managedIds = jointMapper.selectManagedId(fBipPoweraffairs);
		//		System.out.println(managedIds.size());
		List<ManaegeUtils> list = new ArrayList<ManaegeUtils>();
		int i = 1;
		for (Integer managedId : managedIds) {
			//查询联席会成员管理的单位id
			ManaegeUtils manageUtils = jointMapper.selectManageUtils(managedId);
				manageUtils.setId(i);
				list.add(manageUtils);
				i++;
		}
		return list;
	}
}
