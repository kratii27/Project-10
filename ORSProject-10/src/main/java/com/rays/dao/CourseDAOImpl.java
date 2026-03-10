package com.rays.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.CourseDTO;

public class CourseDAOImpl extends BaseDAOImpl<CourseDTO> implements CourseDAOInt {

	@Override
	public Class<CourseDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Predicate> getWhereClause(CourseDTO dto, CriteriaBuilder criteriaBuilder, Root<CourseDTO> qRoot) {
		// TODO Auto-generated method stub
		return null;
	}

}
