package Part3.ch06;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();
        Customer customerT = new Customer(10010, "Toms");
        Customer customerJ = new Customer(10011, "John");
        Customer customerK = new GoldCustomer(10012, "Ken");
        Customer customerP = new GoldCustomer(10013, "Park");
        Customer customerD = new VIPCustomer(10014, "David");

        customerList.add(customerT);
        customerList.add(customerJ);
        customerList.add(customerK);
        customerList.add(customerP);
        customerList.add(customerD);

        for(Customer customer:customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        int price=10000;

        for(Customer customer:customerList) {
            int cost = customer.calcPrice(price);

            System.out.println(customer.getCustomerName()+"님이 "+cost+"원을 지불하셨습니다.");
            System.out.println(customer.getCustomerName()+"님이 현재 보유하신 보너스 포인트는 "+customer.bonusPoint+"원입니다.");

        }
    }
}
