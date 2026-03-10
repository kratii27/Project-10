package com.rays.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.TimetableDTO;

public class TimetableDAOImpl extends BaseDAOImpl<TimetableDTO> {

	@Override
	public Class<TimetableDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Predicate> getWhereClause(TimetableDTO dto, CriteriaBuilder criteriaBuilder, Root<TimetableDTO> qRoot) {
		// TODO Auto-generated method stub
		return null;
	}

}
