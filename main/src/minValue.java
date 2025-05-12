public class minValue {
    public static void main(String[] args){
        int [] values = {65, 89, 45, 37, 35, 900,56};
        int num = findMinValue(values);

        System.out.println("The minimum value in the array is: " + num);
    }

    public static int findMinValue(int[] arr){
        int num = arr[0];
        for(int i = 1; i < arr.length; i++){
            if (arr[i] < num) num = arr[i];
        }
        return num;
    }
}
