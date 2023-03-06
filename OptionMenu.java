import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {

    Scanner scan = new Scanner(System.in);
    DecimalFormat dm = new DecimalFormat("####,##");

    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
    public void getLogin() throws IOException {
        int x = 1;
        do{
            try {
                data.put(4545,9090);
                data.put(4454,9090);
                System.out.println("Welcome to Bank ATM");
                System.out.println("Please enter your customer number");
                setCustomerNumber(scan.nextInt());
                System.out.println("Enter your Pin #");
                setPinNumber(scan.nextInt());
            } catch (Exception e) {
                System.out.println("Invalid Characters");
                x = 2;
                // TODO: handle exception
            }
            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if(data.containsKey(cn) && data.get(cn) == pn){
                getAccountType();
            } else {
                System.out.println("Wrong customer number or pin");
            }
        } while (x==2);
    }
    public void getAccountType(){
        System.out.println("Select the account you want to access: ");
        System.out.println(" 1) - Checking ");
        System.out.println(" 2) - Saving ");
        System.out.println(" 3) - Exit ");

        int selection = scan.nextInt();

        switch(selection){
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;

            case 3:
                System.out.println("Thank you for choosing us, have a great day");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
    public void getChecking(){
        System.out.println("Checking Account: ");
        System.out.println(" 1) - View Balance");
        System.out.println(" 2) - Withdraw Funds");
        System.out.println(" 3) - Deposit Funds");
        System.out.println(" 4) - Exit");
        System.out.println("Choice: ");


        int selection = scan.nextInt();

        switch(selection){
            case 1:
            System.out.println("Checking account balance: " + getCheckingBalance());
            getAccountType();
            break;

            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;

            case 4:
            System.out.println("Thank you for choosing us, have a great day");
            break;

            default:
                System.out.println("Invalid choice");
                getChecking();
        }

    }

    public void getSaving(){
        System.out.println("Savings Account: ");
        System.out.println(" 1) - View Balance");
        System.out.println(" 2) - Withdraw Funds");
        System.out.println(" 3) - Deposit Funds");
        System.out.println(" 4) - Exit");
        System.out.println("Choice: ");

        int selection = scan.nextInt();
        switch(selection){
            case 1:
                System.out.println("Savings account balance " + getSavingBalance());
                getAccountType();
                break;
            case 2:
                getsavingsWithdrawInput();
                getAccountType();
                break;
            case 3:
                getsavingsDepositInput();
                getAccountType();
                break;
            case 4:
            System.out.println("Thank you for choosing us, have a great day");
            break;

            default:
                System.out.println("Invalid choice");
                getChecking();
        }
    }



}
