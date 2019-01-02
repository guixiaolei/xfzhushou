package cn.kingcai.dao;

import java.util.List;
import java.util.Map;

import cn.kingcai.entity.BipTComplaintmanagehead;

public interface BipTComplaintmanageheadMapper {
	/**
	 * 查询信访处理列表
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> selectHandleList();

	/**
	 * 信访处理单 
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> showData(String billno);

	/**
	 * 保存到信访处理单
	 * 
	 * @author volcano
	 * @version 1.0
	 */
	void saveToPetitionHandle(BipTComplaintmanagehead complaintmanagehead);

	/**
	 * 更新信访处理信息
	 * 
	 * @author volcano
	 * @version 1.0
	 */
	void updateLearned(BipTComplaintmanagehead complaintmanagehead);

	/*//逆向生成	
	int countByExample(BipTComplaintmanageheadExample example);
	
	int deleteByExample(BipTComplaintmanageheadExample example);
	
	int insert(BipTComplaintmanagehead record);
	
	int insertSelective(BipTComplaintmanagehead record);
	
	List<BipTComplaintmanagehead> selectByExample(BipTComplaintmanageheadExample example);
	
	int updateByExampleSelective(@Param("record") BipTComplaintmanagehead record, @Param("example") BipTComplaintmanageheadExample example);
	
	int updateByExample(@Param("record") BipTComplaintmanagehead record, @Param("example") BipTComplaintmanageheadExample example);*/


}