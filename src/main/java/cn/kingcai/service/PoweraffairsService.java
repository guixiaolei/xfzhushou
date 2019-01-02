package cn.kingcai.service;


import java.util.List;

import cn.kingcai.entity.BipTPoweraffairs;
import cn.kingcai.entity.Poweraffairs;

public interface PoweraffairsService {
	/**
	 * 查找相关项
	 * @param example
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Poweraffairs> findPoweraffairs();


	/**
	 * 添加事权单位档案
	 * @param record
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	int insert(BipTPoweraffairs record);

}
