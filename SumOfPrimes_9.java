// brute force approach =>
public class SumOfPrimes_9 {
    public static void main(String[] args) {
        // long sum = 2; // start with first prime
        // for (int i = 3; i < 2000000; i += 2) { // skip even numbers
        //     if (isPrime(i)) {
        //         sum += i;
        //     }
        // }
        // System.out.println("Sum of primes below 2,000,000: " + sum);

        algo(2000000);
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num % 2 == 0) return num == 2;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }



// sieve of eratosthenes 

private static void algo(int num){
    boolean list [] = new boolean[num +1];
    for(int i = 2 ; i < num ; i++){
        list[i] = true;

    }

    for(int i = 2 ; i < num ; i++){
        if(isPrime(i)){
          for(long multiples = (long)i * i; multiples < num ; multiples += i){
            list[(int)multiples] = false;
          }

        }
    }
   
    long sum = 0;
    for(int j = 2 ; j < 2000000; j++){
        if(list[j] ){
            sum += j;
        }
    }

    System.out.println(sum);

}
}