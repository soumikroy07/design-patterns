package LLD.FacadeDesignPattern;

import java.util.Scanner;

public class MainClint {
    public static void main(String[] args) {

        //Showcasing clint all available options;

        System.out.println("1.iPhone");
        System.out.println("2.Samsung");
        System.out.println("3.OnePlus");
        System.out.println("4.Exit");
        System.out.println("Enter your choice");

        // clint input

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        ShopKeeper sk = new ShopKeeper();
        switch (choice){
            case 1:
                sk.iPhoneSale();
                break;
            case 2:
                sk.samsungSale();
                break;
            case 3:
                sk.oneplusSale();
                break;
            case 4:
                System.out.println("You choice Nothing");

            return;
        }while(true);
    }
}



// Here due to facade clint cant see the complex code, Main class(clint) call only Facade class And facade class
// handle all the code behind the scene;