package ss12_array_list.exercise;

import utils.InputCommonV2;
import utils.enums.CheckInputLimit;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    private static List<String> name = new ArrayList<>();
    private static List<Integer> age = new ArrayList<>();

    public static void input(InputCommonV2 ic, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of employee " + (i + 1) + ": ");
            name.add(ic.checkInputString());
            System.out.println("Enter age of employee " + (i + 1) + ": ");
            age.add(ic.checkNumberInput(Integer.class));
        }
    }

    public static void display(List<?> list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (InputCommonV2 ic = new InputCommonV2()) {
            System.out.print("Enter number of elements: ");
            int n = ic.checkNumberInput(Integer.class, CheckInputLimit.MIN, 1);
            input(ic, n);
            System.out.print("Name: ");
            display(name);
            System.out.print("Age: ");
            display(age);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
