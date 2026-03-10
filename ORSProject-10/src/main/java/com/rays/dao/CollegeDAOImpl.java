package com.rays.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CollegeDTO;

public class CollegeDAOImpl extends BaseDAOImpl<CollegeDTO> {

	@Override
	public Class<CollegeDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Predicate> getWhereClause(CollegeDTO dto, CriteriaBuilder criteriaBuilder, Root<CollegeDTO> qRoot) {
		// TODO Auto-generated method stub
		return null;
	}

}
