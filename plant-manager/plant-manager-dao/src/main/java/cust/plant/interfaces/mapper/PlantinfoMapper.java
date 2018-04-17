package cust.plant.interfaces.mapper;

import cust.plant.manager.pojo.Plantinfo;
import cust.plant.manager.pojo.PlantinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlantinfoMapper {
    int countByExample(PlantinfoExample example);

    int deleteByExample(PlantinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Plantinfo record);

    int insertSelective(Plantinfo record);

    List<Plantinfo> selectByExample(PlantinfoExample example);

    Plantinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Plantinfo record, @Param("example") PlantinfoExample example);

    int updateByExample(@Param("record") Plantinfo record, @Param("example") PlantinfoExample example);

    int updateByPrimaryKeySelective(Plantinfo record);

    int updateByPrimaryKey(Plantinfo record);
}