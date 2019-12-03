package in.co.javacoder.hrservicems.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.javacoder.hrservicems.models.Employee;
import in.co.javacoder.hrservicems.services.EmployeeService;

@RestController
@RequestMapping("/hr")
public class HrResource {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public Iterable<Employee> getEmployees() {
		return employeeService.getAll(); 
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		return employeeService.getById(id);
	}
	
}
