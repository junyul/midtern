package com.cisc181.core;

import java.util.UUID;

public class Section extends Course {
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	public Section(){
		super();
		
	}
	public UUID getSectionID(){
    	return this.SectionID;
    }
}
