package pl.edu.neg.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.neg.springboot.entity.Employee;

// more about JpaRepository here: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
