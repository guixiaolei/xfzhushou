package cn.kingcai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.kingcai.entity.Letterbureau;
import cn.kingcai.service.LetterbureauService;

@CrossOrigin
@RestController
@RequestMapping("/Letterbureau")
public class LetterbureauController {
	@Autowired
	private LetterbureauService letterbureauService;

	/**
	 * 查询信访局成员明细
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/selectBureauList")
	public List<Letterbureau> selectBureauList(){
		return letterbureauService.selectBureauList();
	}

	/*@RequestMapping("/selectHead")
	public BipTPetitionbureau selectHead() {
	
	}*/
}
