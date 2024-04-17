import java.awt.geom.Point2D;

public class Test {

    public static void main(String[] args) throws Exception {

        int totalGrade = 0;
        Point2D.Double p1;
        Point2D.Double p2;

        String twentyPoints = "src/PointFiles/SmallerSet.input";
        String oneHundredPoints = "src/PointFiles/test_100.input";
        String oneThousandPoints = "src/PointFiles/test_1000.input";
        String tenThousandPoints = "src/PointFiles/test_10000.input";

        System.out.println("***************************************************************************");
        System.out.println("SmallerSet.input closest point pair is: ");
        FindClosestPointPair cp_1 = new FindClosestPointPair();
        cp_1.readFile(twentyPoints);
        cp_1.calculateClosestPointPair();
        System.out.println(cp_1.toString());

        /*******************************Calculate Grade Codes*********************************************/
        p1 = cp_1.getPoint_1();
        p2 = cp_1.getPoint_2();

        if (p1.getX() == 9.0 && p1.getY() == 12.0 && p2.getX() == 10.0 && p2.getY() == 11.0
                && cp_1.getDistance(p1, p2) == 1.4142135623730951) {
            totalGrade += 25;
        }
        /**************************************************************************************************/

        System.out.println("***************************************************************************");
        System.out.println("test_100.input closest point pair is: ");
        FindClosestPointPair cp_2 = new FindClosestPointPair();
        cp_2.readFile(oneHundredPoints);
        cp_2.calculateClosestPointPair();
        System.out.println(cp_2.toString());

        /*******************************Calculate Grade Codes*********************************************/
        p1 = cp_2.getPoint_1();
        p2 = cp_2.getPoint_2();

        if (p1.getX() == 6.541110524967436 && p1.getY() == 3.701064033027377
                && p2.getX() == 6.5432927520409905 && p2.getY() == 3.7121465506819114
                && cp_2.getDistance(p1, p2) == 0.011295322596704299) {
            totalGrade += 25;
        }
        /**************************************************************************************************/

        System.out.println("***************************************************************************");
        System.out.println("test_1000.input closest point pair is: ");
        FindClosestPointPair cp_3 = new FindClosestPointPair();
        cp_3.readFile(oneThousandPoints);
        cp_3.calculateClosestPointPair();
        System.out.println(cp_3.toString());

        /*******************************Calculate Grade Codes*********************************************/
        p1 = cp_3.getPoint_1();
        p2 = cp_3.getPoint_2();

        if (p1.getX() == -0.16428432411409055 && p1.getY() == 5.766920749003868
                && p2.getX() == -0.16122952149564718 && p2.getY() == 5.7733965944124215
                && cp_3.getDistance(p1, p2) == 0.007160195024797601) {
            totalGrade += 25;
        }
        /**************************************************************************************************/

        System.out.println("***************************************************************************");
        System.out.println("test_10000.input closest point pair is: ");
        FindClosestPointPair cp_4 = new FindClosestPointPair();
        cp_4.readFile(tenThousandPoints);
        cp_4.calculateClosestPointPair();
        System.out.println(cp_4.toString());

        /*******************************Calculate Grade Codes*********************************************/
        p1 = cp_4.getPoint_1();
        p2 = cp_4.getPoint_2();

        if (p1.getX() == -3.790324091036039 && p1.getY() == -6.87015957930339
                && p2.getX() == -3.787354406374437 && p2.getY() == -6.871700452033338
                && cp_4.getDistance(p1, p2) == 0.003345641307619692) {
            totalGrade += 25;
        }
        /**************************************************************************************************/

        System.out.println("\n*****************************************************");
        System.out.println("Total Grade is " + totalGrade);
        System.out.println("*****************************************************");
    }

}
