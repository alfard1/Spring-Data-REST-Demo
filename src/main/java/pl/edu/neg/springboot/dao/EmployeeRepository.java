package pl.edu.neg.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.neg.springboot.entity.Employee;

// more about JpaRepository here: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
