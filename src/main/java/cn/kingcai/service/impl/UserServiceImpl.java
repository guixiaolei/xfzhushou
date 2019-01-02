package cn.kingcai.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kingcai.dao.TSecUserMapper;
import cn.kingcai.dao.UserDao;
import cn.kingcai.entity.TSecUser;
import cn.kingcai.entity.TSecUserWithBLOBs;
import cn.kingcai.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private TSecUserMapper usermapper;

	public TSecUser getByUsername(String username) {
		return usermapper.getByUsername(username);
	}

	public Set<String> getRoles(String username) {
		return userDao.getRoles(username);
	}

	public Set<String> getPermission(String username) {
		return userDao.getPermission(username);
	}

	@Override
	public int insertSelective(TSecUserWithBLOBs record) {
		int insertSelective = usermapper.insertSelective(record);
		return insertSelective;
	}

	/**
	 * 根据用户id查询用户名
	 */
	@Override
	public String selectUsernameByid(Integer id) {
		String username = userDao.selectUsernameByid(id);
		return username;
	}

}
