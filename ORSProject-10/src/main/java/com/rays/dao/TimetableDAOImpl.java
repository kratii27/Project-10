package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.TimetableDTO;

public class TimetableDAOImpl extends BaseDAOImpl<TimetableDTO> {
	
	@Autowired
	SubjectDAOInt subjectDAO;

	@Autowired
	CourseDAOInt courseDAO;


	@Override
	public Class<TimetableDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return TimetableDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(TimetableDTO dto, CriteriaBuilder criteriaBuilder, Root<TimetableDTO> qRoot) {
		
		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getSubjectName())) {
			conditions.add(criteriaBuilder.like(qRoot.get("subjectName"), dto.getSubjectName() + "%"));
		}
		if (!isEmptyString(dto.getCourseName())) {
			conditions.add(criteriaBuilder.like(qRoot.get("courseName"), dto.getCourseName() + "%"));
		}
		return conditions;
	}

}
