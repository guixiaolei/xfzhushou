package cn.kingcai.service;

import cn.kingcai.entity.BipTField;
import cn.kingcai.entity.PageResult;

public interface FieldRegisterService {

	/**
	 * 添加到现场登记
	 * 
	 * @author volcano
	 * @version 1.0
	 */
	void saveToField(BipTField field);

	/**
	 * 查询现场登记列表
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	PageResult selectFieldList(int pageNum, int pageSize);

}
