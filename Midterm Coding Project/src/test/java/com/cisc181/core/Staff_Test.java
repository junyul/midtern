package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	private static final double DELTA = 1e-3;
	static ArrayList<Staff> StaffList;
	static double sum;
	static int count;
	@BeforeClass
	public static void setup() throws PersonException {	
		StaffList = new ArrayList<>();
		Calendar c = Calendar.getInstance();
		c.set(1992, 31, 12);
		Date DOB1 = c.getTime();
		c.set(1990, 18, 01);
		Date DOB2 = c.getTime();
		c.set(1997, 18, 01);
		Date DOB3 = c.getTime();
		c.set(1999, 18, 01);
		Date DOB4 = c.getTime();
		c.set(1997, 18, 02);
		Date DOB5 = c.getTime();
		c.set(2010, 01, 01);
		Date EmployeeTime = c.getTime();
		Staff staff1 = new Staff("Joel","","Embiid",DOB1, "abc","(302)231-5542","a@gmail.com","",1,20000.00, EmployeeTime,eTitle.MS);
		Staff staff2 = new Staff("Ben", "", "Simmons", DOB2,"dfs","(302)231-5542","b@gmail.com","",2,30000.00, EmployeeTime,eTitle.MRS);
		Staff staff3 = new Staff("Jahlil", "", "Okafor", DOB3,"fefe","(203)232-2222","c@gmail.com","",3,40000.00, EmployeeTime,eTitle.MR);
		Staff staff4 = new Staff("Mike", "", "Doc", DOB4,"dfsf","(999)999-9999","d@gmail.com","",4,50000.00, EmployeeTime,eTitle.MR);
		Staff staff5 = new Staff("Stephen", "", "Curry", DOB5,"fsdfwe","(302)231-5542","e@gmail.com","",5,60000.00, EmployeeTime,eTitle.MR);
		StaffList.add(staff1);
		StaffList.add(staff2);
		StaffList.add(staff3);
		StaffList.add(staff4);
		StaffList.add(staff5);
		sum = 0.0;
		count = 0;
		for(Staff s : StaffList) {
			sum += s.getSalary();
			count ++;
		}
	
	}
	
	@Test
	public void test() throws PersonException{
		
		assertEquals(sum/count, 40000.00, DELTA);
	}	
	
	@Test
	
	public void testAgeAndPhone() throws PersonException{
		Calendar c = Calendar.getInstance();
		c.set(1092, 31, 12);
		Date DOBTEST = c.getTime();
		c.set(2010, 01, 01);
		Date EmployeeTime = c.getTime();
		Staff overAgeStff = new Staff("Joel","","Embiid",DOBTEST, "abc","(302)231-5542","a@gmail.com","",1,20000.00, EmployeeTime,eTitle.MS);
		Staff overAgeStff2 = new Staff("Joel","","Embiid",DOBTEST, "abc","33333","a@gmail.com","",1,20000.00, EmployeeTime,eTitle.MS);

		assertEquals(sum/count, 40000.00, DELTA);
	}	
}
