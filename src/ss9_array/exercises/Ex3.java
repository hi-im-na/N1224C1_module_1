package ss9_array.exercises;

import utils.enums.CheckInputLimit;
import utils.InputCommon;

import java.util.Arrays;

import static ss9_array.exercises.Ex2.*;

public class Ex3 {
    protected static int[] findEmployeeByName(String name, String[] names) {
        int[] indexes = new int[names.length];
        Arrays.fill(indexes, -1);
        int count = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].contains(name)) {
                indexes[count] = i;
                count++;
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so nhan vien muon nhap: ");
            int n = ic.checkInputInt(CheckInputLimit.MIN, 1);

            name = new String[n];
            age = new int[n];
            gender = new String[n];
            salary = new int[n];
            gpa = new double[n];

            input(n, ic);
            for (int i = 0; i < n; i++) {
                displayIthEmployee(i);
            }

            System.out.println(" ----------------- ");
            System.out.print("Nhap ten nhan vien muon tim: ");
            String nameToFind = ic.checkInputString();
            int[] indexes = findEmployeeByName(nameToFind, name);
            System.out.flush();
            System.out.println("Ket qua tim kiem: ");
            for (int index : indexes) {
                if (index == -1) {
                    break;
                }
                displayIthEmployee(index);
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
