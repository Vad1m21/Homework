package exercise1;

public class OutputArray {

    public int [] outPutArray(int []arr){

        System.out.print("Output Array:");

        for( int i = 0; i < arr.length; i++){

            System.out.print(arr [i] +  "  ");

        }

        return arr;
    }


    public int [ ]outputSortArray (int [] arrayNew){
        System.out.print("Output sort Array: ");
        for (int i = 0;i < arrayNew.length; i++){
            System.out.print(arrayNew[i]+ "  ");
        }

        return arrayNew;
    }

}
