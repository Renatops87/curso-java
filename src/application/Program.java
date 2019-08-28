package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = scan.nextInt();
		
		List<Employees> listEmployees =  new ArrayList<>();
		Employees e = new Employees();
		
		for(int i = 0; i < n; i++) {
			scan.nextLine();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = scan.nextInt();
			if (i > 0) {
				Employees f = listEmployees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
				if (f != null) {
					System.out.println();
					System.out.println("Invalid ID");
					System.out.println();
					i -= 1;
					continue;
				}
			}
			System.out.print("Name: ");
			String name = scan.next();
			System.out.print("Salary: ");
			double salary = scan.nextDouble();
			
			e = new Employees(id, name, salary);
			listEmployees.add(e);
			System.out.println();
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = scan.nextInt();
		Employees f = listEmployees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (f != null) {
			System.out.print("Enter the percentage: ");
			double percentage = scan.nextDouble();
			e.increaseSalary(percentage);
			
			System.out.println();
			System.out.println("List of employees: ");
			for(Employees x : listEmployees) {
				System.out.println(x.toString());
			}	
		} else {
			System.out.print("ID Not Found!");
		}
		
		scan.close();
	}

}
