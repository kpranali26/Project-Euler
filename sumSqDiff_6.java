public class sumSqDiff_6 {
    public static void main(String[] args) {
        int sqSum =0;
        int sum = 0;
        for(int i = 1 ;i <= 100; i++){
           sum += i;
           sqSum = sqSum + (i*i);
        }
        
        int sumSq = sum * sum;
        int res = sumSq - sqSum;
        System.out.println("The difference is :"+ res);;
    }
}
