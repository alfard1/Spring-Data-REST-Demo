package pl.edu.neg.springboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.edu.neg.springboot.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    private EntityManager entityManager;

    // constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {

        // query (no need to manage transactions, handled at Service layer with @Transactional)
        Query theQuery = entityManager.createQuery("from Employee");

        List<Employee> employees = theQuery.getResultList();
        return employees;
    }

    @Override
    public Employee findById(int theId) {
        Employee theEmployee = entityManager.find(Employee.class, theId);
        return theEmployee;
    }

    @Override
    public void save(Employee theEmployee) {
        Employee dbEmployee = entityManager.merge(theEmployee);

        // if id=0 then save/insert, else update with id we should get from db
        theEmployee.setId(dbEmployee.getId());
    }

    @Override
    public void deleteById(int theId) {
        Query theQuery = entityManager.createQuery("delete from Employee where id=:theEmployeeId");
        theQuery.setParameter("theEmployeeId", theId);
        theQuery.executeUpdate();
    }
}
