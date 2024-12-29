package ss12_array_list.exercise;

import utils.enums.CheckInputLimit;
import utils.InputCommon;

import java.util.*;

public class Ex1 {
    private static int countOddElements(List<Integer> a) {
        int count = 0;
        for (int i : a) {
            if (i % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    private static int sumPositiveOddElements(List<Integer> a) {
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 1 && a.get(i) > 0) {
                sum += i;
            }
        }
        return sum;
    }

    private static void findKInArray(List<Integer> a, int k) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == k) {
                System.out.print("Tim thay " + k + " tai vi tri " + i);
            }
        }
    }

    private static void displayArray(List<Integer> a) {
        for (Integer integer : a) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    private static int max(List<Integer> a) {
        int max = a.getFirst();
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) > max) {
                max = a.get(i);
            }
        }
        return max;
    }

    private static int min(List<Integer> a) {
        int min = a.getFirst();
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) < min) {
                min = a.get(i);
            }
        }
        return min;
    }

    private static int secondMax(List<Integer> a) {
        Set<Integer> set = new TreeSet<>(a);
        List<Integer> list = new ArrayList<>(set);
        return list.get(list.size() - 2);
    }

    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so phan tu cua mang: ");
            int n = ic.checkInputInt(CheckInputLimit.MIN, 1);
            List<Integer> a = new ArrayList<>();

            // a. nhap mang
            System.out.println("\n===== Nhap mang =====");
            for (int i = 0; i < n; i++) {
                System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
                a.add(ic.checkInputInt(CheckInputLimit.MIN, 0));
            }

            // b. in gia tri cac phan tu trong mang
            System.out.println("\n===== In gia tri cac phan tu trong mang =====");
            System.out.println("Cac phan tu trong mang: ");
            displayArray(a);

            // c. dem so luong phan tu le trong mang
            System.out.println("\n===== Dem so luong phan tu le trong mang =====");
            System.out.println("So luong phan tu le trong mang: " + countOddElements(a));

            // d. tinh tong do suong le cua mang
            System.out.println("\n===== Tinh tong cac phan tu le trong mang =====");
            System.out.println("Tong cac phan tu le trong mang: " + sumPositiveOddElements(a));

            // e. tim k co trong mang, neu co thi in ra vi tri cua k trong mang
            System.out.println("\n===== Tim k co trong mang, neu co thi in ra vi tri cua k trong mang =====");
            System.out.print("Nhap k: ");
            int k = ic.checkInputInt(CheckInputLimit.MIN, 0);
            findKInArray(a, k);

            // f. sap xep mang theo thu tu tang dan
            System.out.println("\n===== Sap xep mang theo thu tu tang dan =====");
            System.out.print("Mang sau khi sap xep: ");
            displayArray(a.stream().sorted().toList());

            // g. dao nguoc cac phan tu cua a
            System.out.println("\n===== Dao nguoc cac phan tu cua mang =====");
            displayArray(a.reversed());

            // h. xoa cac phan tu co gia tri x trong mang
            System.out.println("\n===== Xoa cac phan tu co gia tri x trong mang =====");
            System.out.print("Nhap x: ");
            int x = ic.checkInputInt();
            a.removeIf(i -> i == x);

            // i. chen 1 phan tu value vao vi tri index bat ki (xoa phan tu cuoi cung)
            System.out.println("\n===== Chen 1 phan tu value vao vi tri index bat ki (xoa phan tu cuoi cung) =====");
            System.out.print("Nhap vi tri index: ");
            int index = ic.checkInputInt(CheckInputLimit.MIN, 0);
            System.out.print("Nhap value: ");
            int value = ic.checkInputInt();
            a.add(index, value);

            // j. tim gia tri lon nhat va nho nhat trong mang
            System.out.println("\n===== Tim gia tri lon nhat va nho nhat trong mang =====");
            System.out.println("Gia tri lon nhat trong mang: " + max(a));
            System.out.println("Gia tri nho nhat trong mang: " + min(a));

            // k. tim gia tri lon nhi trong mang
            System.out.println("\n===== Tim gia tri lon nhi trong mang =====");
            System.out.println("Gia tri lon nhi trong mang: " + secondMax(a));

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}
