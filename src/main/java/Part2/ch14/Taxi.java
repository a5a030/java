package Part2.ch14;

public class Taxi {
    int money;
    String taxiCorpName;

    public Taxi(String taxiCorpName) {
        this.taxiCorpName=taxiCorpName;
    }

    public void take(int money) {
        this.money += money;
    }

    public void showTaxiInfo() {
        System.out.println(taxiCorpName+"택시 수입은 "+money+"원입니다.");
    }
}
