package atminterface;
import java.util.Scanner;

public class atm {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int balance = 10000, deposit, withdraw;

        while (true) {
            System.out.println("choose 1 for deposit:");
            System.out.println("choose 2 for withdraw:");
            System.out.println("choose 3 for balance inquiry:");
            System.out.println("choose 4 for exit:");
            System.out.println("choose correct operation to perform:");

            int choice = sc.nextInt();
        
         switch(choice){

       case 1:
            System.out.println("Enter amount you want to deposit:");
            deposit = sc. nextInt();

        balance = balance + deposit;
        System.out.println("your updated balance is :"+balance);
        System.out.println();
        break;

       case 2:
        System.out.println("enter amount to withdraw:");
        withdraw = sc.nextInt();
        if(balance >= withdraw){
            balance = balance - withdraw;
            System.out.println("your updated balance is :"+balance);
        } else {
            System.out.println("insufficiant funds...!");
        }

        break;
    
       case 3:
       System.out.println("your account balance is :"+balance);
       System.out.println();
       break;

      case 4:
      System.exit(0);
    }
            
        }
    }
}