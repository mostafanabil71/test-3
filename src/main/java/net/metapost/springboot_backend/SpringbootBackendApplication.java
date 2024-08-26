package net.metapost.springboot_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.metapost.springboot_backend.entity.Employee;
import net.metapost.springboot_backend.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		Employee employee1 = Employee.builder()
				.firstName("mostafa")
				.lastName("nabil")
				.email("mn@gmail.com")
				.build();

		Employee employee2 = Employee.builder()
				.firstName("mohamed")
				.lastName("basha")
				.email("mn@gmail.com")
				.build();

		Employee employee3 = Employee.builder()
				.firstName("omar")
				.lastName("aymen")
				.email("oa@gmail.com")
				.build();

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}
}
