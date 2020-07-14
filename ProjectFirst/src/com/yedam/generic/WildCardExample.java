package com.yedam.generic;

import java.util.Arrays;

// <T>
// <?>, <? extends class>, <? super class>
//person -> worker
//		 -> student -> HighStudent
//Course<T>

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		//Course<Person>, Course<Worker>, Course<Student>, Course<HightStudent>
		System.out.println(course.getName() + "" + "수강생:"	
		+ Arrays.toString(course.getStudents()));
		//[1,2,3] => [1,2,3]
	}
	public static void registerStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "" + "수강생:"	
				+ Arrays.toString(course.getStudents()));
	}
	public static void registerWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "" + "수강생:"	
				+ Arrays.toString(course.getStudents()));
	}
	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<Person>("일반인과정", 5);
		coursePerson.add(new Person("일반인"));
		coursePerson.add(new Worker("직장인"));
		coursePerson.add(new Student("학생"));
		coursePerson.add(new HightStudent("고등학생"));
		
		Course<Worker> courseWorker = new Course<Worker>("직장인과정", 5);
		courseWorker.add(new Worker("직장인"));
		
		Course<Student> courseStudent = new Course<Student>("학생과정",5);
		courseStudent.add(new Student("학생"));
		courseStudent.add(new HightStudent("고등학생"));
		
		Course<HightStudent> courseHight = new Course<HightStudent>("고등학생과정", 5);
		courseHight.add(new HightStudent("고등학생"));
		
		// Course<?>
		registerCourse(coursePerson);
		registerCourse(courseWorker);
		registerCourse(courseStudent);
		registerCourse(courseHight);
		
		// Course<? extends class>
		registerStudent(courseStudent);
		registerStudent(courseHight);
		
		//Course<? super class>
		registerWorker(coursePerson);
		registerWorker(courseWorker);
//		registerWorker(courseStudent); -에러남
	}
 
}
