package return_project;

public class Test {
	
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		
		int result = c1.addition(10, 20, 30);
		System.out.println("The sum is: " + result);
		
		int avg = c1.average(10, 20, 30);
		System.out.println("The average is: " + avg);
		
	}

}
