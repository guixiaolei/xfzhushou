package cn.kingcai.dao;

import cn.kingcai.entity.BipTManaegeutils;
import cn.kingcai.entity.BipTManaegeutilsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BipTManaegeutilsMapper {
    int countByExample(BipTManaegeutilsExample example);

    int deleteByExample(BipTManaegeutilsExample example);

    int insert(BipTManaegeutils record);

    int insertSelective(BipTManaegeutils record);

    List<BipTManaegeutils> selectByExample(BipTManaegeutilsExample example);

    int updateByExampleSelective(@Param("record") BipTManaegeutils record, @Param("example") BipTManaegeutilsExample example);

    int updateByExample(@Param("record") BipTManaegeutils record, @Param("example") BipTManaegeutilsExample example);
}