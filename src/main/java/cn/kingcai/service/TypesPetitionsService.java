package cn.kingcai.service;

import java.util.List;
import java.util.Map;

import cn.kingcai.entity.BipTTypespetitions;

public interface TypesPetitionsService {
	/**
	 * 保存上访类型
	 * @param record
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	int insert(BipTTypespetitions record);

	/**
	 * 查询上访类型
	 */
	List<Map> selectTypes();

	/**
	 * 删除上访类型
	 * 
	 * @author volcano
	 * @version 1.0
	 */
	void delete(String fNumber);

	/**
	 * 更新上访类型
	 * @param typespetition
	 * @author volcano
	 * @version 1.0
	 */
	void update(BipTTypespetitions typespetition);
}
