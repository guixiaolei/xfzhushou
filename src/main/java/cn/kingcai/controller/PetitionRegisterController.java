package cn.kingcai.controller;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.kingcai.entity.BipTPetitionregister;
import cn.kingcai.entity.Complainantslist;
import cn.kingcai.entity.PageResult;
import cn.kingcai.entity.PetitionerfileSave;
import cn.kingcai.entity.Result;
import cn.kingcai.service.PetitionRegisterService;

/**
 * 信访登记
 * @author volcano
 *
 */
@CrossOrigin
@RestController
@RequestMapping("/register")
public class PetitionRegisterController {

	@Autowired
	private PetitionRegisterService registerService;
	
	String uuid = null;
	/**
	 * 打开大厅登记时设置联系人的fid
	 * 
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/setFid")
	public String setFid(HttpServletRequest request, HttpServletResponse response) {
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("RegisterFid")) {
				return cookie.getValue();
			}
		}
		uuid = UUID.randomUUID().toString().replaceAll("-", "");
		Cookie cookie = new Cookie("RegisterFid", uuid);
		response.addCookie(cookie);
		return uuid;
	}

	/**
	 * 关闭大厅登记时清除联系人的fid
	 * 
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/deleteFid")
	public void deleteFid(HttpServletResponse response) {
		Cookie cookie = new Cookie("RegisterFid", null);
		cookie.setMaxAge(0);
		response.addCookie(cookie);
	}

	/**
	 * 保存信访登记信息
	 * @param register
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/save")
	public Result saveRegister(BipTPetitionregister register) {
		try {

			registerService.insert(register);

			return new Result(true, "保存成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "保存出错");
		}
	}

	/**
	 * 查询政治面貌
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/findOutlook")
	public List<Map> findOutlook() {
		List<Map> outlook = registerService.findOutlook();
		return outlook;
	}

	@RequestMapping("/selectRegisterList")
	public PageResult selectRegisterList(Integer pageNum, Integer pageSize) {
		PageResult result = registerService.selectRegisterList(pageNum, pageSize);
		return result;
	}

	/**
	 * 保存到信访人列表
	 * @param complainantslist
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	 @RequestMapping("/saveToList")
	public Result saveToList(Complainantslist complainantslist) {
		try {
			registerService.saveToList(complainantslist);
			return new Result(true, "添加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "添加失败");
		}
	}

	/**
	 * 删除信访人信息
	 * @param entryId
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/deleteList")
	public Result deleteListByEntryid(String entryId) {
		try {
			long parseInt = Integer.parseInt(entryId);
			registerService.deleteListByEntryid(parseInt);
			return new Result(true, "删除成功");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return new Result(true, "删除失败");
		}
	}

	/**
	 * 显示信访人信息,单据体
	 * @param fid
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/showPetitionList")
	public List<Map> showPetitionList(String fid) {
		return registerService.showPetitionList(fid);
	}

	/**
	 * 保存到信访人档案
	 * @param file
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/saveToPetitionerFile")
	public Result saveToPetitionerFile(PetitionerfileSave file) {
		try {
			registerService.saveToPetitionerFile(file);
			return new Result(true, "保存到信访人档案成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(true, "保存到信访人档案失败");

		}
	}

	/**
	 * 修改时回显联系人数据
	 */
	@RequestMapping("/showDataList")
	public List<Map> showDataList(String fid) {
		return registerService.showDataList(fid);
	}
	

	/**
	 * 更新信息
	 */
	@RequestMapping("/updateDataList")
	public Result updateDataList(BipTPetitionregister register){
		try {
			return new Result(true, "更新成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(true, "更新失败");
		}
		
	}
}
