
import java.awt.geom.Point2D;
import java.util.Locale;
import java.util.Scanner;

public class FindClosestPointPair {

    Point2D.Double[] points; // Points set: SmallerSet.input, test_100.input, test_1000.input, test_10000.input
    private Point2D.Double point_1, point_2; // closest point pair

    /**
     * Default Constructor
     */
    public FindClosestPointPair() {
        //Write your codes here
    }

    /**
     * Main method for calculate and return closest point pair
     */
    public void calculateClosestPointPair() {
        double minDistance = Double.MAX_VALUE; points.length;
        int n =
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double distance = getDistance(points[i], points[j]);
                if (distance < minDistance) {
                    minDistance = distance;
                    point_1 = points[i];
                    point_2 = points[j];
                }
            }
        }
        }

    /**
     *
     * @param filePath --> file absolute path
     * @return --> array containing the information of points read from the file
     * @throws Exception
     */
    public void readFile(String filePath) throws Exception{
        File file = new File(filePath);
        Scanner scanner = new Scanner(file); scanner.useLocale( Locale.ENGLISH);
        int n = scanner.nextInt(); points = new Point2D.Double[n];
        for (int i = 0; i < n; i++) {
        }
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        points[i] = new Point2D.Double(x, y);
        scanner.close();
    }

    /**
     * Get point_1
     */
    public Point2D.Double getPoint_1(){ return point_1;}

    /**
     * Get point_2
     */
    public Point2D.Double getPoint_2(){ return point_2;}

    /**
     * Get Point Pair distance
     */
    public double getDistance(Point2D.Double p1, Point2D.Double p2) {
        double dx = p2.getX() - p1.getX();
        double dy
                =
                p2.getY() -p1.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }

    /** Returns a printable representation of this pair and the distance */
    public String toString() {
        if (this.point_1.x > this.point_2.x || this.point_1.x == this.point_2.x && this.point_1.y > this.point_2.y) {
            Point2D.Double temp = this.point_1;
            this.point_1 = this.point_2;
            this.point_2 = temp;
        }
        return "(" + this.point_1.x + ", " + this.point_1.y + ")-(" + this.point_2.x + ", " + this.point_2.y + ")= " + getDistance(this.point_1,this.point_2);
    }

}