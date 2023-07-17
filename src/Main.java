import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x; // x val - 
        double y; // y val 
        double z; // hypotenus

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side of x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side of y: ");
        y = scanner.nextDouble();
        
        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenus is : " + z);
    }
}