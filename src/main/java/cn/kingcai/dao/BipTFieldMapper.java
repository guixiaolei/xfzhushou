package cn.kingcai.dao;

import java.util.List;
import java.util.Map;

import cn.kingcai.entity.BipTField;

public interface BipTFieldMapper {

	/**
	 * 添加到现场登记
	 * @param record
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	int insert(BipTField record);

	/**
	 * 查询现场登记列表
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> selectFieldList();

	/* int countByExample(BipTFieldExample example);
	
	int deleteByExample(BipTFieldExample example);
	
	int insertSelective(BipTField record);
	
	List<BipTField> selectByExample(BipTFieldExample example);
	
	int updateByExampleSelective(@Param("record") BipTField record, @Param("example") BipTFieldExample example);
	
	int updateByExample(@Param("record") BipTField record, @Param("example") BipTFieldExample example);*/
}