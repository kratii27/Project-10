package com.rays.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.UserDTO;

public class UserDAOImpl extends BaseDAOImpl<UserDTO> implements UserDAOInt {

	@Override
	public Class<UserDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Predicate> getWhereClause(UserDTO dto, CriteriaBuilder criteriaBuilder, Root<UserDTO> qRoot) {
		// TODO Auto-generated method stub
		return null;
	}

}
