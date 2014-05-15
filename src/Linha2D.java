import java.awt.geom.Line2D;

public class Linha2D {
	int x1, y1, x2, y2;

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	boolean verifyIfTwoPointsOfALineAreDifferent(){
		if((x1 == x2) && (y1 == y2))
			return false;
		else
			return true;		
	}
	
	boolean verifyIfTwoLinesAreValid(Linha2D line2){
		if (verifyIfTwoPointsOfALineAreDifferent() && line2.verifyIfTwoPointsOfALineAreDifferent())
			return true;
		else
			return false;
	}
	
	boolean verifyIfTwoLinesIntersectEachOne(Linha2D line){
		return Line2D.linesIntersect(x1, y1, x2, y2, line.getX1(), line.getY1(), line.getX2(), line.getY2());		
	}
}
	
