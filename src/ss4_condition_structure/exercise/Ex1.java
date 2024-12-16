package ss4_condition_structure.exercise;

public class Ex1 {
    public static void main(String[] args) {
        boolean a = true && false; // false
        boolean b = (3 > 100) || (25 % 5 == 0); // true
        boolean c = a && b; // false
        boolean d = !a || b; //true

        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
