package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	public static ArrayList<Course> course;
	public static ArrayList<Semester> semester;
	public static ArrayList<Student> student;
	public static ArrayList<Section> section;
	public static ArrayList<Enrollment> enrollment;
	private static final double DELTA = 1e-3;


	@BeforeClass
	public static void setup() throws PersonException {
		course= new ArrayList<>();
		Course c1 = new Course();
		course.add(c1);
		Course c2 = new Course();
		course.add(c2);
		Course c3 = new Course();
		course.add(c3);
		
		semester = new ArrayList<>();
		Semester fall = new Semester();
		semester.add(fall);
		Semester spring = new Semester();
		semester.add(spring);
		
		
		student = new ArrayList<>();
		
		Calendar c = Calendar.getInstance();
		c.set(1992, 31, 12);
		Date DOB1 = c.getTime();
		
		Student s1 = new Student("","","", DOB1,eMajor.CHEM,"","","");
		Student s2 = new Student("","","", DOB1,eMajor.CHEM,"","","");
		Student s3 = new Student("","","", DOB1,eMajor.CHEM,"","","");
		Student s4 = new Student("","","", DOB1,eMajor.CHEM,"","","");
		Student s5 = new Student("","","", DOB1,eMajor.CHEM,"","","");
		Student s6 = new Student("","","", DOB1,eMajor.CHEM,"","","");
		Student s7 = new Student("","","", DOB1,eMajor.CHEM,"","","");
		Student s8 = new Student("","","", DOB1,eMajor.CHEM,"","","");
		Student s9 = new Student("","","", DOB1,eMajor.CHEM,"","","");
		Student s10 = new Student("","","", DOB1,eMajor.CHEM,"","","");
		student.add(s10);
		student.add(s9);
		student.add(s8);
		student.add(s7);
		student.add(s6);
		student.add(s5);
		student.add(s4);
		student.add(s3);
		student.add(s2);
		student.add(s1);
		
		
		Section sc1 = new Section();
		Section sc2 = new Section();
		Section sc3 = new Section();
		Section sc4 = new Section();
		Section sc5 = new Section();
		Section sc6 = new Section();
		
		section = new ArrayList<>();
		section.add(sc1);
		section.add(sc2);
		section.add(sc3);
		section.add(sc4);
		section.add(sc5);
		section.add(sc6);
		
		enrollment = new ArrayList<>();
		for (Section sc : section) {
			for (Student s : student) {
				Enrollment e1 = new Enrollment(s.getStudentID(), sc.getSectionID());
				e1.setGrade(4.0);
				enrollment.add(e1);
			}
		}
	}

	@Test
	public void testGrade() {
		double sum = 0.0;
		int count = 0;
		for(Enrollment e : enrollment) {
			sum += e.getGrade();
			count++;
		}
		assertEquals(sum/count, 4, DELTA);
	}
	@Test
	public void testGPA() {
		double sum = 0.0;
		int count = 0;
		for(Enrollment e : enrollment) {
			if(e.getStudentID().equals(student.get(0).getStudentID())){
				sum += e.getGrade();
				count++;
			}
			
		}
		assertEquals(sum/count, 4, DELTA);
	}
}