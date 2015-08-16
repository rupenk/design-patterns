package org.akm.designpattern.creational.factory;

/**
 * 
 * @author anish
 *
 */
public class Employee {

	private String id;
	private String name;
	private EmployeeType type;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EmployeeType getType() {
		return type;
	}
	public void setType(EmployeeType type) {
		this.type = type;
	}

}
