package lab5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuadrilateralTest {

    @Test
    void testGetType_withSquare() {
        Point a = new Point(0, 5);
        Point b = new Point(5, 5);
        Point c = new Point(5, 0);
        Point d = new Point(0, 0);
        Quadrilateral q = new Quadrilateral(a, b, c, d);

        assertTrue(q.isRectangle());
        assertTrue(q.isSquare());
        assertEquals("Square", q.getType());
    }


    @Test
    void testGetType_withRectangle() {
        Point a = new Point(0, 5);
        Point b = new Point(8, 5);
        Point c = new Point(8, 0);
        Point d = new Point(0, 0);
        Quadrilateral q = new Quadrilateral(a, b, c, d);

        assertTrue(q.isRectangle());
        assertFalse(q.isSquare());
        assertEquals("Rectangle", q.getType());
    }


    @Test
    void testGetType_withParallelogram() {
        Point a = new Point(0, 0);
        Point b = new Point(5, 0);
        Point c = new Point(7, 3);
        Point d = new Point(2, 3);
        Quadrilateral q = new Quadrilateral(a, b, c, d);

        assertFalse(q.isRectangle());
        assertFalse(q.isSquare());
        assertEquals("Other", q.getType());
    }

    @Test
    void testGetType_withIrregularQuadrilateral() {
        Point a = new Point(0, 0);
        Point b = new Point(10, 2);
        Point c = new Point(8, 5);
        Point d = new Point(1, 4);
        Quadrilateral q = new Quadrilateral(a, b, c, d);

        assertFalse(q.isRectangle());
        assertFalse(q.isSquare());
        assertEquals("Other", q.getType());
    }


    @Test
    void testGetType_withRightTrapezoid() {
        Point a = new Point(0, 0);
        Point b = new Point(5, 0); 
        Point c = new Point(5, 3); 
        Point d = new Point(2, 3);
        Quadrilateral q = new Quadrilateral(a, b, c, d);

        assertFalse(q.isRectangle());
        assertFalse(q.isSquare());
        assertEquals("Other", q.getType());
    }


}