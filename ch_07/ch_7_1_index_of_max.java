/*
Write a method called indexOfMax that takes an array of integers and returns the index of the largest element. Can you write this method by using an enhanced for loop? Why or why not?
*/
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] arr = {6};
        System.out.println(indexOfMax(arr));
    }
    
    public static int indexOfMax(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > answer) {
                answer = arr[i];
            }
        }
        return answer;
    }
}
