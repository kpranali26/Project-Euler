import java.math.BigInteger;

public class Distinct_Powers29 {
    public static void main(String[] args){

        HashSet<BigInteger> st = new HashSet<>();

        for(int a = 2; a <= 100; a++){
            for(int b = 2; b <= 100; b++){
                BigInteger base = BigInteger.valueOf(a);
                st.add(base.pow(b));
            }
        }

        System.out.println(st.size()); // final answer
    }
}