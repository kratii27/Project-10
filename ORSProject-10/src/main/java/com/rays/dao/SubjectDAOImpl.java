package com.rays.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SubjectDTO;

public class SubjectDAOImpl extends BaseDAOImpl<SubjectDTO> {

	@Override
	public Class<SubjectDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Predicate> getWhereClause(SubjectDTO dto, CriteriaBuilder criteriaBuilder, Root<SubjectDTO> qRoot) {
		// TODO Auto-generated method stub
		return null;
	}

}
