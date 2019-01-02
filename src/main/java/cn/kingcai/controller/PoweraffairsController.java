package cn.kingcai.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.kingcai.entity.BipTPoweraffairs;
import cn.kingcai.entity.Poweraffairs;
import cn.kingcai.entity.Result;
import cn.kingcai.service.PoweraffairsService;

/**
 * 事权单位
 * @author volcano
 *
 */
@CrossOrigin
@RestController
@RequestMapping("/poweraffairs")
public class PoweraffairsController {
	@Autowired
	private PoweraffairsService poweraffairsService;

	/**
	 * 事权单位列表
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/findPoweraffairs")
	public List<Poweraffairs> findPoweraffairs() {
		List<Poweraffairs> poweraffairs = poweraffairsService.findPoweraffairs();
		return poweraffairs;
	}


	/**
	 * 添加事权单位档案
	 * @param poweraffairs
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/addPoweraffairs")
	public Result addPoweraffairs(BipTPoweraffairs poweraffairs) {
		try {
			poweraffairs.setFmasterid(1111);
			poweraffairs.setFcreatedate(new Date());
			poweraffairsService.insert(poweraffairs);
			return new Result(true, "添加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "添加失败");
		}
	}
}
