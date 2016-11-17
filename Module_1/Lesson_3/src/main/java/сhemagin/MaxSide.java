package chemagin;

public class MaxSide{
	
	public double max(double sideAB, double sideAC, double sideBC) {
		if (sideAB > sideAC && sideAB > sideBC) {
			return sideAB;
		} else if (sideAC > sideAB && sideAC > sideBC) {
			return sideAC;
		} else {
			return sideBC;
		}
	}
}