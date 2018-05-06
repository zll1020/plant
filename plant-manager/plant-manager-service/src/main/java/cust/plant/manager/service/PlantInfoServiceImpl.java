package cust.plant.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cust.plant.interfaces.mapper.PlantinfoMapper;
import cust.plant.manager.interfaces.PlantInfoService;
import cust.plant.manager.pojo.Plantinfo;
import cust.plant.manager.pojo.PlantinfoExample;
import cust.plant.manager.pojo.PlantinfoExample.Criteria;

@Service
public class PlantInfoServiceImpl implements PlantInfoService{
	@Autowired
	private PlantinfoMapper plantinfoMapper;

	@Override
	public List<Plantinfo> selectByPrimaryKey(Integer plantID) {
		PlantinfoExample example = new PlantinfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andPlantidEqualTo(plantID);
		List<Plantinfo> plantInfoList = plantinfoMapper.selectByExample(example);
		System.out.println(plantInfoList);
		
		return plantInfoList;
	}

}
