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

import cn.kingcai.entity.CustEventmessage;
import cn.kingcai.entity.PageResult;
import cn.kingcai.entity.Peopleentry;
import cn.kingcai.entity.Result;
import cn.kingcai.service.TownRegisterService;

/**
 * 大厅登记
 * @author volcano
 *
 */
@CrossOrigin
@RestController
@RequestMapping("/townRegister")
public class TownRegisterController {
	@Autowired
	private TownRegisterService townRegisterService;
	
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
			if (cookie.getName().equals("townFid")) {
				return cookie.getValue();
			}
		}
		uuid = UUID.randomUUID().toString().replaceAll("-", "");
		Cookie cookie = new Cookie("townFid", uuid);
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
	public void deleteFid(HttpServletRequest request, HttpServletResponse response) {
		Cookie cookie = new Cookie("townFid", null);
		cookie.setMaxAge(0);
		response.addCookie(cookie);
	}

	/**
	 * 保存到信访人信息列表(单据体)
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/saveToBody")
	public Result saveToBody(Peopleentry peopleentry, HttpServletRequest request) {
		try {
			Cookie[] cookies = request.getCookies();
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("townFid")) {
					String townFid = cookie.getValue();
					peopleentry.setFid(townFid);
				}
			}
			townRegisterService.saveToBody(peopleentry);
			return new Result(true, "保存到单据体成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "保存单据体失败");
		}
	}

	/**
	 * 显示信访人列表(单据体信息)
	 * @param fid
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/showBodyList")
	public List<Map> showBodyList(String fid) {
		List<Map> showBodyList = townRegisterService.showBodyList(fid);
		return showBodyList;
	}

	/**
	 * 保存到乡镇登记单据头
	 * @param custEventmessage
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/saveToHead")
	public Result saveTohead(CustEventmessage custEventmessage, HttpServletRequest request) {
		try {
			Cookie[] cookies = request.getCookies();
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("townFid")) {
					String townFid = cookie.getValue();
					custEventmessage.setFid(townFid);
				}
			}
			townRegisterService.saveToHead(custEventmessage);
			return new Result(true, "保存到单据头成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "保存到单据体失败");
		}
	}

	@RequestMapping("/showHeadData")
	public List<Map> showHeadData(String fid) {
		return townRegisterService.showHeadData(fid);
	}

	/**
	 * 乡镇登记列表
	 */
	@RequestMapping("/selectList")
	public PageResult selectList(int pageNum, int pageSize) {
		return townRegisterService.selectList(pageNum, pageSize);
	}


}
