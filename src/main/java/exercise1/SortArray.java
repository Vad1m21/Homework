package exercise1;

public class SortArray {

    public  int [] arraySort (int [] arr){
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
        for (int i = 0; i < arr.length - 1 ; i++) {

                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    needIteration = true;
                }
            }
        }

        return arr;
    }


}
