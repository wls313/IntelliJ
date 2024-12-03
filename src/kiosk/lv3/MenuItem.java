package kiosk.lv3;

public class MenuItem {
    //- 세부 메뉴 속성 가지는 클래스
//    - 햄버거의 이름, 가격, 설명
//        - 예시: ShackBurger, 6.9, 토마토, 양상추, 쉑소스가 토핑된 치즈버거
//        - `new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거")`
    private String burger;
    private double price;
    private String explane;

    //생성자
    public MenuItem() {

    }

    public MenuItem(String burger, double price, String explane){
        this.burger = burger;
        this.price = price;
        this.explane = explane;
    }

    //setter
    public void setMenu(String burger,double price,String explane) {
        this.burger = burger;
        this.price = price;
        this.explane = explane;
    }

    //getter
    public String getBurger() {
        return burger;
    }
    public double getPrice() {
        return price;
    }
    public String getExplane() {
        return explane;
    }
}
