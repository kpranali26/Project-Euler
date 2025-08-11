import java.util.ArrayList;
import java.util.Scanner;

public class largestPrimeFac_3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for larget prime factor :");
        long num = sc.nextLong();
        sc.close();
        ArrayList<Long> list = new ArrayList<>();
        
        long largestPrime = 0;
        
          while(num % 2 == 0){
                largestPrime = 2;
                num = num /2;
                
            } 
            list.add(largestPrime);
        for(int i = 3 ; i * i <= num ; i = i + 2 ){

            while(num % i == 0){
                largestPrime = i;
                num = num / i;
            } 
             list.add(largestPrime);
        }
        
        if(num > 2){
          largestPrime = num;
        }
        System.out.println("Largest prime factor :" + largestPrime);

        for(int j = 0 ;j < list.size() ; j++){
            System.out.println(list.get(j));
        }
        
    }

   
}


// firstly we have divided by 2 until it remove all 2's divisible number separetly
// then we start loop from 3 to the square root of number .. for that our condition is i * i <= num..it check for every new num
// edge case : if num is itself prime factor then we check it at last 