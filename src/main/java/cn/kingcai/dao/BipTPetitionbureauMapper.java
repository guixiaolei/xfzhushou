package cn.kingcai.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.kingcai.entity.BipTPetitionbureau;
import cn.kingcai.entity.BipTPetitionbureauExample;

public interface BipTPetitionbureauMapper {

	//逆向生成
    int countByExample(BipTPetitionbureauExample example);

    int deleteByExample(BipTPetitionbureauExample example);

    int insert(BipTPetitionbureau record);

    int insertSelective(BipTPetitionbureau record);

    List<BipTPetitionbureau> selectByExample(BipTPetitionbureauExample example);

    int updateByExampleSelective(@Param("record") BipTPetitionbureau record, @Param("example") BipTPetitionbureauExample example);

    int updateByExample(@Param("record") BipTPetitionbureau record, @Param("example") BipTPetitionbureauExample example);
}