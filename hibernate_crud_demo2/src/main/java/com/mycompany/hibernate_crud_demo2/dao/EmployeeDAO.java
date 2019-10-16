package com.mycompany.hibernate_crud_demo2.dao;

import java.util.List;

import com.mycompany.hibernate_crud_demo2.shared.SharedEmployee;

public interface EmployeeDAO {

	public void createEmployee(SharedEmployee sEmployee);

	public List<SharedEmployee> getAllEmployee();

	public SharedEmployee findById(int id);

	public void findByCustomId(String customId);

	public void deleteEmployee(int id);
	public void updateEmployee(int id);

}