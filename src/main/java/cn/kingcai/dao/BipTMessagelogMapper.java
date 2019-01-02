package cn.kingcai.dao;

import cn.kingcai.entity.BipTMessagelog;
import cn.kingcai.entity.BipTMessagelogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BipTMessagelogMapper {
    int countByExample(BipTMessagelogExample example);

    int deleteByExample(BipTMessagelogExample example);

    int insert(BipTMessagelog record);

    int insertSelective(BipTMessagelog record);

    List<BipTMessagelog> selectByExample(BipTMessagelogExample example);

    int updateByExampleSelective(@Param("record") BipTMessagelog record, @Param("example") BipTMessagelogExample example);

    int updateByExample(@Param("record") BipTMessagelog record, @Param("example") BipTMessagelogExample example);
}