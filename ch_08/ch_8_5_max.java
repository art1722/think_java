/*
Many of the patterns you have seen for traversing arrays can also be written recur‐ sively. It is not common, but it is a useful exercise.
1. Write a method called maxInRange that takes an array of integers and two indexes, lowIndex and highIndex, and finds the maximum value in the array, but considering only the elements between lowIndex and highIndex, including both.
This method should be recursive. If the length of the range is 1 (i.e., if lowIndex == highIndex), we know immediately that the sole element in the range must be the maximum. So that’s the base case.
If there is more than one element in the range, we can break the array into two pieces, find the maximum in each piece, and then find the maximum of the maxima.
2. Methods like maxInRange can be awkward to use. To find the largest element in an array, we have to provide the range for the entire array:
double max = maxInRange(a, 0, a.length - 1);
Write a method called max that takes an array and uses maxInRange to find and return the largest element.
*/

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(max(new int[]{2,7,4,8,3,5,4,6,9,3} ));
    }
    public static int maxInRange(int[] arr, int lowIndex, int highIndex) {
        if (highIndex == lowIndex) {
            return arr[lowIndex];
        }
        int max = maxInRange(arr, lowIndex, highIndex - 1);
        return arr[highIndex] > max ? arr[highIndex] : max;
    }
    public static int max(int[] arr) {
        return maxInRange(arr, 0, arr.length);
    }
}
