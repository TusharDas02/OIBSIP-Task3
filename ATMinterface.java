import java.util.Scanner;
public class ATMinterface {
    public static void main (String [] args) 
    {
        int i=0;
        int transaction[] = new int[5];
        int balance=0;
        int transfer=0;
        int deposit=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name  : ");
        String name = sc.nextLine();
        System.out.println("Enter  your Account number : ");
        int acc= sc.nextInt();
        int a = 1;
        while(a==1) 
        {
            System.out.println("\n select options" );
            System.out.println(" 1 Transaction History");
            System.out.println(" 2 Deposit");
            System.out.println(" 3 Withdraw");
            System.out.println(" 4 Balance");
            System.out.println(" 5 Transfer");
            System.out.println(" 6 Exit");
            System.out.println("" );
            System.out.println("Enter the choice");
            int ch=sc.nextInt();
            if(ch==1){
                System.out.println("Transaction History");
                for(int j=0;j<5;j++){
                    System.out.println(transaction[j]);
                }
            }
            if(ch==2) {
                System.out.println("Enter the amount to deposit :");
                deposit = sc.nextInt();
                balance = deposit + balance;
                System.out.println("Successfully Deposited-------------");
                transaction[i]=balance;
                i=i+1;
            } else if (ch==3) {
                System.out.println("Enter amout of withdraw : ");
                int withdraw= sc.nextInt();
                if(withdraw>deposit) {
                    System.out.println("Withdraw failed.....please check your account balance");
                } else {
                    balance=balance-withdraw;
                    System.out.println("Withdraw Successful-------------");
                    transaction[i]=balance;
                    i=i+1;
                }
            } else if(ch==4) {
                System.out.println("Your Balance Is: " +balance);
                    
            }   else if(ch==5){
                System.out.println("Enter amount to tranfer: ");
                transfer = sc.nextInt();
                System.out.println("Enter account number to transfer: ");
                int accno=sc.nextInt();
                if(balance<transfer){
                    System.out.println("Tranfer Failed:");
                }
                else {
                    balance=balance-transfer;
                    System.out.println("Transfer Sucessfull");
                    transaction[i]=balance;
                    i=i+1;
                }
                
            }
            else if(ch==6) {
                System.out.println("Thank you "+ name);
                break;
            } else {

            }
        }
     }
}