package kiosk.lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<MenuItem> menuItems;  // MenuItem을 관리하는 리스트
    private Scanner scanner;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while(true){
            //메뉴판 for문을 통한 출력
            System.out.println("[SHAKESHAKE MENU]");
            for (int i = 1; i < menuItems.size(); i++){
                MenuItem list = menuItems.get(i);
                String ShakeBurgerFilter = String.format("%-13s", list.getBurger());
                System.out.println((i) +"." + ShakeBurgerFilter + "| W " + list.getPrice() + " | " + list.getExplane());
            }
            System.out.println("0. 종료        | 종료");

            System.out.println("주문하실 메뉴의 번호를 입력해주세요. 0번 입력시 종료");

            int order = scanner.nextInt();

            //scanner를 통해 입력값을 받고 그 값에 따른 결과값을 출력
            if (order == 0){
                System.out.println("키오스크 이용을 종료합니다");
                break;
            } else if (order >= 1 && order < menuItems.size()) {
                MenuItem list = menuItems.get(order);
                System.out.println("선택하신 메뉴 : " + String.format("%-13s", list.getBurger()) +
                        "| W " + list.getPrice() + " | " + list.getExplane());
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요");
                continue;
            }
        }
    }
}