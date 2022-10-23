package com.company;
import java.util.*;
public class Account {
    Random rand = new Random();
    private int accountnum;
    private float accountbal;
    Account(){
        accountnum = rand.nextInt(99999);
        accountbal = 0;
    }
    Account(float InputAccountBal){
        accountnum = 102384;
        accountbal = InputAccountBal;
    }
    int Getaccountnum(){
        return accountnum;
    }
    float Getaccountbal(){
        return accountbal;
    }
    void Setaccountbal(float InputAccountBal){
        accountbal = InputAccountBal;
    }
    void Withdrawal(float WithdrawalCashAmount){
        accountbal -= WithdrawalCashAmount;
    }
    void Deposit(float DepositCashAmount){
        accountbal += DepositCashAmount;
    }
}
