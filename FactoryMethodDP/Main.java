package LLD.FactoryMethodDP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create factory
        PlanFactory factory = new PlanFactory();

        //take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of plan for which the bill will be generated: ");
        String planName = sc.nextLine();

        System.out.print("Enter the number of units for bill will be calculated: ");
        int units = sc.nextInt();

        //object creation
        Plan plan = factory.getPlan(planName);

        System.out.println("PlanName is : " );
        System.out.println(planName);

        plan.getRate();
        System.out.println(plan.rate);

        System.out.println("Total Bill is: ");
        plan.calculateBill(units);
    }
}


// In this factory method design pattern Sub-class (Plan) decides which object should be generated,
// According to this we get the bill