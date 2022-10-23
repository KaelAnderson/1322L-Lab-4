package com.company;

public class Savings extends Account {
    public Savings(){
        super();
    }
    @Override
    void Withdrawal(float WithdrawalCashAmount) {
        if((Getaccountbal() - WithdrawalCashAmount) < 500){
            super.Withdrawal(WithdrawalCashAmount + 10);

            System.out.println("“Charging an overdraft fee of $10 because account is below $500”");
        }else {
            super.Withdrawal(WithdrawalCashAmount);
        }
    }

    @Override
    void Deposit(float DepositCashAmount) {
        int counter = 0;
        counter++;
        System.out.println("This is deposit " + counter + " to this account");
        if (counter <= 5){
            super.Deposit(DepositCashAmount);
        }else {
            super.Deposit(DepositCashAmount - 10);
            System.out.println("Charging a fee of $10");

        }
    }
    void interest(){
        super.Setaccountbal((float) ((Getaccountbal() * .015) + Getaccountbal()));
    }
}
