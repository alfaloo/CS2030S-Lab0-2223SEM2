import java.util.Scanner;

/**
 * CS2030S Lab 0: Estimating Pi with Monte Carlo
 * Semester 2, 2022/23
 *
 * <p>This program takes in two command line arguments: the 
 * number of points and a random seed.  It runs the
 * Monte Carlo simulation with the given argument and print
 * out the estimated pi value.
 *
 * @author Zhiyang Lu 
 */

class Lab0 {

  static double estimatePi(int numOfPoints, int seed) {
    RandomPoint rdp = new RandomPoint(0, 1, 0, 1);
    rdp.setSeed(seed);

    Circle circ = new Circle(new Point(0.5, 0.5), 0.5);

    double inside = 0;

    for(int i = 0; i < numOfPoints; i++) {
      rdp.setPoint(0, 1, 0, 1)
      if (circ.contains(rdp)){
      	inside++;
      }
    }

    return 4.0*(inside/numOfPoints);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numOfPoints = sc.nextInt();
    int seed = sc.nextInt();

    double pi = estimatePi(numOfPoints, seed);

    System.out.println(pi);
    sc.close();
  }
}
