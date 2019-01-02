package cn.kingcai.realm;

import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import cn.kingcai.entity.TSecUser;
import cn.kingcai.service.UserService;

public class MyRealm extends AuthorizingRealm {

	@Autowired
	private UserService userService;

	/**
	 * 授权的方法
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		//获取用户
		String userName = (String) principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		//从数据库查找用户的角色
		Set<String> roles = userService.getRoles(userName);
		Set<String> permissions = userService.getPermission(userName);
		//为当前用户赋予对应的权限和角色
		info.setRoles(roles);
		info.setStringPermissions(permissions);
		return info;
	}

	/**
	 * 认证的方法
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//获取用户名
		String username = (String) token.getPrincipal();
		//从数据库查找用户信息
		TSecUser user = userService.getByUsername(username);
		if (user == null) {
			return null;
		}
		AuthenticationInfo info = new SimpleAuthenticationInfo(user.getFname(), user.getFpassword(), getName());
		return info;
	}

}
