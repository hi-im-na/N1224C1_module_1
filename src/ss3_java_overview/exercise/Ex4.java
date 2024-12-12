package ss3_java_overview.exercise;

import utils.InputCommon;

public class Ex4 {
    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            // input
            System.out.print("Nhập điểm thi môn Toán: ");
            double mathScore = ic.checkInputDouble();
            System.out.print("Nhập hệ số môn Toán: ");
            double mathFactor = ic.checkInputDouble();

            System.out.print("Nhập điểm thi môn Lý: ");
            double phyScore = ic.checkInputDouble();
            System.out.print("Nhập hệ số môn Lý: ");
            double phyFactor = ic.checkInputDouble();

            System.out.print("Nhập điểm thi môn Hóa: ");
            double chemScore = ic.checkInputDouble();
            System.out.print("Nhập hệ số môn Hóa: ");
            double chemFactor = ic.checkInputDouble();


            // calc
            double avgScore = (mathScore * mathFactor + phyScore * phyFactor + chemScore * chemFactor)
                    / (mathFactor + phyFactor + chemFactor);

            // output
            System.out.println("Điểm trung bình: " + avgScore);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }


    }
}
