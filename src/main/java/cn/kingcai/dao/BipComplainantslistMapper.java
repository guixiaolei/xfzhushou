package cn.kingcai.dao;

import java.util.List;
import java.util.Map;

import cn.kingcai.entity.Complainantslist;

public interface BipComplainantslistMapper {
	/**
	 * 保存到信访人列表
	 * @param complainantslist
	 * @author volcano
	 * @version 1.0
	 */
	void saveToList(Complainantslist complainantslist);

	/**
	 * 删除信访人
	 * @author volcano
	 * @version 1.0
	 */
	void deleteListByEntryid(long entryId);

	/**
	 * 显示信访人信息
	 * @param fid
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> showPetitionList(String fid);



	/*  int countByExample(BipComplainantslistExample example);
	
	int deleteByExample(BipComplainantslistExample example);
	
	//    int insert(BipComplainantslist record);
	
	int insertSelective(BipComplainantslist record);
	
	List<BipComplainantslist> selectByExample(BipComplainantslistExample example);
	
	int updateByExampleSelective(@Param("record") BipComplainantslist record, @Param("example") BipComplainantslistExample example);
	
	int updateByExample(@Param("record") BipComplainantslist record, @Param("example") BipComplainantslistExample example);*/


}