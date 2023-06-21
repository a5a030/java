package Part2.ch14;

public class TakeTransTest {
    public static void main(String[] args) {
        Student student1 = new Student("James", 5000);
        Student student2 = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);

        student1.takeBus(bus100);

        Subway greenSubway = new Subway(2);
        student2.takeSubway(greenSubway);

        student1.showInfo();
        student2.showInfo();

        bus100.showBusInfo();
        greenSubway.showSubwayInfo();

        bus500.showBusInfo();

        Student student3 = new Student("Edward", 20000);
        Taxi taxi = new Taxi("잘 간다 운수");
        student3.takeTaxi(taxi);
        student3.showInfo();
        taxi.showTaxiInfo();
    }
}
