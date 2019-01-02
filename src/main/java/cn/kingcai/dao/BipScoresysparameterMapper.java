package cn.kingcai.dao;

import cn.kingcai.entity.BipScoresysparameter;
import cn.kingcai.entity.BipScoresysparameterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BipScoresysparameterMapper {
    int countByExample(BipScoresysparameterExample example);

    int deleteByExample(BipScoresysparameterExample example);

    int insert(BipScoresysparameter record);

    int insertSelective(BipScoresysparameter record);

    List<BipScoresysparameter> selectByExample(BipScoresysparameterExample example);

    int updateByExampleSelective(@Param("record") BipScoresysparameter record, @Param("example") BipScoresysparameterExample example);

    int updateByExample(@Param("record") BipScoresysparameter record, @Param("example") BipScoresysparameterExample example);
}