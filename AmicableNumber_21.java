
import java.util.HashSet;
public class AmicableNumber_21 {
    static HashSet<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        int numDiv = sumOfdivisor(220);
        System.out.println(numDiv);
    }

    private static int sumOfdivisor(int num){
       int sum = 0;
       for(int i = 1; i*i <= num ; i++ ){
        if(num % i == 0){
        set.add(num);
        set.add(i);
        }
       }
       for (int val : set) {
        sum += val;
       }
       return sum;
    }
}
