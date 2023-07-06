package Part3.ch10;

public class ManualCar extends Car {
    @Override
    public void drive() {
        System.out.println("운전자가 운전합니다.");
        System.out.println("운전자가 핸들을 돌립니다.");
    }

    @Override
    public void stop() {
        System.out.println("장애물 앞에서 운전자가 브레이크를 밟아 정지합니다.");
    }

    @Override
    public void wiper() {

    }
}
