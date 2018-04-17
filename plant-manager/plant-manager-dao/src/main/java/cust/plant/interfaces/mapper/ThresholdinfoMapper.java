package cust.plant.interfaces.mapper;

import cust.plant.manager.pojo.Thresholdinfo;
import cust.plant.manager.pojo.ThresholdinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThresholdinfoMapper {
    int countByExample(ThresholdinfoExample example);

    int deleteByExample(ThresholdinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Thresholdinfo record);

    int insertSelective(Thresholdinfo record);

    List<Thresholdinfo> selectByExample(ThresholdinfoExample example);

    Thresholdinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Thresholdinfo record, @Param("example") ThresholdinfoExample example);

    int updateByExample(@Param("record") Thresholdinfo record, @Param("example") ThresholdinfoExample example);

    int updateByPrimaryKeySelective(Thresholdinfo record);

    int updateByPrimaryKey(Thresholdinfo record);
}