package chemagin;

public class Calculator {
	public static double result;
	private static double first;
	private static double second;
		public static void main(String[] args){
			Calculator.addSum(first, second);
			Calculator.addSub(first, second);
			Calculator.addMult(first, second);
			Calculator.addDiv(first, second);
		}
		public static void addSum(double first, double second){
			result = first + second;
			Calculator.printResult();
		}
		public static void addSub(double first, double second){
			result = first - second;	
			Calculator.printResult();
		}
		public static void addMult(double first, double second){
			result = first*second;
			Calculator.printResult();
		}
		public static void addDiv(double first, double second){
			result = first/second;
			Calculator.printResult();
		}
		public static void printResult(){
			System.out.println(result);
		}
}