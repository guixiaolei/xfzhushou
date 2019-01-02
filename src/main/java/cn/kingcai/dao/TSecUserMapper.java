package cn.kingcai.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.kingcai.entity.TSecUser;
import cn.kingcai.entity.TSecUserExample;
import cn.kingcai.entity.TSecUserWithBLOBs;

public interface TSecUserMapper {
	//根据姓名查询user完成登录
	TSecUser getByUsername(String username);

	//逆向生成
    int countByExample(TSecUserExample example);

    int deleteByExample(TSecUserExample example);

    int insert(TSecUserWithBLOBs record);

	//注册
    int insertSelective(TSecUserWithBLOBs record);

    List<TSecUserWithBLOBs> selectByExampleWithBLOBs(TSecUserExample example);

    List<TSecUser> selectByExample(TSecUserExample example);

    int updateByExampleSelective(@Param("record") TSecUserWithBLOBs record, @Param("example") TSecUserExample example);

    int updateByExampleWithBLOBs(@Param("record") TSecUserWithBLOBs record, @Param("example") TSecUserExample example);

    int updateByExample(@Param("record") TSecUser record, @Param("example") TSecUserExample example);
}