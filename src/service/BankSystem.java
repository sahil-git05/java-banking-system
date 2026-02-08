package service;

import model.*;
import java.util.*;
public class BankSystem {
    private Map<Integer,User> users=new HashMap<>();
    private Map<Long,Account> accounts=new HashMap<>();

    public void registerUser(String name, String address, String phone, String password, double initialDeposit) {

        int userId = users.size() + 1;
        long accountNumber = 1000000000L + accounts.size();

        User user = new User(userId, name, address, phone, password);
        Account account = new Account(accountNumber, userId, initialDeposit);

        users.put(userId, user);
        accounts.put(accountNumber, account);

        System.out.println("\n✅ Registration Successful!");
        System.out.println("User ID: " + userId);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Initial Balance: ₹" + initialDeposit);
    }
}
