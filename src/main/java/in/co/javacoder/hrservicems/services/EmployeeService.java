package in.co.javacoder.hrservicems.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.javacoder.hrservicems.models.Employee;
import in.co.javacoder.hrservicems.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Iterable<Employee> getAll() {
		return employeeRepository.findAll();
	}
	
	public Employee getById(Integer id) {
		return employeeRepository.findById(id).get();
	}

}
