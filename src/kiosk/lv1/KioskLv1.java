package kiosk.lv1;

import java.util.Scanner;

public class KioskLv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuLv1 ShakeBurger = new MenuLv1("ShackBurger",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuLv1 SmokeShack = new MenuLv1("SmokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuLv1 Cheeseburger = new MenuLv1("Cheeseburger",6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuLv1 Hamburger = new MenuLv1("Hamburger",5.4,"비프패티를 기반으로 야채가 들어간 기본버거");
        String end = "종료";

        System.out.println("[SHAKESHAKE MENU]");
        String ShakeBurgerFilter = String.format("%-13s", ShakeBurger.getBurger());
        System.out.println("1." + ShakeBurgerFilter + "| W " + ShakeBurger.getPrice() + " | " + ShakeBurger.getExplane());

        String SmokeShackFilter = String.format("%-13s", SmokeShack.getBurger());
        System.out.println("2." + SmokeShackFilter + "| W " + SmokeShack.getPrice() + " | " + SmokeShack.getExplane());

        String CheeseburgerFilter = String.format("%-13s", Cheeseburger.getBurger());
        System.out.println("3." + CheeseburgerFilter + "| W " + Cheeseburger.getPrice() + " | " + Cheeseburger.getExplane());

        String HamburgerFilter = String.format("%-13s", Hamburger.getBurger());
        System.out.println("4." + HamburgerFilter + "| W " + Hamburger.getPrice() + " | " + Hamburger.getExplane());

        String endFilter = String.format("%-13s", end);
        System.out.println("0."+ endFilter + end);

        System.out.println("주문하실 메뉴의 번호를 입력해주십시오. 0 입력시 종료");
        int num = scanner.nextInt();

        switch (num){
            case 1:
                System.out.println("ShakeBurger 를 주문하셧습니다.");
                break;

            case 2:
                System.out.println("SmokeShack 를 주문하셧습니다.");
                break;

            case 3:
                System.out.println("Cheeseburger 를 주문하셧습니다.");
                break;

            case 4:
                System.out.println("Hamburger 를 주문하셧습니다.");
                break;

            case 0:
                System.out.println("주문을 종료합니다");
                break;

            default:
                System.out.println("숫자를 잘못 입력하셧습니다.");
        }

    }
}
