package com.rays.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.FacultyDTO;

public class FacultyDAOImpl extends BaseDAOImpl<FacultyDTO> {

	@Override
	public Class<FacultyDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Predicate> getWhereClause(FacultyDTO dto, CriteriaBuilder criteriaBuilder, Root<FacultyDTO> qRoot) {
		// TODO Auto-generated method stub
		return null;
	}

}
