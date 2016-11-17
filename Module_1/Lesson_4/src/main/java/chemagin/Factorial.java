package chemagin;

public class Factorial{

	public int factorialres(int n){
		int result = n;
		do {
			result = result * (n-1);
			n--;
		} while (n > 1);

		return result;
	}
}