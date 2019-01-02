package cn.kingcai.dao;

import cn.kingcai.entity.BipTLeader;
import cn.kingcai.entity.BipTLeaderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BipTLeaderMapper {
    int countByExample(BipTLeaderExample example);

    int deleteByExample(BipTLeaderExample example);

    int insert(BipTLeader record);

    int insertSelective(BipTLeader record);

    List<BipTLeader> selectByExample(BipTLeaderExample example);

    int updateByExampleSelective(@Param("record") BipTLeader record, @Param("example") BipTLeaderExample example);

    int updateByExample(@Param("record") BipTLeader record, @Param("example") BipTLeaderExample example);
}