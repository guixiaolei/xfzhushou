package cn.kingcai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.kingcai.entity.BipTField;
import cn.kingcai.entity.PageResult;
import cn.kingcai.entity.PetitionerfileSave;
import cn.kingcai.entity.Result;
import cn.kingcai.service.FieldRegisterService;
import cn.kingcai.service.PetitionRegisterService;

/**
 * 现场登记
 * @author volcano
 *
 */
@CrossOrigin
@RestController
@RequestMapping("/fieldRegister")
public class FieldRegisterController {
	@Autowired
	private FieldRegisterService fieldRegisterService;

	@Autowired
	private PetitionRegisterService RegisterService;
	/**
	 * 保存到现场登记表
	 * @param field
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/saveToField")
	public Result save(BipTField field) {
		try {
			fieldRegisterService.saveToField(field);
			return new Result(true, "添加到现场登记成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(true, "添加到现场登记成功");
		}
	}

	/**
	 * 保存到信访人档案列表
	 */
	@RequestMapping("/saveToPetitionFile")
	public Result saveToPetitionFile(PetitionerfileSave petitionFile) {
		try {
			RegisterService.saveToPetitionerFile(petitionFile);
			return new Result(true, "添加到信访人档案成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(true, "添加到信访人档案成功");
		}
	}

	/**
	 * 查询现场登记列表
	 */
	@RequestMapping("q")
	public PageResult selectFieldList(int pageNum, int pageSize) {
		return fieldRegisterService.selectFieldList(pageNum, pageSize);
	}
}
