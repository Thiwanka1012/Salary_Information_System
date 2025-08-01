import java.util.Scanner;

public class Salary_Information_System {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("---------------------------------------------------");
        System.out.println(" |           Salary Information System            |");
        System.out.println("---------------------------------------------------");


        System.out.println("1)Calculate Income Tax:");
        System.out.println("2)Calculate Annual Bonus:");
        System.out.println("3)Calculate Loan Amount:");

        System.out.print("Please Select Option(1,2,3):");
        int option=input.nextInt();

        if (option==1){
            System.out.println("------------------------------------------------");
            System.out.println("|             Calculate Income Tax             |");
            System.out.println("------------------------------------------------");

            input.nextLine();

            System.out.print("Input Employer Name:");
            String employerName= input.nextLine();

            System.out.print("Input Employer Salary:");
            double salary = input.nextDouble();

            double tax = 0;

            if (salary <= 100000) {
                tax = 0;
            } else if (salary <= 141667) {
                tax = (salary - 100000) * 0.06;
            } else if (salary <= 183333) {
                tax = (41667 * 0.06) + (salary - 141667) * 0.12;
            } else if (salary <= 225000) {
                tax = (41667 * 0.06) + (41667 * 0.12) + (salary - 183333) * 0.18;
            } else if (salary <= 266667) {
                tax = (41667 * 0.06) + (41667 * 0.12) + (41667 * 0.18) + (salary - 225000) * 0.24;
            } else if (salary <= 308333) {
                tax = (41667 * 0.06) + (41667 * 0.12) + (41667 * 0.18) + (41667 * 0.24) + (salary - 266667) * 0.30;
            } else {
                tax = (41667 * 0.06) + (41667 * 0.12) + (41667 * 0.18) + (41667 * 0.24) + (41667 * 0.30) + (salary - 308333) * 0.36;
            }

            System.out.println("Income Tax for " + employerName + " is Rs. " + Math.round(tax));

        } else if (option==2) {

            System.out.println("----------------------------------------------");
            System.out.println("|            Calculate Annual Bonus           ");
            System.out.println("----------------------------------------------");

            input.nextLine();

            String employerName;
            double salary;
            double bonus = 0;

            System.out.print("Enter Employer Name:");
            employerName= input.nextLine();

            System.out.print("Enter Employer Salary:");
            salary= input.nextDouble();

            if (salary < 100000) {
                bonus = 5000;
            } else if (salary <= 199999) {
                bonus = salary * 0.10;
            } else if (salary <= 299999) {
                bonus = salary * 0.15;
            } else if (salary <= 399999) {
                bonus = salary * 0.20;
            } else {
                bonus = salary * 0.35;
            }

            System.out.println("Annual Bonus for " + employerName + " is Rs. " + Math.round(bonus));




    }



    }
}
