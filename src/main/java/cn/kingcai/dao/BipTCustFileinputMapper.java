package cn.kingcai.dao;

import cn.kingcai.entity.BipTCustFileinput;
import cn.kingcai.entity.BipTCustFileinputExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BipTCustFileinputMapper {
    int countByExample(BipTCustFileinputExample example);

    int deleteByExample(BipTCustFileinputExample example);

    int insert(BipTCustFileinput record);

    int insertSelective(BipTCustFileinput record);

    List<BipTCustFileinput> selectByExample(BipTCustFileinputExample example);

    int updateByExampleSelective(@Param("record") BipTCustFileinput record, @Param("example") BipTCustFileinputExample example);

    int updateByExample(@Param("record") BipTCustFileinput record, @Param("example") BipTCustFileinputExample example);
}