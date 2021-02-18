package coreJava;

class Calc {
	
	public int add(int ... n) { // you can pass any number of values - array - {10, 15, 20, 40}
		
		int sum = 0;
		for (int i : n) {
			sum += i;
		}
		return sum;
	}
}

public class VariableArguments {
	public static void main(String[] args) {
		Calc obj = new Calc();
		System.out.println(obj.add(10, 15, 20, 40));
	}
}
