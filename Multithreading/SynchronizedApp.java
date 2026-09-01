package Multithreading;

import java.util.*;

class ExceptDeposit extends Thread
{
    int current_balance;
    int deposit_amount;

    public void run()
    {
        System.out.println("Balance after deposit: " + CurrentAmount());
    }

    public void setCurrentBalance(int current_balance)
    {
        this.current_balance = current_balance;
    }

    public int getCurrentBalance()
    {
        return current_balance;
    }

    public void setDeposit(int deposit_amount)
    {
        this.deposit_amount = deposit_amount;
    }

    public int getDeposit()
    {
        return deposit_amount;
    }

    public int CurrentAmount()
    {
        return current_balance + deposit_amount;
    }
}

class ExceptWithdraw extends Thread
{
    int current_balance;
    int withdraw_amount;

    public void run()
    {
        System.out.println("Balance after withdraw: " + amountAfterWithdraw());
    }

    public void setCurrentBalance(int current_balance)
    {
        this.current_balance = current_balance;
    }

    public int getCurrentBalance()
    {
        return current_balance;
    }

    public void setWithdraw(int withdraw_amount)
    {
        this.withdraw_amount = withdraw_amount;
    }

    public int getWithdraw()
    {
        return withdraw_amount;
    }

    public int amountAfterWithdraw()
    {
        return current_balance - withdraw_amount;
    }
}

public class SynchronizedApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("__________Welcome__________");

        System.out.println("Enter the current balance:");
        int currentBalance = sc.nextInt();

        System.out.println("Enter the amount to deposit:");
        int depositamount = sc.nextInt();

        System.out.println("Enter the amount to withdraw:");
        int withdrawamount = sc.nextInt();

        ExceptDeposit d = new ExceptDeposit();
        ExceptWithdraw w = new ExceptWithdraw();

        d.setCurrentBalance(currentBalance);
        d.setDeposit(depositamount);

        w.setCurrentBalance(currentBalance);
        w.setWithdraw(withdrawamount);

        d.start();
        w.start();
    }
}