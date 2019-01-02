package cn.kingcai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kingcai.dao.BipTLeadershipMapper;
import cn.kingcai.entity.Leadership;
import cn.kingcai.service.LeadershipService;

@Service
public class LeadershipServiceImpl implements LeadershipService {

	@Autowired
	private BipTLeadershipMapper leadershipMapper;
	@Override
	public List<Leadership> selectLeadership() {
		List<Leadership> leaderships = leadershipMapper.selectLeadership();
		return leaderships;
	}

}
