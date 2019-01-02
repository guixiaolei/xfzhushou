package cn.kingcai.service;

import java.util.List;

import cn.kingcai.entity.Leadership;

public interface LeadershipService {
	/**
	 * 查询关注领导列表
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Leadership> selectLeadership();
}
