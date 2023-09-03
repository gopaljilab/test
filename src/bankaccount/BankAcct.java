package bankaccount;

import java.util.Scanner;

public class BankAcct {
    private double bal;
    public BankAcct(double b) {
        this.bal=b;
    }
    void contact (double r){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password : ");
        String pass = sc.nextLine();
        if (pass.equals("xyz123")){
            Interest inr = new Interest(r);
            inr.calculateInterest();
        }
        else {
            System.out.println("Sorry , you are unauthorized Person.");
        }
    }
    private class Interest {
        private final double rate;
        public Interest(double rate) {
            this.rate = rate;
        }
        void calculateInterest(){
            double interest = bal*rate/100;
            bal += interest;
            System.out.println("Updated Balance : " + bal);
        }
    }
}


