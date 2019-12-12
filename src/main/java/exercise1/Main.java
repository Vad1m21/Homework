package exercise1;





public class Main {

    public static void main(String[] args) {
        InputArray inputArray = new InputArray();

      int [] arr = inputArray.inputArrayAnotherMethod();
        OutputArray outputArray = new OutputArray();
        outputArray.outPutArray(arr);

        OperationWithArray operationWithArray = new OperationWithArray();
        int min = operationWithArray.minNumberInArray(arr);
        int max = operationWithArray.maxNumberInArray(arr);
        int repeatNumber = operationWithArray.findRepeatNumbers(arr);

        operationWithArray.countRepeatNumbersMax(arr);
        operationWithArray.countRepeatNumbersMin(arr,max);

        SortArray sortArray = new SortArray();
        int [] arrayNew = sortArray.arraySort(arr);
        outputArray.outputSortArray(arrayNew);


    }
}
