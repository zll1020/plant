package cust.plant.manager.interfaces;

import org.springframework.stereotype.Service;

import cust.plant.common.pojo.PlantResult;
import cust.plant.manager.pojo.EasyUIDataGridResult;
import cust.plant.manager.pojo.Plant;

@Service
public interface PlantService {
	
	public Plant selectByPrimaryKey(Integer plantID);
	
	public EasyUIDataGridResult getPlantList(Integer page,Integer rows);
	
	public PlantResult addPlant(Plant plant);
	
	public PlantResult updatePlant(Plant plant);
	
	public PlantResult deletePlant(Integer plantID);

}
