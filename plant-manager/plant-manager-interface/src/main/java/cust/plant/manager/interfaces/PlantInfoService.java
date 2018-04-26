package cust.plant.manager.interfaces;

import java.util.List;
import cust.plant.manager.pojo.Plantinfo;

public interface PlantInfoService {
	public List<Plantinfo> selectByPrimaryKey(Integer plantID);
}
