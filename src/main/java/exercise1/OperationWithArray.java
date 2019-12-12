package exercise1;

import java.util.Scanner;


public class OperationWithArray {

    Scanner scanner = new Scanner(System.in);

    public int minNumberInArray(int []arr){
        int min = arr[0];

        for(int i = 0; i <arr.length; i++){
            if(min > arr[i]){

                min = arr [i];
            }
        }

        System.out.println("\nMin Number in Array = " + min);

        return min;
    }


    public int maxNumberInArray (int [] arr){

        int max = arr[0];

        for (int i = 0; i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("Max number in array = "+ max);
        return max;
    }

    public int findRepeatNumbers (int []arr){

        int count = 0;
        System.out.print("What number  do you want to count in array: ");
        int number = scanner.nextInt();

         for (int i = 0; i < arr.length; i ++){

             if (arr[i] == number){
                 count++;

             }
         }
        System.out.println("Number " + number + " repeat : "+ count + " times");
        return count;
    }


    public void countRepeatNumbersMax (int []arr){
        int[] counter = new int[10];

        for (int i = 0; i < arr.length; i++) {
            counter[arr[i]]++;
        }

        int max = 0;
        for (int y = 0; y <= arr.length-1; y++){
            if (counter[y] > max)
                max = counter[y];
        }

        System.out.println( "Repeat(max): " + max + " times");

    }

    public void countRepeatNumbersMin (int []arr,int max){
        int[] counter = new int[10];

        for (int i = 0; i < arr.length; i++) {
            counter[arr[i]]++;
        }

      int min = max;
      for(int y = 0; y <= arr.length -1; y++){
          if(counter[y] < min && counter[y] !=0 ){
              min = counter[y];
          }
      }

        System.out.println("Repeat(min): " +  min  + " times");
    }





}
