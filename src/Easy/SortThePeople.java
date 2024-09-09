//https://leetcode.com/problems/sort-the-people/description/

package Easy;

public class SortThePeople {

    //Sorting by using quick sort
    public String[] sortPeople(String[] names, int[] heights) {
        sort(heights, names, 0, heights.length - 1);
        return names;
    }

    public static void sort(int[] heights, String[] names, int start, int stop) {
        if (heights.length < 2) {
            return;
        }
        if (start >= stop) {
            return;
        }
        int separator = partition(heights, names, start, stop);
        sort(heights, names, start, separator - 1);
        sort(heights, names, separator, stop);


    }

    public static int partition(int[] heights, String[] names, int start, int stop) {
        int middleIdx = (start + stop) / 2;
        int pivot = heights[middleIdx];
        int left = start;
        int right = stop;
        while (left <= right) {

            while (heights[left] > pivot) {
                left++;
            }
            while (heights[right] < pivot) {
                right--;
            }
            if (left <= right) {
                int swap = heights[right];
                heights[right] = heights[left];
                heights[left] = swap;
                String nameSwap = names[right];
                names[right] = names[left];
                names[left] = nameSwap;
                left++;
                right--;
            }
        }
        return left;
    }
}
