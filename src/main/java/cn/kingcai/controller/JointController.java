package cn.kingcai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.kingcai.entity.BipTJointcommittee;
import cn.kingcai.entity.Jointcommittee;
import cn.kingcai.entity.ManaegeUtils;
import cn.kingcai.service.JointService;
import cn.kingcai.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/joint")
public class JointController {
	@Autowired
	private JointService jointService;

	@Autowired
	private UserService userService;

	/**
	 * 查询联席会成员
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/jointCommittee")
	public List<Jointcommittee> selectJointCommittee() {
		//		int id = 1;
		List<BipTJointcommittee> jointCommittees = jointService.selectJointCommittee();
		//根据entryid 查询成员姓名
		List<Jointcommittee> list = new ArrayList<>();
		for (BipTJointcommittee jointCommittee : jointCommittees) {
			Integer name = jointCommittee.getfBipName();
			String username = userService.selectUsernameByid(name);
			Jointcommittee jointcommittee = new Jointcommittee();
			//			jointcommittee.setId(id);
			jointcommittee.setId(jointCommittee.getFseq());
			jointcommittee.setfBipName(username);
			jointcommittee.setFentryid(jointCommittee.getFentryid());
			jointcommittee.setfBipTelephone(jointCommittee.getfBipTelephone());
			jointcommittee.setfBipIsgetmessage(jointCommittee.getfBipIsgetmessage());
			list.add(jointcommittee);
			//			id++;
		}
		return list;
	}

	@RequestMapping("/manageUtils")
	public List<ManaegeUtils> selectManageUtils(Integer fentryid) {
		List<ManaegeUtils> manageUtils = jointService.selectManageUtils(fentryid);
		return manageUtils;

	}
}
