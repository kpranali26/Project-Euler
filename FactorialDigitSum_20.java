import java.math.BigInteger;

public class FactorialDigitSum_20 {
    public static void main(String[] args) {
        // Compute 100! using BigInteger
        BigInteger factorial = BigInteger.ONE;
        int num =100;
        for (int i = 2; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("The factorial of " + num + " is: " + factorial);

        // Convert to string and sum digits
        String number = factorial.toString();
        int sum = 0;
        for (char c : number.toCharArray()) {
            sum += c - '0';
        }

        System.out.println("Sum of digits of "+num +"! : " + sum);
    }
}


// main part was only to manage that large factorial value which in java we did with the help of biginteger!!