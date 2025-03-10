package Base_Concepts;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double areaCircle  = 3.1416 * radius * radius;
        System.out.println("Area Of Circle :- " +areaCircle);

        sc.close();

    }
}
