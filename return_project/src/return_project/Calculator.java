package return_project;

public class Calculator {
	
	int addition(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}
	
	int average(int n1, int n2, int n3) {
		
		Calculator c1 = new Calculator();
		int res = c1.addition(n1, n2, n3);
		int avg = res / 3;
		return avg;
	}

}
