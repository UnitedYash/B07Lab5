package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest2 {
    @Test
    void ContainsPointOnBoundary() {
        Circle c = new Circle(new Point(0, 0), 5.0);
        Point onEdge = new Point(3, 4);
        assertTrue(c.containsPoint(onEdge));
    }

    @Test
    void ContainsPointAtCenter() {
        Circle c = new Circle(new Point(2, -3), 1.0);
        Point center = new Point(2, -3);
        assertTrue(c.containsPoint(center));
    }

    @Test
    void ZeroRadiusCase() {
        Circle c = new Circle(new Point(0, 0), 0.0);
        assertEquals(0.0, c.getArea(), 1e-9);
        assertEquals(0.0, c.getCircumference(), 1e-9);
    }

    @Test
    void IntersectsCircleTouching() {
        Circle c1 = new Circle(new Point(0, 0), 3.0);
        Circle c2 = new Circle(new Point(5, 0), 2.0);
        assertTrue(c1.intersectsCircle(c2));
    }

    @Test
    void IntersectsSelf() {
        Circle c = new Circle(new Point(1, 1), 4.2);
        assertTrue(c.intersectsCircle(c));
    }

    @Test
    void IntersectsCircleisNULL() {
        Circle c = new Circle(new Point(0, 0), 3.0);
        Point far = new Point(10, 10);
        assertFalse(c.containsPoint(far));
    }

    @Test
    void testPositiveRadiusMetrics() {
        Circle c = new Circle(new Point(0, 0), 4.0);
        assertEquals(2 * Math.PI * 4.0, c.getCircumference(), 1e-9);
        assertEquals(Math.PI * 16.0, c.getArea(), 1e-9);
    }

    @Test
    void testContainsOutsideAndNoIntersection() {
        Circle c1 = new Circle(new Point(0, 0), 3.0);
        Circle c2 = new Circle(new Point(10, 10), 1.0);
        assertFalse(c1.intersectsCircle(c2));
    }

}
