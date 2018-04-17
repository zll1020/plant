package cust.plant.interfaces.mapper;

import cust.plant.manager.pojo.Plant;
import cust.plant.manager.pojo.PlantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlantMapper {
    int countByExample(PlantExample example);

    int deleteByExample(PlantExample example);

    int deleteByPrimaryKey(Integer plantid);

    int insert(Plant record);

    int insertSelective(Plant record);

    List<Plant> selectByExample(PlantExample example);

    Plant selectByPrimaryKey(Integer plantid);

    int updateByExampleSelective(@Param("record") Plant record, @Param("example") PlantExample example);

    int updateByExample(@Param("record") Plant record, @Param("example") PlantExample example);

    int updateByPrimaryKeySelective(Plant record);

    int updateByPrimaryKey(Plant record);
}