package cust.plant.interfaces.mapper;

import cust.plant.manager.pojo.Plantstatus;
import cust.plant.manager.pojo.PlantstatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlantstatusMapper {
    int countByExample(PlantstatusExample example);

    int deleteByExample(PlantstatusExample example);

    int deleteByPrimaryKey(Integer statusid);

    int insert(Plantstatus record);

    int insertSelective(Plantstatus record);

    List<Plantstatus> selectByExample(PlantstatusExample example);

    Plantstatus selectByPrimaryKey(Integer statusid);

    int updateByExampleSelective(@Param("record") Plantstatus record, @Param("example") PlantstatusExample example);

    int updateByExample(@Param("record") Plantstatus record, @Param("example") PlantstatusExample example);

    int updateByPrimaryKeySelective(Plantstatus record);

    int updateByPrimaryKey(Plantstatus record);
}