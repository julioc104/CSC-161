// Julio Collado
// page 396 #1 Employee Class
// CSC-161-03
// 3/28/18

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;

public class EmployeeInfoList
{
	public static void main(String[] args) throws IOException
	{
		Employee Employee1 = new Employee("Susan Meyers",47889,"Accounting","Vice President");
		Employee Employee2 = new Employee("Mark Jones",39119,"IT","Programmer");
		Employee Employee3 = new Employee("Joy Rogers",81774,"Manufacturing","Engineer");

		System.out.printf("%4s			%9s		%10s			%9s", "\n\nName","ID Number","Department","Position\n\n");
		System.out.printf("%20s","--------------------------------------------------------------------------------------------------\n\n");

		displayEmployeeInfo(Employee1);
		displayEmployeeInfo(Employee2);
		displayEmployeeInfo(Employee3);

		System.out.println();
	}

	public static void displayEmployeeInfo(Employee em) {
		System.out.printf("%-4s	        %-6d			%-9s			%-7s\n",em.getName(),em.getIdNumber(),em.getDepartment(),em.getPosition());
		System.out.println();
	}

}

