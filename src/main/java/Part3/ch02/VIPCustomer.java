package Part3.ch02;

public class VIPCustomer extends Customer {
    double salesRatio;
    private int agentID;

    public VIPCustomer() {
        bonusRatio=0.05;
        salesRatio=0.1;
        customerGrade = "VIP";

        System.out.println("VIPCustomer() call");
    }

    public int getAgentID() {
        return agentID;
    }
}
