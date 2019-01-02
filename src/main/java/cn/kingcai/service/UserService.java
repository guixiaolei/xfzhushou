package cn.kingcai.service;

import java.util.Set;

import cn.kingcai.entity.TSecUser;
import cn.kingcai.entity.TSecUserWithBLOBs;

public interface UserService {
	public TSecUser getByUsername(String username);

	public Set<String> getRoles(String username);

	public Set<String> getPermission(String username);

	/**
	 * 注册
	 * @param record
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	int insertSelective(TSecUserWithBLOBs record);

	/**
	 * 根据entryid查询用户名
	 */
	public String selectUsernameByid(Integer id);
}
