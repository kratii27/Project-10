package com.rays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.common.UserContext;
import com.rays.dao.RoleDAOint;
import com.rays.dto.RoleDTO;

@Service
@Transactional
public class RoleServiceImpl extends BaseServiceImpl<RoleDTO, RoleDAOint> implements RoleServiceInt{

	
	@Override
	@Transactional(readOnly = true)
	public RoleDTO findByName(String value, UserContext userContext) {
		return dao.findByUniqueKey("name", value, userContext);
	}
	

}
