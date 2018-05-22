// Julio Collado
// working with classes. Student 
// CSC-161-03
// 3/20/18

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;

public class Classwork3202018
{
	public static void main(String[] args) throws IOException
	{
		Student student1 = new Student();
		Student student2 = new Student();

		fillStudent(student1,"Julio","Collado",19495,"juliodx10@gmail.com");
		fillStudent(student2,"Carlos","Collado",44444,"carlosmct@gmail.com");

		displayStudent(student1);
		displayStudent(student2);
	}

	public static void fillStudent(Student s, String fn, String ln, int id, String em) {
		s.setLname(ln);
		s.setFname(fn);
		s.setSid(id);
		s.setEmail(em);
	}

	public static void displayStudent(Student s) {
		System.out.println("Student Name: " + s.getLastNameFirst());
		System.out.println("Student ID: " + s.getSid());
		System.out.println("Student Email: " + s.getEmail() + "\n\n");
	}
}

