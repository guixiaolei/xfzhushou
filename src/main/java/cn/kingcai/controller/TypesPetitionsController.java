package cn.kingcai.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.kingcai.entity.BipTTypespetitions;
import cn.kingcai.entity.Result;
import cn.kingcai.service.TypesPetitionsService;

/**
 * 上访类型	
 * @author volcano
 *
 */
@CrossOrigin
@RestController
@RequestMapping("/typesPetitions")
public class TypesPetitionsController {
	@Autowired
	private TypesPetitionsService typesPetitionsService;

	/**
	 * 新增信访类型
	 * @param record
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/save")
	public Result saveTypesPetitions(BipTTypespetitions record) {
		try {
			record.setFmasterid(1111);
			record.setFcreatedate(new Date());
			typesPetitionsService.insert(record);
			return new Result(true, "新增成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}

	/**
	 * 查询上访类型列表
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/findAll")
	public List<Map> findAll() {
		List<Map> typesList = typesPetitionsService.selectTypes();
		return typesList;
	}

	/**
	 * 删除上访类型
	 */
	@RequestMapping("/delete")
	public void delete(String[] fnumber) {
		for (String number : fnumber) {
			typesPetitionsService.delete(number);
		}
	}

	/**
	 * 修改上访类型
	 */
	@RequestMapping("/update")
	public Result update(BipTTypespetitions typespetition) {
		try {
			typespetition.setFmodifydate(new Date());
			typesPetitionsService.update(typespetition);
			return new Result(true, "更新成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "更新失败");
		}
	}
}
