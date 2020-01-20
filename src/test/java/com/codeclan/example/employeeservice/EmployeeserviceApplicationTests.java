package com.codeclan.example.employeeservice;

import com.codeclan.example.employeeservice.models.Employee;
import com.codeclan.example.employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {


	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void canCreateEmployee(){
		Employee employee = new Employee("George", 52, 5256, "Georgina@g.com" );
		employeeRepository.save(employee);
	}

}
