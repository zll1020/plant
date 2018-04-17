package cust.plant.interfaces.mapper;

import cust.plant.manager.pojo.Planttype;
import cust.plant.manager.pojo.PlanttypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlanttypeMapper {
    int countByExample(PlanttypeExample example);

    int deleteByExample(PlanttypeExample example);

    int deleteByPrimaryKey(Integer typeid);

    int insert(Planttype record);

    int insertSelective(Planttype record);

    List<Planttype> selectByExample(PlanttypeExample example);

    Planttype selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") Planttype record, @Param("example") PlanttypeExample example);

    int updateByExample(@Param("record") Planttype record, @Param("example") PlanttypeExample example);

    int updateByPrimaryKeySelective(Planttype record);

    int updateByPrimaryKey(Planttype record);
}