package cn.kingcai.dao;

import cn.kingcai.entity.BipTOpinionentity;
import cn.kingcai.entity.BipTOpinionentityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BipTOpinionentityMapper {
    int countByExample(BipTOpinionentityExample example);

    int deleteByExample(BipTOpinionentityExample example);

    int insert(BipTOpinionentity record);

    int insertSelective(BipTOpinionentity record);

    List<BipTOpinionentity> selectByExample(BipTOpinionentityExample example);

    int updateByExampleSelective(@Param("record") BipTOpinionentity record, @Param("example") BipTOpinionentityExample example);

    int updateByExample(@Param("record") BipTOpinionentity record, @Param("example") BipTOpinionentityExample example);
}