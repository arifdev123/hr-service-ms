package in.co.javacoder.hrservicems.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.javacoder.hrservicems.models.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
