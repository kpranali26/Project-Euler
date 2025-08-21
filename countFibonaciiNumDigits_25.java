public class countFibonaciiNumDigits_25 {

    public static void main(String[] args) {

        int index = 1;
        int num = 0;
        int count = 0;
        while(true){
            num = fibo(index);
           if(helper(num,count)==1000){
            System.out.println(num);
            break;
           }
           index++;
        }
        
    }
    private static int fibo(int index){
        if(index ==1 || index == 2){
            return 1;
        }
        return fibo(index-1) + fibo(index -2);

    }

    private static int helper(int num,int count){
        if(num == 0 ){
            return count;
        }
        count++;
        return helper(num/10,count);
    }
}