//

import java.util.Scanner;

public class GeometryUC4 {

    public static void check1(Integer x1, Integer y1, Integer x2, Integer y2) {
        boolean result1 = x1.equals(y1);
        System.out.println("Result is " + result1);
        boolean result2 = x2.equals(y2);
        System.out.println("Result is " + result2);
    }

    public static void check2(Integer x1, Integer y1, Integer x2, Integer y2) {
        int result3 = x1.compareTo(y1);
        System.out.println("Result is " + result3);
        int result4 = x2.compareTo(y2);
        System.out.println("Result is " + result4);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values for x1,y1,x2,y2");
        Integer x1 = scanner.nextInt();
        Integer y1 = scanner.nextInt();
        Integer x2 = scanner.nextInt();
        Integer y2 = scanner.nextInt();
        GeometryUC4.check1(x1, y1, x2, y2);
        GeometryUC4.check2(x1, y1, x2, y2);
    }
}
