package com.demo.factorymethod.demo.coursedesign;

// Client code who needs Object
public class Demo {
	public static void main(String[] args) {
		Course hldCourse = CourseFactory.getCourse("HLD");
		Course lldCourse = CourseFactory.getCourse("LLD");
		
		assert hldCourse != null;
		
		System.out.println("HLD Modules : ");
		System.out.println(hldCourse.modules);
		
		assert lldCourse != null;
		
		System.out.println("LLD Modules : ");
		System.out.println(lldCourse.modules);
	}

}
