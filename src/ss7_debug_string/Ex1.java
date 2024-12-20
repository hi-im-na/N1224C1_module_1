package ss7_debug_string;

import utils.CheckInputType;
import utils.InputCommon;

public class Ex1 {
    public static void main(String[] args) {
        String str = "Hello World";

        String tempStr = str;

        // a
        System.out.println("Lay ra chu World: " + str.substring(6));
        tempStr = str;

        // b
        System.out.println("Thay o thanh f: " + tempStr.replace('o', 'f'));
        tempStr = str;

        //c
        System.out.println("So chu l: " + tempStr.replaceAll("[^l]+", "").length());
        tempStr = str;

        //d
        System.out.printf("Vi tri dau tien va cuoi cung cua chu l xuat hien: %d, %d\n", tempStr.indexOf('l'), tempStr.lastIndexOf('l'));
        tempStr = str;

        //e
        System.out.println("Xoa het space: " + tempStr.replaceAll("\\s+", ""));
        tempStr = str;

        //f
        System.out.println("Xoa het space o dau va cuoi: " + tempStr.trim());
        tempStr = str;

        // g
        System.out.println("Dao chuoi: " + new StringBuilder(tempStr).reverse());
        tempStr = str;

        //h
        System.out.println("Chuoi \"SQC Hello World\": " + "SQC " + tempStr);
        tempStr = str;

        //i
        System.out.println("Chuoi in hoa: " + tempStr.toUpperCase());
        tempStr = str;

        // k
        System.out.println("Chuoi in thuong: " + tempStr.toLowerCase());
        tempStr = str;

        //l
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so n: ");
            int n = ic.checkInputInt(0, tempStr.length());
            System.out.print("Nhap so m: ");
            int m = ic.checkInputInt(n, tempStr.length());
            System.out.println("Chuoi con cua S tu n den m: " + tempStr.substring(n, m));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}
