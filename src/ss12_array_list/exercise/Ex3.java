package ss12_array_list.exercise;

import utils.InputCommonV2;
import utils.enums.CheckInputLimit;
import utils.enums.GenderType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex3 {
    private static List<String> names = new ArrayList<>();
    private static List<Integer> ages = new ArrayList<>();
    private static List<GenderType> genders = new ArrayList<>();
    private static List<Double> baseSalaries = new ArrayList<>();
    private static List<Double> gpas = new ArrayList<>();

    // input an employee
    private static void input(InputCommonV2 ic) {
        System.out.print("Enter name: ");
        names.add(ic.checkInputString());
        System.out.print("Enter age: ");
        ages.add(ic.checkNumberInput(Integer.class));
        System.out.print("Enter gender : ");
        genders.add(ic.checkEnumInput(GenderType.class));
        System.out.print("Enter base salary: ");
        baseSalaries.add(ic.checkNumberInput(Double.class));
        System.out.print("Enter gpa: ");
        gpas.add(ic.checkNumberInput(Double.class, 0D, 10D));
    }

    private static void display() {
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Name: " + names.get(i));
            System.out.println("Age: " + ages.get(i));
            System.out.println("Gender:" + genders.get(i).toString().toLowerCase());
            System.out.println("Base salary: " + baseSalaries.get(i));
            System.out.println("GPA: " + gpas.get(i));
        }
    }

    private static int findHighestGpaEmployee() {
        double maxGpa = gpas.getFirst();
        int index = 0;
        for (int i = 1; i < gpas.size(); i++) {
            if (gpas.get(i) > maxGpa) {
                maxGpa = gpas.get(i);
                index = i;
            }
        }
        return index;
    }

    private static int findSecondHighestGpaEmployee() {
        int highestGpaIndex = findHighestGpaEmployee();
        double maxGpa = gpas.getFirst();
        int index = 0;
        for (int i = 1; i < gpas.size(); i++) {
            if (gpas.get(i) > maxGpa && i != highestGpaIndex) {
                maxGpa = gpas.get(i);
                index = i;
            }
        }
        return index;
    }

    private static int findEmployeeByName(String name) {
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private static List<Integer> sortEmployeeByAge(List<Integer> ages) {
        List<Integer> sortedIndexes = new ArrayList<>();
        List<Integer> tempAges = new ArrayList<>(ages);
        Collections.sort(tempAges);
        for (int i = 0; i < tempAges.size(); i++) {
            for (int j = 0; j < ages.size(); j++) {
                if (tempAges.get(i).equals(ages.get(j))) {
                    sortedIndexes.add(j);
                    break;
                }
            }
        }
        return sortedIndexes;
    }

    public static void main(String[] args) {
        try (InputCommonV2 ic = new InputCommonV2()) {
            System.out.print("Enter number of employees: ");
            int n = ic.checkNumberInput(Integer.class, CheckInputLimit.MIN, 1);
            for (int i = 0; i < n; i++) {
                input(ic);
            }
            display();

            // a1. Find the employee has the highest GPA
            System.out.println("Employee has the highest GPA: " + names.get(findHighestGpaEmployee()));
            // a2. Find the employee has the second highest GPA
            System.out.println("Employee has the second highest GPA: " + names.get(findSecondHighestGpaEmployee()));
            // b. Find the employee by name
            System.out.print("Enter name to find: ");
            String name = ic.checkInputString();
            int index = findEmployeeByName(name);
            System.out.println(index == -1 ? "Not found" : ("Employee found at index: " + index));

            // c. Sort the employee by age
            List<Integer> sortedIndexes = sortEmployeeByAge(ages);
            System.out.println("Employees sorted by age:");
            for (Integer sortedIndex : sortedIndexes) {
                System.out.println("Name: " + names.get(sortedIndex));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}