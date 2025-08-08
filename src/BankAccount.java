public class BankAccount {
    private int custId;
    private String custName;
    private long custAccountNumber;
    private double custAccountBalance;

    //Constructors
    public BankAccount(){}
    public BankAccount(int custId, String custName, long custAccountNumber, double custAccountBalance) {
        this.custId = custId;
        this.custName = custName;
        this.custAccountNumber = custAccountNumber;
        this.custAccountBalance = custAccountBalance;
    }

    // Getters and Setters
    public int getCustId() {
        return custId;
    }
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public long getCustAccountNumber() {
        return custAccountNumber;
    }
    public double getCustAccountBalance() {
        return custAccountBalance;
    }
    public void setCustAccountBalance(double custAccountBalance) {
        this.custAccountBalance = custAccountBalance;
    }
}