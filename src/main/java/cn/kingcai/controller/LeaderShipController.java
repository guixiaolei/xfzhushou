package cn.kingcai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.kingcai.entity.Leadership;
import cn.kingcai.entity.ManaegeUtils;
import cn.kingcai.service.JointService;
import cn.kingcai.service.LeadershipService;

/**
 * 关注领导列表
 * @author volcano
 *
 */
@CrossOrigin
@RestController
@RequestMapping("/leadership")
public class LeaderShipController {
	@Autowired
	private LeadershipService selectLeadership;
	@Autowired
	private JointService jointService;

	/**
	 * 查询关注领导列表
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/selectLeadership")
	public List<Leadership> selectLeadership() {
		List<Leadership> Leaderships = selectLeadership.selectLeadership();
		return Leaderships;
	}

	/**
	 * 查询管理的事权单位
	 * @param username
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/selectManageUtils")
	public List<ManaegeUtils> selectManageUtils(Integer fBipPoweraffairs) {
		List<ManaegeUtils> manageUtils = jointService.selectManageUtils(fBipPoweraffairs);
		return manageUtils;
	}

}
