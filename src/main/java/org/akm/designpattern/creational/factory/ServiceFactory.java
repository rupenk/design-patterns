package org.akm.designpattern.creational.factory;

/**
 * 
 * @author anish
 *
 */
public class ServiceFactory {

	/**
	 * 
	 * @param employeeType
	 * @return
	 */
	public static EmployeeService getEmployeeService(EmployeeType employeeType){
		if(employeeType.toString().equals(EmployeeType.FULL_TIME.toString())){
			return new FullTimeEmployeeService();
		}if(employeeType.toString().equals(EmployeeType.OUTSOURCED.toString())){
			return new OutSourcedEmployeeService();
		}
		return null;
	}
}
