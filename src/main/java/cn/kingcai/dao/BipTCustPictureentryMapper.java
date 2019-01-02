package cn.kingcai.dao;

import cn.kingcai.entity.BipTCustPictureentry;
import cn.kingcai.entity.BipTCustPictureentryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BipTCustPictureentryMapper {
    int countByExample(BipTCustPictureentryExample example);

    int deleteByExample(BipTCustPictureentryExample example);

    int insert(BipTCustPictureentry record);

    int insertSelective(BipTCustPictureentry record);

    List<BipTCustPictureentry> selectByExample(BipTCustPictureentryExample example);

    int updateByExampleSelective(@Param("record") BipTCustPictureentry record, @Param("example") BipTCustPictureentryExample example);

    int updateByExample(@Param("record") BipTCustPictureentry record, @Param("example") BipTCustPictureentryExample example);
}