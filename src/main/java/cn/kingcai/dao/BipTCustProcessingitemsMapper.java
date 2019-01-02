package cn.kingcai.dao;

import cn.kingcai.entity.BipTCustProcessingitems;
import cn.kingcai.entity.BipTCustProcessingitemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BipTCustProcessingitemsMapper {
    int countByExample(BipTCustProcessingitemsExample example);

    int deleteByExample(BipTCustProcessingitemsExample example);

    int insert(BipTCustProcessingitems record);

    int insertSelective(BipTCustProcessingitems record);

    List<BipTCustProcessingitems> selectByExample(BipTCustProcessingitemsExample example);

    int updateByExampleSelective(@Param("record") BipTCustProcessingitems record, @Param("example") BipTCustProcessingitemsExample example);

    int updateByExample(@Param("record") BipTCustProcessingitems record, @Param("example") BipTCustProcessingitemsExample example);
}