package cn.kingcai.dao;

import cn.kingcai.entity.BipTAdministeutils;
import cn.kingcai.entity.BipTAdministeutilsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BipTAdministeutilsMapper {
    int countByExample(BipTAdministeutilsExample example);

    int deleteByExample(BipTAdministeutilsExample example);

    int insert(BipTAdministeutils record);

    int insertSelective(BipTAdministeutils record);

    List<BipTAdministeutils> selectByExample(BipTAdministeutilsExample example);

    int updateByExampleSelective(@Param("record") BipTAdministeutils record, @Param("example") BipTAdministeutilsExample example);

    int updateByExample(@Param("record") BipTAdministeutils record, @Param("example") BipTAdministeutilsExample example);
}