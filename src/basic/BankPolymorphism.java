package basic;
import java.util.Scanner;
class Bank {
    double RateOfInterest() {
        return 0.0;
    }
}
class SBI extends Bank {
	double RateOfInterest() {
        return 10.5; 
    }
}
class AXIS extends Bank {
	double RateOfInterest() {
        return 6.5; 
    }}
class HDFC extends Bank {
	double RateOfInterest() {
        return 7.2; 
    }
}
class KARANATAKA extends Bank {
	double RateOfInterest() {
        return 8.6;
    }
}
public class BankPolymorphism {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the loan amount:");
        int loanAmount = scanner.nextInt();
        System.out.println("Loan Amount "+loanAmount);
        SBI S=new SBI();
        System.out.println("SBI Bank Interst "+S.RateOfInterest()+"% per year");
        AXIS A=new AXIS();
        System.out.println("AXIS Bank Interst "+A.RateOfInterest()+"% per year");
        HDFC H=new HDFC();
        System.out.println("HDFC Bank Interst "+H.RateOfInterest()+"% per year");
        KARANATAKA K=new KARANATAKA();
        System.out.println("Karnataka Bank Interst "+K.RateOfInterest()+"% per year");    
   }
    }
