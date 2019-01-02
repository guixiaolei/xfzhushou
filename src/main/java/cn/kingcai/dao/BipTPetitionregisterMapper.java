package cn.kingcai.dao;

import java.util.List;
import java.util.Map;

import cn.kingcai.entity.BipTPetitionregister;

public interface BipTPetitionregisterMapper {
	/**
	 * 选择一级分类
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> selectFirstclass();

	/**
	 * 根据一级id查询二级分类
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> findByParentId1(String fBipFirstclassify);

	/**
	 * 根据二级id查询三级分类
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> findByParentId2(String fBipSecondclassify);

	/**
	 * 查询政治面貌
	 * @param example
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> findOutlook();

	/**
	 * 查询信访登记列表
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> selectRegisterList();

	/**
	 * 保存信访登记的信息
	 * @param record
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
    int insert(BipTPetitionregister record);

	/**
	 * 修改时回显数据
	 * @param record
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> showDataList(String fid);

	/**
	 * 更新信访联系人
	 * @param register
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	void updateDataList(BipTPetitionregister register);

	/* 
	 逆向生成的
	int countByExample(BipTPetitionregisterExample example);
	
	int deleteByExample(BipTPetitionregisterExample example); 
	int insertSelective(BipTPetitionregister record);
	
	List<BipTPetitionregister> selectByExample(BipTPetitionregisterExample example);
	
	int updateByExampleSelective(@Param("record") BipTPetitionregister record, @Param("example") BipTPetitionregisterExample example);
	
	int updateByExample(@Param("record") BipTPetitionregister record, @Param("example") BipTPetitionregisterExample example);*/



}