package org.akm.designpattern.creational.factory;

/**
 * 
 * @author anish
 *
 */
public class FullTimeEmployeeService implements EmployeeService {

	public String getType() {
		return EmployeeType.FULL_TIME.toString();
	}

	public String[] getFacilities() {
		return new String [] {"Gets PF","Gets CIT","Free lunch", "Attend office events"};
	}

	public String getPayrollInfo() {
		return "Some PF, Some CIT, ..Full time employee Payroll";
		
	}

	public String showLeave() {
		return "Have more days leave ";
	}

}
