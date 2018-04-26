package cust.plant.manager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cust.plant.interfaces.mapper.PlantMapper;
import cust.plant.interfaces.mapper.UserplantinfoMapper;
import cust.plant.manager.interfaces.UserPlantService;
import cust.plant.manager.pojo.Plant;
import cust.plant.manager.pojo.Userplantinfo;
import cust.plant.manager.pojo.UserplantinfoExample;
import cust.plant.manager.pojo.UserplantinfoExample.Criteria;

@Service
public class UserPlantServiceImpl implements UserPlantService{
	@Autowired
	private UserplantinfoMapper userplantinfoMapper;
	@Autowired
	private PlantMapper plantMapper;
	@Override
	public List<Plant> selectByPrimaryKey(Integer userID) {
		UserplantinfoExample example = new UserplantinfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(userID);
		List<Userplantinfo> userPlantInfoList = userplantinfoMapper.selectByExample(example);
		List<Plant> plantList = new ArrayList<>();
		for(Userplantinfo userPlantinfo : userPlantInfoList){
			Plant plant = plantMapper.selectByPrimaryKey(userPlantinfo.getPlantid());
			plantList.add(plant);
		}
		return plantList;
	}

}
