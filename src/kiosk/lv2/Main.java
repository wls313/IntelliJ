package kiosk.lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // List 선언 및 초기화
        List<MenuItem> item = new ArrayList<MenuItem>();

        MenuItem shakeBurger = new MenuItem();
        MenuItem smokeShack = new MenuItem();
        MenuItem cheeseburger = new MenuItem();
        MenuItem hamburger = new MenuItem();

        shakeBurger.setMenu("ShackBurger",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        smokeShack.setMenu("SmokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        cheeseburger.setMenu("Cheeseburger",6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        hamburger.setMenu("Hamburger",5.4,"비프패티를 기반으로 야채가 들어간 기본버거");

        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        item.add(shakeBurger);
        item.add(smokeShack);
        item.add(cheeseburger);
        item.add(hamburger);
        // Scanner 선언
        Scanner sc = new Scanner(System.in);
        System.out.println("[SHAKESHAKE MENU]");
        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        for (int i = 0; i < item.size(); i++){
            MenuItem list = item.get(i);
            String ShakeBurgerFilter = String.format("%-13s", list.getBurger());
            System.out.println((i+1) +"." + ShakeBurgerFilter + "| W " + list.getPrice() + " | " + list.getExplane());
        }
        System.out.println("주문하실 메뉴의 번호를 입력해주십시오. 0 입력시 종료");

        // 숫자를 입력 받기
        int order = sc.nextInt();

        // 입력된 숫자에 따른 처리
        switch (order){
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

        // 프로그램을 종료
        sc.close();

        // 선택한 메뉴 : 이름, 가격, 설명 <--- ??? 뭔소리지?
    }
}
