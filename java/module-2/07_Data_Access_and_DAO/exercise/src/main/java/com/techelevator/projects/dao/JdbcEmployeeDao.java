package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		String sqlGetEmployees = "SELECT * FROM employee";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployees);
		while (results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;

	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {

		List<Employee> employees = new ArrayList<>();

		String modifiedLastNameSearch = "%" + lastNameSearch + "%";
		String modifiedFirstNameSearch = "%" + firstNameSearch + "%";
		SqlRowSet results;

		String sqlFindEmployeeByName = "SELECT * FROM employee Where first_name ILIKE ? AND last_name ILIKE ?";
		results = jdbcTemplate.queryForRowSet(sqlFindEmployeeByName, modifiedFirstNameSearch, modifiedLastNameSearch);
		while (results.next()) {
			Employee employee = mapRowToEmployee(results);
			employees.add(employee);
		}
		return employees;


	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {

		List<Employee> employees = new ArrayList<>();
		String sqlGetEmployees = "SELECT * FROM employee JOIN  WHERE project_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployees, projectId); //join w employee
		while (results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;


	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {
		String sql = "INSERT INTO project_employee (project_id, employee_id) VALUES (?, ?);";
		jdbcTemplate.update(sql, projectId, employeeId);
	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {

		String sql = "DELETE FROM project_employee WHERE employee_id = ? AND project_id = ?;";
		jdbcTemplate.update(sql, employeeId, projectId);

	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		return new ArrayList<>();
	}


	private Employee mapRowToEmployee(SqlRowSet results) {
		Employee employee = new Employee();
		employee.setDepartmentId(results.getLong("department_id"));
		employee.setId(results.getLong("employee_id"));
		employee.setFirstName(results.getString("first_name"));
		employee.setLastName(results.getString("last_name"));
		employee.setBirthDate(results.getDate("birth_date").toLocalDate());
		employee.setHireDate(results.getDate("hire_date").toLocalDate());
		return employee;
	}


}
