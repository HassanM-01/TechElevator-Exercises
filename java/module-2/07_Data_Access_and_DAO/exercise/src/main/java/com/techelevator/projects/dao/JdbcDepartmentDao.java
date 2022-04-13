package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;

public class JdbcDepartmentDao implements DepartmentDao {
	
	private final JdbcTemplate jdbcTemplate;

	public JdbcDepartmentDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Department getDepartment(Long id) {

		Department department = null;
		String sqlFindDeptById = "SELECT department_id, name FROM department Where department_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindDeptById, id);

		if (results.next()) {
			department = mapRowToDepartment(results);
		}
		return department;


//	String sql = "SELECT " + id + " FROM department";
//		List<Department> departments = new ArrayList<>();
//
//		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
//		Department department = mapRowToDepartment(results);

		//return (Department) departments;
		//return new Department(0L, "Not Implemented Yet");
	}

	@Override
	public List<Department> getAllDepartments() {
		String sql = "SELECT department_id, name FROM department";
		List<Department> departments = new ArrayList<>();

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next()) {


			Department department = mapRowToDepartment(results);
			departments.add(department);

		}

		return departments;
	}

	@Override
	public void updateDepartment(Department updatedDepartment) {

		String sql = "UPDATE department SET name = ? WHERE department_id = ?";
		jdbcTemplate.update(sql, updatedDepartment.getName(), updatedDepartment.getId());

	}

	private Department mapRowToDepartment(SqlRowSet results){
		Department department = new Department();
		department.setId(results.getLong("department_id"));
		department.setName(results.getString("name"));

		return department;
	}


}
