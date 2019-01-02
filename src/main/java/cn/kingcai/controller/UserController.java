package cn.kingcai.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.kingcai.entity.Result;
import cn.kingcai.entity.TSecUser;
import cn.kingcai.entity.TSecUserWithBLOBs;
import cn.kingcai.service.UserService;

/**
 * 登录,登出,注册,返回当前用户名
 * @author volcano
 *
 */
@CrossOrigin
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	/**
	 * 登录操作
	 * @param user
	 * @param request
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/login")
	public String login(TSecUser user, HttpServletRequest request) {
		//获取当前用户
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(user.getFname(), user.getFpassword());
		try {
			subject.login(token);
			request.setAttribute("user", user);
			return "redirect:/index.html";
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("user", user);
			request.setAttribute("Msg", "用户名或密码错误");
			return "demo/login.html";
		}
	}

	/**
	 * 登出操作
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/logout")
	public String logout() {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return "redirect:/demo/login.html";
	}

	/**
	 * 返回当前的用户名
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	@RequestMapping("/showName")
	public @ResponseBody String showName() {
		Subject subject = SecurityUtils.getSubject();
		String loginName = (String) subject.getPrincipal();
		return loginName;
	}

	/**
	 * 注册操作
	 */
	@RequestMapping("/register")
	public @ResponseBody Result register(TSecUserWithBLOBs user) {
		try {
			userService.insertSelective(user);
			return new Result(true, "注册成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "注册失败");
		}

	}
}
