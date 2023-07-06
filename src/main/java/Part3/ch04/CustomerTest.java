package Part3.ch04;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "Lee");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo()+price);

        VIPCustomer customerKim = new VIPCustomer(20020, "Kim");
        customerKim.bonusPoint=10000;
        price = customerKim.calcPrice(1000);
        System.out.println(customerKim.showCustomerInfo()+price);

        Customer vc = new VIPCustomer(1111, "noname");
        vc.calcPrice(1000);
        System.out.println(vc.calcPrice(1000));
    }
}
