import static org.junit.Assert.*;

import org.junit.Test;


public class ExercicioProvaTest {

	// For a line be valid the points A and B must be different points
	@Test
	public void aLineMustBeValid() {
		Linha2D line1 = new Linha2D();
		
		line1.setX1(1);
		line1.setY1(2);
		line1.setX2(3);
		line1.setY2(4);
				
		assertEquals("A and B are different", line1.verifyIfTwoPointsOfALineAreDifferent(), true);
		
		line1.setX1(1);
		line1.setY1(1);
		line1.setX2(1);
		line1.setY2(4);
		
		assertEquals("A and B are different", line1.verifyIfTwoPointsOfALineAreDifferent(), true);
		
		line1.setX1(1);
		line1.setY1(1);
		line1.setX2(1);
		line1.setY2(1);
		
		assertEquals("A and B are equal", line1.verifyIfTwoPointsOfALineAreDifferent(), false);
		
		line1.setX1(1);
		line1.setY1(1);
		line1.setX2(4);
		line1.setY2(1);
		
		assertEquals("A and B are different", line1.verifyIfTwoPointsOfALineAreDifferent(), true);
	}
	
	// For a line be valid the points A and B must be different points
	@Test
	public void bothLinesMustBeValid() {
		Linha2D line1 = new Linha2D();
		Linha2D line2 = new Linha2D();
		
		line1.setX1(1);
		line1.setY1(2);
		line1.setX2(3);
		line1.setY2(4);
		
		line2.setX1(5);
		line2.setY1(4);
		line2.setX2(3);
		line2.setY2(2);
		
		assertEquals("Both of line 1 and 2 are valid", line1.verifyIfTwoLinesAreValid(line2), true);
		
		line1.setX1(1);
		line1.setY1(2);
		line1.setX2(3);
		line1.setY2(4);
		
		line2.setX1(2);
		line2.setY1(2);
		line2.setX2(2);
		line2.setY2(2);
		
		assertEquals("One of the lines are not valid", line1.verifyIfTwoLinesAreValid(line2), false);		
	}
	
	@Test 
	public void bothLinesMustIntersect(){
		Linha2D line1 = new Linha2D();
		Linha2D line2 = new Linha2D();
		
		line1.setX1(1);
		line1.setY1(1);
		line1.setX2(4);
		line1.setY2(4);
		
		line2.setX1(4);
		line2.setY1(1);
		line2.setX2(1);
		line2.setY2(4);

		assertEquals("Lines intersect", line1.verifyIfTwoLinesIntersectEachOne(line2), true);
		
		line1.setX1(1);
		line1.setY1(1);
		line1.setX2(4);
		line1.setY2(4);
		
		line2.setX1(2);
		line2.setY1(1);
		line2.setX2(4);
		line2.setY2(3);

		assertEquals("Lines intersect", line1.verifyIfTwoLinesIntersectEachOne(line2), false);
		
		line1.setX1(1);
		line1.setY1(1);
		line1.setX2(4);
		line1.setY2(4);
		
		line2.setX1(1);
		line2.setY1(1);
		line2.setX2(4);
		line2.setY2(4);

		assertEquals("Lines intersect", line1.verifyIfTwoLinesIntersectEachOne(line2), true);	
	}
	

}
