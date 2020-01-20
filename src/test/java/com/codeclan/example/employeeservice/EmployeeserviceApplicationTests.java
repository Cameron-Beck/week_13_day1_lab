package com.codeclan.example.employeeservice;

import com.codeclan.example.employeeservice.models.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void canCreatePirate(){
		Employee employee = new Employee("George", 52, 5256, "Georgina@g.com" );
	}

}
