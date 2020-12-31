package org.emp;

import org.project.Project;

public class Employee extends Project {
	
	public void empName() {
		System.out.println("Geethanlaji");

	}
	
	public static void main(String[] args) {
		
		Employee e= new Employee();
		e.empName();
		e.projectName();
		e.companyName();
		e.clientName();
	}
	
}
