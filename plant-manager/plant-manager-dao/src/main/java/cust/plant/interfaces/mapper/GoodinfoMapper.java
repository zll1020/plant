package cust.plant.interfaces.mapper;

import cust.plant.manager.pojo.Goodinfo;
import cust.plant.manager.pojo.GoodinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodinfoMapper {
    int countByExample(GoodinfoExample example);

    int deleteByExample(GoodinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Goodinfo record);

    int insertSelective(Goodinfo record);

    List<Goodinfo> selectByExample(GoodinfoExample example);

    Goodinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Goodinfo record, @Param("example") GoodinfoExample example);

    int updateByExample(@Param("record") Goodinfo record, @Param("example") GoodinfoExample example);

    int updateByPrimaryKeySelective(Goodinfo record);

    int updateByPrimaryKey(Goodinfo record);
}