package cn.kingcai.dao;

import java.util.List;
import java.util.Map;

import cn.kingcai.entity.CustEventmessage;

public interface BipTCustEventmessageMapper {

	/**
	 * 保存到乡镇登记单据头
	 * @param custEventmessage
	 * @author volcano
	 * @version 1.0
	 */
	void saveToHead(CustEventmessage custEventmessage);

	/**
	 * 查询乡镇登记列表
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> selectList();

	/**
	 * 修改时显示单据头信息
	 * @param fid
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> showHeadData(String fid);


	//逆向生成
	/* int countByExample(BipTCustEventmessageExample example);
	
	int deleteByExample(BipTCustEventmessageExample example);
	
	int insert(BipTCustEventmessage record);
	
	int insertSelective(BipTCustEventmessage record);
	
	List<BipTCustEventmessage> selectByExample(BipTCustEventmessageExample example);
	
	int updateByExampleSelective(@Param("record") BipTCustEventmessage record, @Param("example") BipTCustEventmessageExample example);
	
	int updateByExample(@Param("record") BipTCustEventmessage record, @Param("example") BipTCustEventmessageExample example);*/
}