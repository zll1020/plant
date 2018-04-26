package cust.plant.manager.interfaces;

import java.util.List;

import cust.plant.manager.pojo.Plant;

public interface UserPlantService {
	public List<Plant> selectByPrimaryKey(Integer userID);
}
