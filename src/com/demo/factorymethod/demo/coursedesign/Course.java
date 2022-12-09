package com.demo.factorymethod.demo.coursedesign;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {
	protected List<Module> modules = new ArrayList<>();
	
	// constructor
	public Course() {this.createCourse();}
	
	// Getter to get all modules.
	public List<Module> getModuels(){
		return modules;
	}
	
	// Abstract method , declared in parent and implemented in child class.
	public abstract void createCourse();

}
