
package com.mycompany.cmpr113_hw3;

abstract class BankAccount
{
    double balance;
    int numDeposits;
    int numWithdrawals;
    double annualInterest;
    double monthlyInterestRate;
    int monthlyServiceCharge;
    
    BankAccount(double balance, double annualInterest)
    {
        this.balance = balance;
        this.annualInterest = annualInterest;
    }
    
    void deposit(double depo)
    {
        System.out.println("Adding $" + depo);
        balance += depo;
        numDeposits++;
    }
    
    void withdraw(double amount)
    {
       System.out.println("Subtracting $" + amount);

        balance -= amount;
        numWithdrawals++;
    }
    
    void calcInterest()
    {
        System.out.println("\nNow Calculating Interest...");
        monthlyInterestRate = (annualInterest / 12);
        double monthlyInterest = balance * monthlyInterestRate;
        balance = balance + monthlyInterest;
    }
    
    protected double getBalance()
    {
        return balance;
    }
    
    
}


class SavingsAccount extends BankAccount
{
    boolean status = true;

    
    SavingsAccount(double balance, double annualInterest, boolean status)
    {
        super(balance, annualInterest);
        this.status = status;
        
        if (super.getBalance() < 25)
        {
            status = false;
       
        }
        
        if (super.getBalance() > 25)
               {
                   status = true;
               }
    }
    
    void withdraww(double x)
    {
        
        if (status == true)
        {
     
            super.withdraw(x);
            System.out.println("\nTake out $" + x);
            
            if (super.getBalance() < x)
            {
                status = false;
            }

        }
        if (super.getBalance() < 25)
        {
            status = false;
            return;
       
        }
        
        if (super.getBalance() > 25)
        {
                   status = true;
        }
        
    }
    
    void depositt(double x)
    {
//        if (super.getBalance() < 25)
//        {
//            status = false;
//            return;
//        }
        if (super.getBalance() > 25)
        {
                   status = true;
        }
        if (super.getBalance() < 25)
        {
                   status = false;
        }
        
        super.deposit(x);
        
        
    }
    
    void monthlyProcess()
    {
       double nW = super.numWithdrawals;
       
       if (nW > 4)
       {
           for (int i = 4; i < nW; i++)
           {
               super.monthlyServiceCharge++;
               
               if (super.getBalance() < 25)
               {
                   status = false;
               }
               
               if (super.getBalance() > 25)
               {
                   status = true;
               }
           }
       }
    }
    
    public String toString()
    {
        return "\nBalance: " + balance + 
                "\nNumDeposits: " + numDeposits + 
                "\nNumWithdrawals: " + numWithdrawals+
                "\nAnnual Interest: " + annualInterest+
                "\nMonthly Interest Rate: " + monthlyInterestRate + 
                "\nMonthly Service Charge: " + monthlyServiceCharge + 
                "\nStatus: " + status;
        
           
    }
}


public class Project2 
{
    
    public static void main(String[] args) {
        System.out.println("Creating Bob....");
        SavingsAccount Bob = new SavingsAccount(25, 0.04, true);
        System.out.println("Bob----" + Bob);
        
        System.out.println("\n\nNow Taking Out $5\n\n");
        
        Bob.withdraww(5);
        
        System.out.println("\n\nBob----" + Bob);

        System.out.println("\n\nNow Adding In $5, 5 times\n\n");
        
        for (int i = 0; i < 5; i++)
        {

            Bob.depositt(5);
        }
        
        System.out.println(Bob);

        
        Bob.calcInterest();
        
        System.out.println(Bob);
        
        System.out.println("\nNow calling Bob.getBalance()\n" + Bob.getBalance());
        
        System.out.println("\nNow taking out $1, 5 times");
        
        for (int i = 0; i < 5; i++)
        {
            Bob.withdraww(1);
        }
        
        System.out.println(Bob);
        
        System.out.println("Now calling monthly service charge..");
        
        Bob.monthlyProcess();
        
        System.out.println("\nNew Bob");
        
        System.out.println(Bob);

      

    }
}
