package cn.kingcai.service;

import java.util.List;

import cn.kingcai.entity.BipTJointcommittee;
import cn.kingcai.entity.ManaegeUtils;

public interface JointService {
	/**
	 * 查询联席会成员
	 * @param example
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<BipTJointcommittee> selectJointCommittee();


	/**
	 * 查询管理的事权单位
	 * @param fid
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<ManaegeUtils> selectManageUtils(Integer fBipPoweraffairs);
}
