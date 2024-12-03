package senario2.directBinding.looseCoupling;

public class InspectService {

    // 기능
    public void inspect(Brake brake) {
        System.out.println("검수를 시작합니다.");
        System.out.println(brake.getIsInspected());
        brake.setInspected(true);
        System.out.println("변경되었습니다 -> " + brake.getIsInspected());
    }
}
