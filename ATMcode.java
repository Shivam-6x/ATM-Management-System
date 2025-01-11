 import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.println("welcome to ATM");
        System.out.println("Enter PIN :");
        int pin = sc.nextInt();
        int balance = 10000;
        int deposite = 0;
        int withdrawl = 0;
        if(pin==1234){
         System.out.println("Select any one option");
         System.out.println("check your balance --> press 1");
         System.out.println("Deposite Money --> press 2");
         System.out.println("withdral money --> press 3");
         System.out.println("press valid option : ");
         int opt = sc.nextInt();
         if(opt == 1){
             System.out.println("Balance remaining is : " + balance);
         }else if(opt==2){
            System.out.println("Enter Amount : "); 
            int dep = sc.nextInt();
            balance = balance+dep;
            System.out.println("balance is : "+ (balance)); 
         }
         else if(opt==3){
           System.out.println("Enter Amount : ");
           int with =  sc.nextInt();
            balance = balance-with;
            System.out.println(" remaining balance is : "+ (balance)); 
         }
        }
        else{
          System.out.println("Incorrect pin !!!");  
        }
    }
}
