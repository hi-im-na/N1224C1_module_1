package ss3_java_overview.exercise;

public class Ex5 {
    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {

            // input
            System.out.print("Nhap ban kinh hinh tron: ");
            double r = ic.checkInputDouble();

//            calc
            double C = 2 * Math.PI * r;
            double A = Math.PI * r * r;

            //output
            System.out.println("Chu vi hinh tron: " + C);
            System.out.println("Dien tich hinh tron: " + A);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
