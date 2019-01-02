package cn.kingcai.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.kingcai.service.ProvinceSynchroService;

/**
 * 省信访同步
 * @author volcano
 *
 */
@RestController
@RequestMapping("/provinceSyn")
public class ProvinceSynchroController {

	@Autowired
	private ProvinceSynchroService synService;

	/**
	 * 省信访同步列表
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/list")
	public List<Map> list() {
		return synService.list();
	}

	/**
	 * 修改时根据单据单号查询信息
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/showData")
	public List<Map> showData(String fbillno) {
		return synService.showData(fbillno);
	}
}
