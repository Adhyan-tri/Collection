import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {
//
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int index = Arrays.binarySearch(numbers, 4);
//
//        System.out.println("The index of element 3 in the array is" + 4);


        Integer[] numbers = {10, 2, 32, 12, 15, 1, 7, 72, 40, 79};
        Arrays.sort(numbers);

//        Arrays.fill(numbers,12);

        for (int i : numbers) {
            System.out.println(i + " ");
        }

    }
}
