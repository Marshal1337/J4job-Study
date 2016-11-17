package chemagin;

public class Triangle {
	public Point a;
	public Point b;
	public Point c;

	public Triangle (Point a, Point b, Point c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double area() {
		double sideAB = this.a.distanceTo(b);
		double sideAC = this.a.distanceTo(c);
		double sideBC = this.b.distanceTo(c);

		if (sideAB + sideAC > sideBC && sideAB + sideBC > sideAC && sideBC + sideAC > sideAB){
			double semiperimeter = (sideAB + sideAC + sideBC) / 2;
			return Math.sqrt(semiperimeter*(semiperimeter - sideAB)*(semiperimeter - sideAC)*(semiperimeter - sideBC));
		} else {
			System.out.println("Triangle does not exist.");
			return -1.00;
		}
	}
}

