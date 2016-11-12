package chemagin;

public class Calculator {

	public double result;
	
	public void addSum(double first, double second){
		result = first + second;
		System.out.println(result);
	}
	public void addSub(double first, double second){
		result = first - second;	
		System.out.println(result);
	}
	public void addMult(double first, double second){
		result = first*second;
		System.out.println(result);
	}
	public void addDiv(double first, double second){
		result = first/second;
		System.out.println(result);
	}
}