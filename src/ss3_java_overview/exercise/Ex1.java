package ss3_java_overview.exercise;

import java.time.Year;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year born: ");
        int yearBorn = sc.nextInt();
        int currentYear = Year.now().getValue();
        System.out.println("Current age: " + (currentYear - yearBorn));
        sc.close();
    }
}
