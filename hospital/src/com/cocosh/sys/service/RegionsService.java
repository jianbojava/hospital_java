package com.cocosh.sys.service;
 
import java.util.List;

import com.cocosh.framework.base.BaseConditionVO;
import com.cocosh.sys.model.Regions;

public interface RegionsService {
	List<Regions> queryByPId(String id);
}
