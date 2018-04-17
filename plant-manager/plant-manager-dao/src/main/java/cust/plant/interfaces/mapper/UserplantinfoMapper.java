package cust.plant.interfaces.mapper;

import cust.plant.manager.pojo.Userplantinfo;
import cust.plant.manager.pojo.UserplantinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserplantinfoMapper {
    int countByExample(UserplantinfoExample example);

    int deleteByExample(UserplantinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userplantinfo record);

    int insertSelective(Userplantinfo record);

    List<Userplantinfo> selectByExample(UserplantinfoExample example);

    Userplantinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userplantinfo record, @Param("example") UserplantinfoExample example);

    int updateByExample(@Param("record") Userplantinfo record, @Param("example") UserplantinfoExample example);

    int updateByPrimaryKeySelective(Userplantinfo record);

    int updateByPrimaryKey(Userplantinfo record);
}