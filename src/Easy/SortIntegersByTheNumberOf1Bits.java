package Easy;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SortIntegersByTheNumberOf1Bits {

   public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int currentBitElem = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int minElemBits = arr[j];
                if ((i != j) && (currentBitElem > minElemBits)) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
        return arr;
   }

   public int[] sortB(int[] arr) {

       for (int i = 0; i < arr.length; i++) {

           int minBits = Integer.bitCount(arr[i]);
           int minBitsIdx = i;
           for (int j = i + 1; j < arr.length; j++) {
               int currentBitCount = Integer.bitCount(arr[i]);
               if (currentBitCount < minBits) {
                   minBitsIdx = j;
                   minBits = currentBitCount;
               }
           }

           if (minBits == Integer.bitCount(arr[i])) {
               int minElem = arr[i];
               int minElemIdx = i;

               for (int k = i + 1; k < arr.length; k++) {
                   if (arr[k] < minElem) {
                       minElemIdx = k;
                       minElem = arr[k];

                   }
               }
               int swap = arr[minElemIdx];
               arr[minElemIdx] = arr[i];
               arr[i] = swap;
           }

           int swapByBits = arr[minBitsIdx];
           arr[minBitsIdx] = arr[i];
           arr[i] = swapByBits;



       }
       return arr;




   }



   public int[] sortByBits(int[] arr) {
       for (int i = 0; i < arr.length; i++) {
           int minIdxByBits = i;
           int minBits = Integer.bitCount(arr[i]);
           int minElement = arr[i];
           int minElementIdx = i;
           for (int j = i + 1; j < arr.length; j++) {
               int current = Integer.bitCount(arr[j]);
               if (current < minBits) {
                   minIdxByBits = j;
                   minBits = current;
               }

               if (current == minBits) {
                   if (arr[j] < minElement) {
                       arr[j] = arr[i];
                       arr[i] = minElement;





/*                       minElementIdx = j;
                       minElement = arr[j];*/
                   }
               }
           }

           int swapByBits = arr[minIdxByBits];
           arr[minIdxByBits] = arr[i];
           arr[i] = swapByBits;
/*           int swap = arr[minElementIdx];
           arr[minElementIdx] = arr[i];
           arr[i] = swap;*/
       }
       return arr;
   }



    public int[] sortByBits88(int[] arr) {
        int[] sortedByBits = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int minBitsElem = findMinimumIdx(arr);
            sortedByBits[i] = arr[minBitsElem];
            arr[minBitsElem] = -1;
        }
        return sortedByBits;
    }

    public int findMinimumIdx(int[] nums) {
        int minElem = Integer.bitCount(nums[0]);
        int minElemIdx = 0;
        for (int i = 1; i < nums.length; i++) {
            int bits = Integer.bitCount(nums[i]);
            if (bits <= minElem) {
                minElem = Integer.bitCount(nums[i]);
                minElemIdx = i;
            }
        }
        return minElemIdx;
    }
}
