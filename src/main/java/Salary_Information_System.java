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


    }
}
