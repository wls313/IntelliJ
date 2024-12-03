package kiosk.lv3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List 선언 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();

        MenuItem end = new MenuItem();
        MenuItem shakeBurger = new MenuItem();
        MenuItem smokeShack = new MenuItem();
        MenuItem cheeseburger = new MenuItem();
        MenuItem hamburger = new MenuItem();

        end.setMenu("종료",0,"종료");
        shakeBurger.setMenu("ShackBurger",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        smokeShack.setMenu("SmokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        cheeseburger.setMenu("Cheeseburger",6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        hamburger.setMenu("Hamburger",5.4,"비프패티를 기반으로 야채가 들어간 기본버거");

        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입

        menuItems.add(end);
        menuItems.add(shakeBurger);
        menuItems.add(smokeShack);
        menuItems.add(cheeseburger);
        menuItems.add(hamburger);

        Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start();
    }
}
