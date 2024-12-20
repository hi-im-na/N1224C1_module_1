package ss6_method;

import utils.CheckInputType;
import utils.InputCommon;

import static ss6_method.Ex7.*;

public class Ex8 {


    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so n: ");
            int n = ic.checkInputInt(CheckInputType.MAX, 5);

            Employee[] employees = new Employee[n];
            for (int i = 1; i <= n; i++) {
                employees[i] = new Employee();
                System.out.println("Nhap thong tin nhan vien thu " + i + ":");
                input(employees[i], ic);

                // nhap tiep hay khong
                boolean isContinue = true;
                while (isContinue) {
                    System.out.println("Ban co muon nhap nhan vien tiep theo khong? (Yes/No)");
                    String choice = ic.checkInputString();
                    if (choice.equalsIgnoreCase("no")) {
                        isContinue = false;
                    } else if (choice.equalsIgnoreCase("yes")) {
                        break;
                    } else {
                        System.out.println("Chi duoc nhap 'yes' hoac 'no'");
                    }
                }
                if (!isContinue) {
                    n = i;  // so nhan vien da nhap
                    break;
                }
            }

            for (int i = 1; i <= n; i++) {
                System.out.println(" ----------------- ");
                display(employees[i]);
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
