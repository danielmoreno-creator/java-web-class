package Exercises;
import java.util.Scanner;

public class Array1 {
    public void arrayEx() {
        Scanner sc = new Scanner(System.in);

        int[] intArr = new int[5];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        intArr[3] = 4;
        intArr[4] = 5;

        System.out.println("Method 1:");
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }

        int[] intArr1 = new int[]{1, 3, 5, 7};

        System.out.println("Method 2:");
        for (int i = 0; i < intArr1.length; i++) {
            System.out.println(intArr1[i]);
        }

        System.out.println("Method 3:");
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] intArrayUser = new int[size];

        System.out.println("Enter the values for the array: ");
        for (int i = 0; i < size; i++) {
            intArrayUser[i] = sc.nextInt();
        }

        System.out.println("The values entered in the array are: ");
        for (int i = 0; i < size; i++) {
            System.out.println(intArrayUser[i]);
        }

        String[] arrStr = new String[10];
        arrStr[0] = "Hello Java!!";

        System.out.println("String Array:");
        System.out.println(arrStr[0]);
        
        sc.close();
    }
}
