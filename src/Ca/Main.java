package Ca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean calculateEnded = false;

        while (!calculateEnded) {
            try {
                CalculatorApp.start();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}