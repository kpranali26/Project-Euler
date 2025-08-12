// brute force approach =>
public class SumOfPrimes {
    public static void main(String[] args) {
        long sum = 2; // start with first prime
        for (int i = 3; i < 2000000; i += 2) { // skip even numbers
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println("Sum of primes below 2,000,000: " + sum);
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num % 2 == 0) return num == 2;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}


// sieve of eratosthenes 