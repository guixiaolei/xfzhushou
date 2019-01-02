package cn.kingcai.controller;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.kingcai.service.PetitionRegisterService;

/**
 * 三级分类的选择
 * @author volcano
 *
 */
@CrossOrigin
@Controller
@RequestMapping("/class")
public class ClassController {
	@Autowired
	private PetitionRegisterService petitionRegisterService;

	/**
	 * 查询1级分类
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@Test
	@RequestMapping("/selectFirstclass")
	public @ResponseBody List<Map> selectFirstclass() {
		List<Map> firstclass = petitionRegisterService.selectFirstclass();
		return firstclass;
	}

	/**
	 * 查询二级分类
	 * @param firstclassName
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/findByFirstclassId")
	public @ResponseBody List<Map> findByFirstclassId(String fBipFirstclassify) {
		List<Map> secondCatName = petitionRegisterService.findByParentId1(fBipFirstclassify);
		return secondCatName;
	}

	/**
	 * 查询三级分类
	 * @param secondclassName
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/findBySecondclassId")
	public @ResponseBody List<Map> findBySecondclassId(String fBipSecondclassify) {
		List<Map> thirdCatName = petitionRegisterService.findByParentId2(fBipSecondclassify);
		return thirdCatName;
	}
}
