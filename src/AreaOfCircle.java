import java.util.Scanner;

public class AreaOfCircle {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        double area = 0;
        int radius = in.nextInt();
        area = (Math.PI) * radius * radius;

        System.out.println ("Area is: " + area);

    }
}
