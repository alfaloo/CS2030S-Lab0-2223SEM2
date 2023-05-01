import java.util.Random;

class RandomPoint extends Point {
  
  public static Random rng = new Random(1);
 
  public static void setSeed(int n) {
    rng.setSeed(n);
  }

  public RandomPoint(double minX, double maxX, double minY, double maxY) {
    super(0, 0);
    setPoint(minX, maxX, minY, maxY);
  }

  public void setPoint(double minX, double maxX, double minY, double maxY) {
    double xValue = minX + rng.nextDouble() * (maxX - minX);
    double yValue = minY + rng.nextDouble() * (maxY - minY);
    this.x = xValue;
    this.y = yValue;
  }

}
