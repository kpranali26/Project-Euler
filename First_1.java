public class First {

    private static int sumOfMultiples(int num){
        int sum = 0 ;
        num--;
        while(num > 0){
          if(num % 3 == 0 || num % 5 == 0){
            sum += num;
          }
          num--;
        }

        return sum;
    }

    public static void main(String [] args){
      int num = 10;
      int ans = sumOfMultiples(num);
      System.out.println("Sum of Multiples of 3 or 5 below "+num +"=" + ans);

    }
    
}
