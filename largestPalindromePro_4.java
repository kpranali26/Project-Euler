public class largestPalindromePro_4 {
    private static boolean isPalindrome(int temp){
        int num = temp;
        String res = "";
        while(temp > 0){
           res += temp % 10;
           temp = temp /10;
        }

       int x = Integer.parseInt(res);
       if(x == num) return true;
       else return false;
        
    }
    public static void main(String[] args) {
        int largestPalindrome = 0;
      //   int n1 = 0;
      //   int n2 = 0;
        for(int i = 999 ; i >= 100 ;i--){
           for(int j = i ; j >100 ;j--){
             int num = i * j;
           if(isPalindrome(num)){
            // System.out.println("Palindrome :" + num + "=" + i + "*"+ j);
             largestPalindrome = Math.max(largestPalindrome,num);
            break;
           }
           }
        }
       System.out.println("Answer : " + largestPalindrome);
    }
}


// simple palindrome logic
// to reverse number  => rev = rev*10 +temp % 10; ..in general 