// public class PowerSum_16 {
    
//     public static void main(String[] args) {
//         int i = 2;
//         int product = 1;
//         int count = 1;
//         while ( count != 11){
//           product *= i;
//           count++;
//         }
//         int val = product;
//         product *= val;
//         product *= val;
        
//         System.out.println("The product is :" + product);
//        int s = 0;
//         while (product > 0){
//             s += product % 10;
//             product = product/10;
//         }

//       System.out.println(s);
        
//     }
// }



import java.math.BigInteger;
public class PowerSum_16 {
  public static void main(String[] args) {
    BigInteger num = BigInteger.valueOf(2).pow(1000);

    String s = num.toString();
     
   int sum = 0;
    for(char c : s.toCharArray()){

      sum+= c -'0';


    }
    System.out.println("2 ki 1000 =" + num);
    System.out.println("Sum of all digits :" + sum);
  }
}