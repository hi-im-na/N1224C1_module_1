package ss5_loop.exercise;

public class Ex23 {
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            int secondDigit = i % 10;
            int firstDigit = i / 10;
            if (secondDigit * firstDigit == 2 * (secondDigit + firstDigit)) {
                System.out.println(i);
            }
        }
    }
}
