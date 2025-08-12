public class primeNo_10001_7 {
    public static void main(String[] args) {
        int num = 1;
        for(int i = 0 ; i < 10001;){
           num++;
           if(isPrime(num)){
               i++;
           }
        }
       
        System.out.println(num);
    }

    private static boolean isPrime(int num){

        if(num < 2) return false;

        for(int i = 2 ; i * i <= num ; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
