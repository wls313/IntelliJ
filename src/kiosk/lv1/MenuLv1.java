package kiosk.lv1;

public class MenuLv1 {
    // 속성
    private String burger;
    private double price;
    private String explane;

    //생성자

    public MenuLv1(String burger, double price, String explane){
        this.burger = burger;
        this.price = price;
        this.explane = explane;
    }

    /**
     * getter
     * 메뉴명,가격,설명을 리턴합니다
     * @return 설명,가격,버거명
     */
    public String getExplane() {
        return explane;
    }

    public double getPrice() {
        return price;
    }

    public String getBurger() {
        return burger;
    }


    public void setExplane(String explane) {
        this.explane = explane;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBurger(String burger) {
        this.burger = burger;
    }
}
