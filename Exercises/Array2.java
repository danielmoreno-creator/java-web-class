package Exercises;

public class Array2 {
	
	public static void main(String[] args) {

        int[] firstArray = { 2, 3, 4, 5, 6 };
        int[] secondArray = { 1, 2, 3, 4, 5 };

        System.out.print("Common elements: ");

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    System.out.print(firstArray[i] + " ");
                }
            }
        }
    }
}
