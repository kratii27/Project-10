package com.rays.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.StudentDTO;

public class StudentDAOImpl extends BaseDAOImpl<StudentDTO> implements StudentDAOInt {

	@Override
	public Class<StudentDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Predicate> getWhereClause(StudentDTO dto, CriteriaBuilder criteriaBuilder, Root<StudentDTO> qRoot) {
		// TODO Auto-generated method stub
		return null;
	}

}
