package org.akm.designpattern.creational.factory;

/**
 * 
 * @author anish
 *
 */
public class PayrollService {

	public void calculatePayroll(Employee employee){
		EmployeeService employeeService = ServiceFactory.getEmployeeService(employee.getType());
		System.out.println(employeeService.getPayrollInfo());
	}
	
}
