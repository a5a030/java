package Part3.ch03;

public class VIPCustomer extends Customer {
    double salesRatio;
    private int agentID;

//    public VIPCustomer() {
//        bonusRatio=0.05;
//        salesRatio=0.1;
//        customerGrade = "VIP";
//
//        System.out.println("VIPCustomer() call");
//    }

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        bonusRatio=0.05;
        salesRatio=0.1;
        customerGrade = "VIP";

        System.out.println("VIPCustomer(int, String) call");
    }

    public int getAgentID() {
        return agentID;
    }
}
