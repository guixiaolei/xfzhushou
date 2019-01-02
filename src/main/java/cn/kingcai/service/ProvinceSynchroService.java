package cn.kingcai.service;

import java.util.List;
import java.util.Map;

public interface ProvinceSynchroService {

	/**
	 * 查询列表
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> list();

	/**
	 * 修改时根据单据单号查询信息
	 * @param fbillno
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Map> showData(String fbillno);

}
