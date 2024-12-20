package ss7_debug_string;

public class Ex2 {

    public static void main(String[] args) {
        String str = "123";
        int strToInt = Integer.parseInt(str);
        String intToStr = Integer.toString(strToInt);
        long strToLong = Long.parseLong(intToStr);
        String longToStr = Long.toString(strToLong);
        float strToFloat = Float.parseFloat(longToStr);
        String floatToStr = Float.toString(strToFloat);
        double strToDouble = Double.parseDouble(floatToStr);
        String doubleToStr = Double.toString(strToDouble);
        short strToShort = Short.parseShort(str);
        String shortToStr = Short.toString(strToShort);
    }
}
