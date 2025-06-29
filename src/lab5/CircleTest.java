package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	void testCircumference() {
		Point p1 = new Point(5,5);
		Circle c1 = new Circle(p1,3.0);
		
		assertEquals(c1.getCircumference(), 2*Math.PI*3);
	}
	
	@Test
	void testArea() {
		Point p1 = new Point(4,4);
		Circle c1 = new Circle(p1,10.0);
		
		assertEquals(c1.getArea(), Math.PI*100);
	}
	
	@Test
	void testContainsPointTrue() {
		Point p1 = new Point(4,4);
		Circle c1 = new Circle(p1,10.0);
		Point test = new Point(6,7);
		
		assertTrue(c1.containsPoint(test));
	}
	
	@Test
	void testContainsPointFalse() {
		Point p1 = new Point(6,7);
		Circle c1 = new Circle(p1,4.0);
		Point test = new Point(23,27);
		
		assertFalse(c1.containsPoint(test));
	}
	
	@Test
	void testIntersectsCircleTrue() {
		Point p1 = new Point(5,5);
		Circle c1 = new Circle(p1,3.0);
		Point p2 = new Point(8,8);
		Circle c2 = new Circle(p2,4.0);
		
		assertTrue(c1.intersectsCircle(c2));
	}
	
	@Test
	void testIntersectsCircleFalse() {
		Point p1 = new Point(15,12);
		Circle c1 = new Circle(p1,4.0);
		Point p2 = new Point(1,1);
		Circle c2 = new Circle(p2,2.0);
		
		assertFalse(c1.intersectsCircle(c2));
	}
	

}
