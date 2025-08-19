public class highlyDiviTriNumber_12 {
    public static void main(String[] args) {
    
        int num = 0;
        int j = 0;
         while (true) {
           int count = helper(num);
            if( count >= 500) {
                System.out.println(num);
                break;
            }
            j++;
             num += j; // next triangle
        }
     
    }

    private static int helper (int num){
        int count = 0;
        for(int i = 1 ; i * i <= num ; i++){
            if (num % i == 0) {
            if (i == num / i) count++;  // perfect square
            else count += 2;            // i and num/i
        }

       }
        return count;
    }
}
