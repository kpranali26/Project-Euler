import java.util.Scanner;

public class smallestMul_5 {
    public static void main(String[] args) {
        int result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for its LCM :");
        int n1 = sc.nextInt();
        sc.close();
       for(int i = 1 ; i < n1; i++){
           result = lcm(result,i);
       }
      System.out.println(result);
    }

    private static int gcd(int a, int b){

        if(a == 0){
             return b;
        }
        return gcd(b % a ,a );  
    }

    private static int lcm (int a, int b){
        int mul = a * b;
        int val = gcd(a, b);

        return mul / val;
    }
}


// lcm formula => a*b / gcd (a,b);
// for gcd we have used euclidean algorithm
// dry run to get better!
