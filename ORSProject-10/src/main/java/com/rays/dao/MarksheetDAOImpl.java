package com.rays.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.MarksheetDTO;

public class MarksheetDAOImpl extends BaseDAOImpl<MarksheetDTO> implements MarksheetDAOInt {

	@Override
	public Class<MarksheetDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Predicate> getWhereClause(MarksheetDTO dto, CriteriaBuilder criteriaBuilder, Root<MarksheetDTO> qRoot) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
