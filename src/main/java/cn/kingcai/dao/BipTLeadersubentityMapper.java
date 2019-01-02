package cn.kingcai.dao;

import cn.kingcai.entity.BipTLeadersubentity;
import cn.kingcai.entity.BipTLeadersubentityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BipTLeadersubentityMapper {
    int countByExample(BipTLeadersubentityExample example);

    int deleteByExample(BipTLeadersubentityExample example);

    int insert(BipTLeadersubentity record);

    int insertSelective(BipTLeadersubentity record);

    List<BipTLeadersubentity> selectByExampleWithBLOBs(BipTLeadersubentityExample example);

    List<BipTLeadersubentity> selectByExample(BipTLeadersubentityExample example);

    int updateByExampleSelective(@Param("record") BipTLeadersubentity record, @Param("example") BipTLeadersubentityExample example);

    int updateByExampleWithBLOBs(@Param("record") BipTLeadersubentity record, @Param("example") BipTLeadersubentityExample example);

    int updateByExample(@Param("record") BipTLeadersubentity record, @Param("example") BipTLeadersubentityExample example);
}