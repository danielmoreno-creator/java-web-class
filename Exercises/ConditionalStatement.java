package Exercises;

import java.util.Scanner;

public class ConditionalStatement {
	private int age;

    public void checkEligibility() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        sc.close();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        ConditionalStatement state = new ConditionalStatement();
        state.checkEligibility();
    }
}
