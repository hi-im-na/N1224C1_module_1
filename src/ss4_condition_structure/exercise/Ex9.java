package ss4_condition_structure.exercise;

import utils.InputCommon;

public class Ex9 {
    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap ky tu (1 chu cai): ");
            char c = ic.checkInputString().charAt(0);
            if (c >= 'a' && c <= 'z') {
                System.out.println("Chuyen thanh chu hoa: "
//                        + Character.toUpperCase(c)
                                + (char) (c - 32)
                );
                return;
            }
            if (c >= 'A' && c <= 'Z') {
                System.out.println("Chuyen thanh chu thuong: "
                                + Character.toLowerCase(c)
//                        + (char) (c + 32)
                );
                return;
            }
            System.err.println("Ky tu khong hop le");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
