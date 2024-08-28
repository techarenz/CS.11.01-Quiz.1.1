import java.util.Scanner;
//
///**
//*****************************************************************************************************
//* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge
//* “I have neither given nor received unauthorized aid on this piece of work.”
//* NAME: Fiona Wong
//*****************************************************************************************************
//*/
//
public class Main {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your age: ");
    int age = scanner.nextInt();

    System.out.println("Enter your name: ");
    String firstName = scanner.next();

    scanner.nextLine();

    System.out.println("What's your favourite food? ");
    String favouriteFood = scanner.nextLine();

    String result = "First name: " + firstName + "\nAge: " + age + "\nFavourite food: " + favouriteFood;
    System.out.println(result);

    }

}
