package senario2.directBinding.looseCoupling;

public class Brake {

    //속성
    private String name;
    private boolean isInspected; // 검수 여부(true/false)

    // 생성자
    public Brake(String name) {
        this.name = name;
        this.isInspected = false;
    }

    // 게터
    public boolean getIsInspected() {
        return this.isInspected;
    }

    // 세터
    public void setInspected(boolean isInspected) {
        this.isInspected = isInspected;
    }
}
