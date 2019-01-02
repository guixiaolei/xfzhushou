package cn.kingcai.service;

import java.util.List;
import java.util.Map;

import cn.kingcai.entity.BipTComplaintmanagehead;
import cn.kingcai.entity.PageResult;

/**
 * 信访处理
 * @author volcano
 *
 */
public interface PetitionHandleService {

	/**
	 * 查询信访处理列表
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	PageResult selectHandleList(int pageNum, int pageSize);

	/**
	 * 信访处理单显示信息
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
	 * 知悉后更新信访处理信息
	 * @param complaintmanagehead
	 * @author volcano
	 * @version 1.0
	 */
	void updateLearned(BipTComplaintmanagehead complaintmanagehead);

}
