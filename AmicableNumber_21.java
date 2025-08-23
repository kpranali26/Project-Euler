public class AmicableNumber_21 {
    public static void main(String[] args) {
        int numDiv = sumOfDivisors(220);
        System.out.println("Sum of proper divisors of 220 = " + numDiv);

        int a = 220, b = numDiv;
        if (a != b && sumOfDivisors(b) == a) {
            System.out.println(a + " and " + b + " are amicable numbers.");
        } else {
            System.out.println("Not amicable.");
        }
    }

    private static int sumOfDivisors(int num) {
        int sum = 1; // 1 is always a divisor
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) { // avoid double-counting square root
                    sum += num / i;
                }
            }
        }
        return sum;
    }
}
