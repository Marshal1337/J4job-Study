package chemagin;

public class Square{
	
	public float a;
	public float b;
	public float c;

	public Square(float a, float b, float c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public float calculate(int x){
		return (float)(this.a * Math.pow(x, 2) + this.b * x + this.c);	
	}
	
	public void show(int start, int finish, int step){
		do {
			System.out.println(calculate(start));
			start = start + step;
		} while (start <= finish);
	}
}