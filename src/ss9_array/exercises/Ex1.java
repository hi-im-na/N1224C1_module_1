package ss9_array.exercises;

import java.util.Arrays;
import java.util.Scanner;

import static ss5_loop.exercise.Ex21.isPrime;

public class Ex1 {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Nhap mang gom n phan tu
     *
     * @param n so phan tu cua mang
     */
    private static int[] nhapMang(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    private static void xuatMang(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static boolean isFullEven(int[] arr) {
        for (int j : arr) {
            if (j % 2 == 1)
                return false;
        }
        return true;
    }

    private static boolean isFullPrime(int[] arr) {
        for (int i : arr) {
            if (!isPrime(i))
                return false;
        }
        return true;
    }

    private static boolean isAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    private static int countOddElements(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 1)
                count++;
        }
        return count;
    }

    private static int sumPositiveOddElement(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1 && arr[i] > 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    private static int countDiv4not5(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j % 4 == 0 && j % 5 != 0)
                count++;
        }
        return count;
    }

    private static int sumPrimeElements(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            if (isPrime(j))
                sum += j;
        }
        return sum;
    }

    private static int indexOfLastX(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    private static int indexOfFirstPrime(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]))
                return i;
        }
        return -1;
    }

    private static int minPositiveElement(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (j < min)
                min = j;
        }
        return min;
    }

    private static int[] indexesOfKElement(int[] arr, int k) {
        int[] indexes = new int[arr.length];
        Arrays.fill(indexes, -1);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                indexes[count] = i;
                count++;
            }
        }
        return indexes;
    }

    private static int[] findMaxMin(int[] arr) {
        int[] maxMin = new int[2];
        int max = arr[0];
        int min = arr[0];
        for (int j : arr) {
            if (j > max)
                max = j;
            if (j < min)
                min = j;
        }
        maxMin[0] = max;
        maxMin[1] = min;
        return maxMin;
    }

    public static void main(String[] args) {
//        int[] arr = nhapMang(5); // 1a
        int[] arr = new int[]{1, 5, 3, 4, 5}; // 1a
        xuatMang(arr); // 1b

        System.out.println("Co phai mang toan chan: " + isFullEven(arr)); // 2a
        System.out.println("Co phai mang toan so nguyen to: " + isFullPrime(arr)); // 2b
        System.out.println("Co phai tang dan: " + isAsc(arr)); // 2c
        System.out.println("So luong phan tu le: " + countOddElements(arr)); // 3a
        System.out.println("Tong so duong le: " + sumPositiveOddElement(arr)); // 3b
        System.out.println("So luong so chia het cho 4 nhung khong chia het cho 5: " + countDiv4not5(arr)); // 3c
        System.out.println("Tong cac so nguyen to: " + sumPrimeElements(arr)); // 3d
        System.out.println("Vi tri cuoi cung cua x: " + indexOfLastX(arr, 5)); // 4a
        System.out.println("Vi tri dau tien cua so nguyen to: " + indexOfFirstPrime(arr)); // 4b
        System.out.println("So duong nho nhat: " + minPositiveElement(arr)); // 4c
        int[] indexes = indexesOfKElement(arr, 5); // 4d
        System.out.print("Vi tri cua k: ");
        for (int i : indexes) {
            if (i != -1)
                System.out.print(i + " ");
        }
        System.out.println();
        int[] maxMin = findMaxMin(arr); // 4e
        System.out.println("So lon nhat: " + maxMin[0]);
        System.out.println("So nho nhat: " + maxMin[1]);
    }
}
