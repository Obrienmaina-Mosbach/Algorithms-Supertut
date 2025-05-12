public class addNumbers {
    public static void main (String[] args) {
        int num1 = 34;
        int num2 = 74;
        int sum = total(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    //method for adding two numbers
    public static int total(int a, int b) {
        return a + b;
    }
}
