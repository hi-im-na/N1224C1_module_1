package ss6_method;

import utils.enums.CheckInputLimit;
import utils.InputCommon;

public class Ex7 {


    protected static void input(Employee employee, InputCommon ic) {
        System.out.print("Ten nhan vien: ");
        employee.setName(ic.checkInputString());
        System.out.print("Tuoi: ");
        employee.setAge(ic.checkInputInt(CheckInputLimit.MIN, 18));
        System.out.print("Gioi tinh: ");
        employee.setGender(ic.checkInputString());
        System.out.print("Luong co ban: ");
        employee.setBaseSalary(ic.checkInputInt(CheckInputLimit.MIN, 0));
        System.out.print("Diem trung binh: ");
        employee.setGpa(ic.checkInputDouble(CheckInputLimit.MIN, 0));
    }

    protected static void display(Employee employee) {
        System.out.println(" ----------------- ");
        System.out.println("Ten nhan vien: " + employee.getName());
        System.out.println("Tuoi: " + employee.getAge());
        System.out.println("Gioi tinh: " + employee.getGender());
        System.out.println("Luong co ban: " + employee.getBaseSalary());
        System.out.println("Diem trung binh: " + employee.getGpa());
    }

    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so n: ");
            int n = ic.checkInputInt(CheckInputLimit.MAX, 5);

            Employee[] employees = new Employee[n];
            for (int i = 0; i < n; i++) {
                employees[i] = new Employee();
                System.out.println("Nhap thong tin nhan vien thu " + (i + 1) + ":");
                input(employees[i], ic);
            }

            for (Employee i : employees) {
                display(i);
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    protected static class Employee {
        private String name;
        private int age;
        private String gender;
        private int baseSalary;
        private double gpa;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getBaseSalary() {
            return baseSalary;
        }

        public void setBaseSalary(int baseSalary) {
            this.baseSalary = baseSalary;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }
    }
}
