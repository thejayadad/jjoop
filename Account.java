import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    Scanner scan = new Scanner(System.in);
    DecimalFormat dm = new DecimalFormat("####,##");

    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    public int getCustomerNumber(){
        return customerNumber;
    }

    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }
    public int getPinNumber(){
        return pinNumber;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingBalance(){
        return savingBalance;
    }
    public double calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    public double calcSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }
    public double calCheckingDeposit(double amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }
    public double calSavingDeposit(double amount){
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    public void getCheckingWithdrawInput(){
        System.out.println("checking account balance: " + checkingBalance);
        System.out.println("Withdrawl amount?");
        double amount = scan.nextDouble();

        if((checkingBalance - amount) >= 0){
            calcCheckingWithdraw(amount);
            System.out.println( "New checking account balance: " + checkingBalance);
        } else {
            System.out.println("Insufficent Funds");
        }
    }

    public void getsavingsWithdrawInput(){
        System.out.println("Saving account balance: " + savingBalance);
        System.out.println("Withdrawl amount? ");
        double amount = scan.nextDouble();

        if((savingBalance - amount) >= 0){
            calcSavingWithdraw(amount);
            System.out.println("New saving balance " + savingBalance);
        } else {
            System.out.println("Insufficent Funds");
        }
    }

    public void getCheckingDepositInput(){
        System.out.println("checking account balance:" + checkingBalance);
        System.out.println("amount to deposit? ");
        double amount = scan.nextDouble();

        if((checkingBalance + amount) >= 0){
            calCheckingDeposit(amount);
            System.out.println("New checking balance: " + checkingBalance);

        } else{
            System.out.println("insuficent funds");
        }
    }

    public void getsavingsDepositInput(){
        System.out.println("Saving balance: " + savingBalance);
        System.out.println("amount to deposit");
        double amount = scan.nextDouble();

        if((savingBalance + amount) >=0 ){
            calcSavingWithdraw(amount);
            System.out.println("Saving balance: " + savingBalance);
        } else{
            System.out.println("Insufficent funds");
        }
    }




}
