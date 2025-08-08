public class BankAccountServiceImpl implements BankAccountService{
    BankAccount account;

    @Override
    public double checkBalance(BankAccount account) {
        this.account = account;
        return this.account.getCustAccountBalance();
    }

    @Override
    public double withdrawAmount(BankAccount account,double amount) {
        this.account = account;
        if (amount > account.getCustAccountBalance()){
            System.out.print("Withdrawal Failed!!!:  ");
            System.out.println("Insufficient Balance!!!");
        }
        else{
            account.setCustAccountBalance(account.getCustAccountBalance() - amount);
        }
        return account.getCustAccountBalance();
    }

    @Override
    public double depositAmount(BankAccount account, double amount) {
        this.account = account;
        account.setCustAccountBalance(account.getCustAccountBalance()+amount);
        return account.getCustAccountBalance();
    }

}