package ss6_method;

import java.util.Scanner;

public class Ex6 {
    private static String name;
    private static int age;
    private static String gender;
    private static int baseSalary;
    private static double gpa;

    private static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ten nhan vien: ");
        name = scanner.next();
        System.out.print("Tuoi: ");
        age = scanner.nextInt();
        System.out.print("Gioi tinh: ");
        gender = scanner.next();
        System.out.print("Luong co ban: ");
        baseSalary = scanner.nextInt();
        System.out.print("Diem trung binh: ");
        gpa = scanner.nextDouble();
        scanner.close();
    }

    private static void display() {
        System.out.println("Ten nhan vien: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Gioi tinh: " + gender);
        System.out.println("Luong co ban: " + baseSalary);
        System.out.println("Diem trung binh: " + gpa);
    }

    public static void main(String[] args) {
        input();
        System.out.println(" ----------------- ");
        display();
    }
}
