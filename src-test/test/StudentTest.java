package test;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import daten.Student;

public class StudentTest 
{
	@Before
	public void setUp() throws Exception 
	{
	}

	@After
	public void tearDown() throws Exception 
	{
	}
	
	@Test
	public void testCompareTo() 
	{
		@SuppressWarnings("deprecation")
		Student student1 = new Student("Tobias","Wagner",true,new Date(1999,9,9));
		Student student2 = new Student("Thomas","Förster",false,new Date(1994,8,8));
		
		Student student3 = new Student("Thomas","Förster",false,new Date(1994,8,8));
		Student student4 = new Student("Tobias","Wagner",true,new Date(1999,9,9));		
		
		Student student5 = new Student("Tobias","Wagner",true,new Date(1999,10,10));	
		
		//Auf Gleichheit prüfen#
		if(student1.compareTo(student4) != 0)
		{
			fail("Muss 0 sein!!!");
		}
		
		if(student2.compareTo(student3) != 0)
		{
			fail("Muss 0 sein!!!");
		}
		
		//Auf Ungleichheit prüfen#
		if(student1.compareTo(student5) > 0)
		{
			fail("Kleiner 0 wäre richtig!");
		}		
		if(student1.compareTo(student5) == 0)
		{
			fail("Kleiner 0 wäre richtig!");
		}		
		
	}
}
