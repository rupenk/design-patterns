package org.akm.designpattern.creational.factory;

/**
 * 
 * @author anish
 *
 */
public class LeaveService {

	public void calculateLeave(Employee employee){
		EmployeeService employeeService = ServiceFactory.getEmployeeService(employee.getType());
		System.out.println(employeeService.showLeave());
	}
}
