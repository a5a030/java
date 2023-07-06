package Part3.ch16.policy;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("현재 쉬고 있거나 상담대기가 적은 상담원에게 배분합니다.");
    }
}
