package ss3_java_overview.exercise;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        // calc
        double totalPrice = price * quantity;
        double vat = totalPrice * 10 / 100;

        // output
        System.out.println("Ten sp: " + name);
        System.out.println("tong tien: " + totalPrice);
        System.out.println("Thue VAT phai tra: " + vat);
        sc.close();
    }
}
