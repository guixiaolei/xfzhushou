package cn.kingcai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.kingcai.entity.PageResult;
import cn.kingcai.entity.Petitionerfile;
import cn.kingcai.entity.Result;
import cn.kingcai.service.PetitionerfileService;

/**
 * 信访人档案
 * @author volcano
 *
 */
@CrossOrigin
@RestController
@RequestMapping("/Petitionerfile")
public class PetitionerfileController {
	@Autowired
	private PetitionerfileService petitionerfileService;

	/**
	 * 信访人档案列表
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/selectPetitionerList")
	public PageResult selectPetitionerList(Integer pageNum, Integer pageSize) {
		PageResult result = petitionerfileService.selectPetitionerList(pageNum, pageSize);
		return result;
	}

	/**
	 * 根据信访人编码查找信访人信息
	 */
	@RequestMapping("/selectByNumber")
	public Petitionerfile selectByNumber(String fNumber) {
		return petitionerfileService.selectByNumber(fNumber);
	}

	/**
	 * 修改信访人档案
	 */
	@RequestMapping("/updatePetitioner")
	public Result updatePetitioner(Petitionerfile petitionerfile) {
		try {
			/*String file = Petitionerfile.getFile().getContentType();
			System.out.println(file);*/
			petitionerfile.setFmasterid(1111);
			petitionerfileService.updatePetitioner(petitionerfile);
			return new Result(true, "更新成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "更新失败");
		}
	}
}
