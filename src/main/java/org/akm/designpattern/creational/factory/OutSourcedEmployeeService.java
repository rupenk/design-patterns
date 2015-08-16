package org.akm.designpattern.creational.factory;

/**
 * 
 * @author anish
 *
 */
public class OutSourcedEmployeeService implements EmployeeService {

	public String getType() {
		return EmployeeType.OUTSOURCED.toString();
	}

	public String[] getFacilities() {
		return new String[] { "Free lunch", "Attend office events" };
	}

	public String getPayrollInfo() {
		return "Some payroll info for out sourced employee";

	}

	public String showLeave() {
		return "Showing leave previledges for out sourced employee";
	}

}
