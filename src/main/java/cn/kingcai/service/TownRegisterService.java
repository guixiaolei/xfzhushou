package cn.kingcai.service;

import java.util.List;
import java.util.Map;

import cn.kingcai.entity.CustEventmessage;
import cn.kingcai.entity.PageResult;
import cn.kingcai.entity.Peopleentry;

public interface TownRegisterService {

	/**
	 * 保存单据体
	 * 
	 * @author volcano
	 * @version 1.0
	 */
	void saveToBody(Peopleentry peopleentry);

	/**
	 * 保存单据头
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
	PageResult selectList(int pageNum, int pageSize);

	/**
	 * 
	 * 
	 * @author volcano
	 * @version 1.0
	 * @return 
	 */
	List<Map> showBodyList(String fid);

	/**
	 * 显示乡镇登记单据头信息
	 * @param fid
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> showHeadData(String fid);

	/**
	 * 保存到信访人档案
	 * @param petitionerfile
	 * @author volcano
	 * @version 1.0
	 */
	/*void saveToPetitionerfile(PetitionerfileSave petitionerfile);*/

}
