package cn.kingcai.dao;

import cn.kingcai.entity.BipTFocusleadership;
import cn.kingcai.entity.BipTFocusleadershipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BipTFocusleadershipMapper {
    int countByExample(BipTFocusleadershipExample example);

    int deleteByExample(BipTFocusleadershipExample example);

    int insert(BipTFocusleadership record);

    int insertSelective(BipTFocusleadership record);

    List<BipTFocusleadership> selectByExample(BipTFocusleadershipExample example);

    int updateByExampleSelective(@Param("record") BipTFocusleadership record, @Param("example") BipTFocusleadershipExample example);

    int updateByExample(@Param("record") BipTFocusleadership record, @Param("example") BipTFocusleadershipExample example);
}