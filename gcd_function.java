public class gcd_function {
    public static void main(String[] args) {
        int num1 = 56; // Example number 1
        int num2 = 98; // Example number 2
        int result = gcd(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
}
