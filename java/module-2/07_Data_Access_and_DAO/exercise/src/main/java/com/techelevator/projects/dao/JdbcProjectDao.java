package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Project getProject(Long projectId) {

		Project project = null;
		String sqlFindProjectWithId = "SELECT * FROM project WHERE project_id = ?";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindProjectWithId, projectId);

		if (results.next()){
			project = mapRowToProject(results);
		}

		return project;
	}

	@Override
	public List<Project> getAllProjects() {

		ArrayList<Project> projects = new ArrayList<>();
		String sqlGetAllProject = "SELECT * FROM project ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetAllProject);
		while (results.next()) {
			Project project = mapRowToProject(results);
			projects.add(project);
		}
		return projects;


	}

	@Override
	public Project createProject(Project newProject) {


		String createProjectSql = "INSERT INTO project (name, from_date, to_date) " + "VALUES (?, ?, ?) RETURNING project_id";

		long projectId = jdbcTemplate.queryForObject(createProjectSql, long.class, newProject.getName(), newProject.getFromDate(), newProject.getToDate() );





		return getProject(projectId);
	}

	@Override
	public void deleteProject(Long projectId) {


		String sql = "DELETE FROM project WHERE project_id = ?";
		String sqlTwo = "DELETE FROM project_employee WHERE project_id =?";

		jdbcTemplate.update(sqlTwo, projectId);

		jdbcTemplate.update(sql, projectId);


	}


	private Project mapRowToProject(SqlRowSet results) {
		Project project = new Project();
		project.setId(results.getLong("project_id"));
		project.setName(results.getString("name"));
		if (results.getDate("from_date") != null) {
			project.setFromDate(results.getDate("from_date").toLocalDate());
		}

		if (results.getDate("to_date") != null) {
			project.setToDate(results.getDate("to_date").toLocalDate());
		}

		return project;

	}



}
