package cn.kingcai.dao;

import cn.kingcai.entity.BipTFocustable;
import cn.kingcai.entity.BipTFocustableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BipTFocustableMapper {
    int countByExample(BipTFocustableExample example);

    int deleteByExample(BipTFocustableExample example);

    int insert(BipTFocustable record);

    int insertSelective(BipTFocustable record);

    List<BipTFocustable> selectByExample(BipTFocustableExample example);

    int updateByExampleSelective(@Param("record") BipTFocustable record, @Param("example") BipTFocustableExample example);

    int updateByExample(@Param("record") BipTFocustable record, @Param("example") BipTFocustableExample example);
}