import java.math.BigInteger;

public class SelfPowers_48 {
    public static void main(String[] args) {
        BigInteger num = BigInteger.valueOf(1).pow(1);
       for(int i = 2; i < 1001 ; i ++){
        num = num.add(BigInteger.valueOf(i).pow(i));
       }

       System.out.println("Number is :"+num);
       String s= num.toString();
       String last = s.substring(s.length() - 10, s.length());
       System.out.println("Final last 10 digits are:"+last);
    }
}
