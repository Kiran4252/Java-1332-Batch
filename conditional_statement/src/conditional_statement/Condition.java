package conditional_statement;

import java.util.Scanner;

public class Condition {
	
	void checkCondition() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		if(age >= 18 && age <= 75) {
			System.out.println("You are eligible for liecence.");
		} 
		
		else if (age < 18) {
			int wait = 18 - age;
			System.out.println("You are not eligible for liecence.");
			System.out.println("You need to wait for " + wait + " years.");
		} 
		
		else {
			System.out.println("You are age bar. Not eligible for liecence.");
		}	
		
	}

}
