import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class collatzSeq_14 {

   private static HashMap<Long, Integer> memo = new HashMap<>();
      public static void main(String[] args) {
        int maxLength =0;
        int numWhichProduce = 0;
        long limit = 1000000;

        for(int i = 2; i < limit ; i++){
           
         int length = collatzSeq(i);
         if( length > maxLength){
            maxLength = length;
            numWhichProduce = i;
         }
        }
        System.out.println("The number is :"+numWhichProduce);    
        System.out.println("the length of chain is : "+ maxLength);
          

        
      }

      private static int collatzSeq(long num){
      //   int count = 1;
        
        if (num == 1) return 1;

        if (memo.containsKey(num)) return memo.get(num);

        long next = (num % 2 == 0) ? num / 2 : 3 * num + 1;
        int length = 1 + collatzSeq(next);

        memo.put(num, length);
        return length;
    }

}

//Its a sequence where we have given a starting point and from there we have to reach to 1 , by using theses 2 rules :
 // 1) n -> n/2 (even)
 // 2) n -> 3n +1 (odd)
 // lets take example start with  13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1       like this!!
 // but in above we have to find that starting point which can produce a long length of chain under 1 million !!