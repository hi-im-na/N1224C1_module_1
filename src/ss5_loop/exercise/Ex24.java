package ss5_loop.exercise;

import utils.CheckInputType;
import utils.InputCommon;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ex24 {


    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap gia tien mon do: ");
            int price = ic.checkInputInt(CheckInputType.MIN, 0);
            System.out.print("Nhap so tien khach tra: ");
            int payMoney = ic.checkInputInt(CheckInputType.MIN, price);


            Map<Integer, Integer> moneyMap = new LinkedHashMap<>();
            moneyMap.put(500, 0);
            moneyMap.put(200, 0);
            moneyMap.put(100, 0);
            moneyMap.put(50, 0);
            moneyMap.put(20, 0);
            moneyMap.put(10, 0);
            moneyMap.put(5, 0);
            moneyMap.put(2, 0);
            moneyMap.put(1, 0);

            int changeMoney = payMoney - price;
            for (int j : moneyMap.keySet()) {
                while (changeMoney >= j * 1000) {
                    moneyMap.put(j, moneyMap.get(j) + 1);
                    changeMoney -= j * 1000;
                }
            }

            System.out.println("So to tien can tra la: ");
            for (int j : moneyMap.keySet()) {
                if (moneyMap.get(j) > 0) {
                    System.out.println(j + "k: " + moneyMap.get(j));
                }
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
