public class Sum_of_fbonicci{
    public static void main(String args[]){
   int n = 10;
    int arr[] = new int[n];
    arr[0] = 1;
    arr[1] = 2;
    for(int i = 1; i < n-1 ; i++){
        arr[i+1] = arr[i-1] + arr[i];
    }

    int sum = 0;
      for(int i = 0 ; i < n; i++){
        int temp = arr[i];
        while(temp > 0 ){
            sum += temp % 10;
            temp = temp / 10;
        }   
    } 
      System.out.println(sum);
    
    }

}
