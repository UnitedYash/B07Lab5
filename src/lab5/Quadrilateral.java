package lab5;

public class Quadrilateral {
	Point A, B, C, D;

	public Quadrilateral(Point a, Point b, Point c, Point d) {
		this.A = a;
		this.B = b;
		this.C = c;
		this.D = d;
	}

	private boolean isRightAngle(Point a, Point b, Point c) {
		// angle at point b formed by vectors ba and bc
		double abx = a.x - b.x, aby = a.y - b.y;
		double cbx = c.x - b.x, cby = c.y - b.y;
		double dot = abx * cbx + aby * cby;
		return Math.abs(dot) < 1e-6;
	}

	public boolean isRectangle() {
		double ab = A.distance(B);
		double bc = B.distance(C);
		double cd = C.distance(D);
		double da = D.distance(A);

		boolean oppositeSidesEqual =
			Math.abs(ab - cd) < 1e-6 &&
			Math.abs(bc - da) < 1e-6;

		boolean rightAngles =
			isRightAngle(A, B, C) &&
			isRightAngle(B, C, D) &&
			isRightAngle(C, D, A) &&
			isRightAngle(D, A, B);

		return oppositeSidesEqual && rightAngles;
	}

	public boolean isSquare() {
		if (!isRectangle()) return false;

		double ab = A.distance(B);
		double bc = B.distance(C);

		return Math.abs(ab - bc) < 1e-6;
	}

	public String getType() {
		if (isSquare()) return "Square";
		if (isRectangle()) return "Rectangle";
		return "Other";
	}
}
