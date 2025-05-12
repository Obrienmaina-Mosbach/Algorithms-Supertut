public class LinearSearch {
    public static void main(String [] args) {
        int[] numbers = {23, 89, 67, 34, 82, 232, 42, 13, 94};
        int target = 82;
        int result = linearSearch(numbers, target);
        System.out.println("Element found at index:" + result);
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i =0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        System.out.println("Element not found");
        return -1;
    }
}
