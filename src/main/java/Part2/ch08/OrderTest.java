package Part2.ch08;

public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.orderNumber="202011020003";
        order1.phoneNumber="01012345678";
        order1.orderAddress="서울시 강남구 역삼동 111-333";
        order1.orderDate="20201102";
        order1.orderTime="130258";
        order1.orderPrice=35000;
        order1.menuNumber="0003";

        System.out.println(order1.showOrderInfo());

        Order order2 = new Order("202011020003","01012345678","서울시 강남구 역삼동 111-333", "20201102", "130258", 35000, "0003");
        System.out.println(order2.showOrderInfo());
    }
}
