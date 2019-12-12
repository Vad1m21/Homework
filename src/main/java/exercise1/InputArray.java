package exercise1;

import java.util.Scanner;


public class InputArray {

    Scanner scanner = new Scanner(System.in);

    public int[] inputArrayAnotherMethod() {

        System.out.print("Enter array:");
        Scanner scanner = new Scanner(System.in);

        String inputArray = scanner.nextLine();
        String[] strArr = inputArray.trim().split(" ");

        int[] intArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            String num = strArr[i].trim();
            intArr[i] = Integer.parseInt(num);
        }

        return intArr;
    }
}


