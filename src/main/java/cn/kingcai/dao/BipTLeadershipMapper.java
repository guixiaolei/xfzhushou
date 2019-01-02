package cn.kingcai.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.kingcai.entity.BipTLeadership;
import cn.kingcai.entity.BipTLeadershipExample;
import cn.kingcai.entity.Leadership;

public interface BipTLeadershipMapper {
	/**
	 * 查询关注领导列表
	 * @return
	 * @author volcano
	 * @version 1.0
	 */
	List<Leadership> selectLeadership();


	//逆向生成
    int countByExample(BipTLeadershipExample example);

    int deleteByExample(BipTLeadershipExample example);

    int insert(BipTLeadership record);

    int insertSelective(BipTLeadership record);

    List<BipTLeadership> selectByExample(BipTLeadershipExample example);

    int updateByExampleSelective(@Param("record") BipTLeadership record, @Param("example") BipTLeadershipExample example);

    int updateByExample(@Param("record") BipTLeadership record, @Param("example") BipTLeadershipExample example);
}