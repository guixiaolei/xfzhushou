package cn.kingcai.dao;

import java.util.Set;

import cn.kingcai.entity.User;

public interface UserDao {
	public User getByUsername(String username);

	public Set<String> getRoles(String username);

	public Set<String> getPermission(String username);

	/**
	 * 根据id查询用户名
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	String selectUsernameByid(Integer id);
}
