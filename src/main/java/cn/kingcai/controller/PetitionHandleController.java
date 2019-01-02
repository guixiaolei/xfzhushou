package cn.kingcai.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.kingcai.entity.BipTComplaintmanagehead;
import cn.kingcai.entity.PageResult;
import cn.kingcai.entity.Result;
import cn.kingcai.service.PetitionHandleService;

/**
 * 信访处理
 * @author volcano
 *
 */
@CrossOrigin
@RestController
@RequestMapping("/petitionHandle")
public class PetitionHandleController {
	@Autowired
	private PetitionHandleService petitionHandleService;

	/**
	 * 信访处理列表
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/list")
	public PageResult handleList(int pageNum, int pageSize) {
		return petitionHandleService.selectHandleList(pageNum, pageSize);
	}

	/**
	 * 修改信访处理单显示信息
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/showData")
	public List<Map> showData(String billno) {
		return petitionHandleService.showData(billno);
	}

	/**
	 * 保存到信访登记单(重新设计时这些信息可以用一个字段表示)
	 * @param complaintmanagehead
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/saveToPetitionHandle")
	public Result saveToPetitionHandle(BipTComplaintmanagehead complaintmanagehead) {
		try {
			petitionHandleService.saveToPetitionHandle(complaintmanagehead);
			return new Result(true, "保存到信访处理单成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "保存到信访处理单失败");
		}
	}

	/**
	 * 知悉后更新信访处理信息
	 * @param complaintmanagehead
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/updateLearned")
	public Result updateLearned(BipTComplaintmanagehead complaintmanagehead) {
		try {
			petitionHandleService.updateLearned(complaintmanagehead);
			return new Result(true, "更新成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "更新失败");
		}
	}
}
