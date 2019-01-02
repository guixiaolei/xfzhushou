package cn.kingcai.service;

import java.util.List;

import cn.kingcai.entity.Letterbureau;

public interface LetterbureauService {
	/**
	 * 查询信访局成员列表
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Letterbureau> selectBureauList();
}
