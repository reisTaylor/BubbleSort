package com.company;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
       //shellSort implementation - quadratic to linear - initial ordering of values is determinate
        for(int gap = intArray.length/2; gap > 0; gap /= 2){
            for(int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];
                int j = i;
                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }
                intArray[j] = newElement;
            }
        }


        for(int i = 0; i < intArray.length; i++)
            System.out.println(intArray[i]);
    }
    public static void swap(int[] array, int i, int j){//bubbleSort & selectionSort
        if(i == j)
            return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}

//***********************************************************************************************************
//***********************************************************************************************************
/*// bubblesort implementation
        with ascending order, two loops, quadratic time complexity at a glance
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for (int i =0; i < lastUnsortedIndex; i++){//inner loop (doesn't cross the sorted partition)
                if(intArray[i]>intArray[i+1])
                    swap(intArray, i, i + 1);
            }
        }
//***********************************************************************************************************
//***********************************************************************************************************

//SelectionSort implementation
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
                int largest = 0;
                for (int i = 1; i <= lastUnsortedIndex; i++){
                if(intArray[i] > intArray[largest]){
                largest = i;
                }
                }
                swap(intArray, largest, lastUnsortedIndex);
                }
//***********************************************************************************************************
//***********************************************************************************************************

  //insertionSort implementation - two loops - quadratic at a glance, but initial ordering matters
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--){
                intArray[i] = intArray[i- 1];

            }
            intArray[i] = newElement;
        }

 */