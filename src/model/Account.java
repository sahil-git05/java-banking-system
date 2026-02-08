package model;

public class Account {
    private long accountNumber;
    private int userId;
    private double balance;

    public Account(long accountNumber,int userId,double initialDeposite){
        this.accountNumber=accountNumber;
        this.userId=userId;
        this.balance=initialDeposite;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public int getUserId(){
        return userId;
    }
    public double getBalance(){
        return balance;
    }
}
