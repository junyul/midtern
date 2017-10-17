package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	public double Grade;
	
	private Enrollment(){
		
	}
	public Enrollment(UUID StudentID, UUID SectionID){
		this.EnrollmentID = UUID.randomUUID();
	}
	public void setGrade(double grade) {
		this.Grade = grade;
	}
	public double getGrade() {
		return this.Grade;
	}
	public UUID getStudentID() {
		return this.StudentID;
	}
}
