package Part3.ch03;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "Lee");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(20020, "Kim");
        customerKim.bonusPoint=10000;
        System.out.println(customerKim.showCustomerInfo());

        Customer vc = new VIPCustomer(1111, "noname");
        System.out.println(vc.showCustomerInfo());
    }
}
