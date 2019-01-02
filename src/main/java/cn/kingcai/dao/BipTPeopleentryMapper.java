package cn.kingcai.dao;

import java.util.List;
import java.util.Map;

import cn.kingcai.entity.Peopleentry;

public interface BipTPeopleentryMapper {

	/**
	 * 乡镇登记保存到信访人
	 * 
	 * @author volcano
	 * @version 1.0
	 */
	void saveToBody(Peopleentry peopleentry);

	/**
	 * 乡镇登记根据fid显示信访人列表
	 * @param fid
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> showBodyList(String fid);

	/* int countByExample(BipTPeopleentryExample example);
	
	int deleteByExample(BipTPeopleentryExample example);
	
	int insert(BipTPeopleentry record);
	
	int insertSelective(BipTPeopleentry record);
	
	List<BipTPeopleentry> selectByExample(BipTPeopleentryExample example);
	
	int updateByExampleSelective(@Param("record") BipTPeopleentry record, @Param("example") BipTPeopleentryExample example);
	
	int updateByExample(@Param("record") BipTPeopleentry record, @Param("example") BipTPeopleentryExample example);*/
}