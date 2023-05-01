/**
 * CS2030S Lab 0: Point.java
 * Semester 2, 2022/23
 *
 * <p>The Point class encapsulates a point on a 2D plane.
 *
 * @author Zhiyang Lu
 */
class Point {
  protected double x;
  protected double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }
  public String toString() {
    return "(" + this.x + ", " + this.y + ")";
  }
  public double returnx() {
    return this.x;
  }
  public double returny() {
    return this.y;
  }

}
