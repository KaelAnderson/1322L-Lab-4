package com.company;
import java.util.*;

public class Checking extends Account {
    public Checking(){
        super();
    }
    @Override
    void Withdrawal(float WithdrawalCashAmount) {
        if((Getaccountbal() - WithdrawalCashAmount) < 0){
            super.Withdrawal(WithdrawalCashAmount + 20);

            System.out.println("Charging an overdraft fee of $20 because account is below $0");
        }else {
            super.Withdrawal(WithdrawalCashAmount);
        }
    }

}
