import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.ArrayList;

public class Solution {
    public static void reverseArray(ArrayList<Integer> arr, int m) {
        // Reverse the part of the array after index m
        reverse(arr, m + 1, arr.size() - 1);
    }

    private static void reverse(ArrayList<Integer> arr, int start, int end) {
        while (start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }
}
