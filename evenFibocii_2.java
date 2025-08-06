// import java.util.ArrayList;

import java.util.Scanner;

public class evenFibocii_2 {
    // fibonacii series
    // 0 1 1 2 3 5 8 13 ....
    public static void main(String args[]){
    System.out.print("enter a nummber :");
    Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
    int arr[] = new int[n];
    arr[0] = 1;
    arr[1] = 2;
    for(int i = 1; i < n-1 ; i++){
        arr[i+1] = arr[i-1] + arr[i];
    }
      for(int i = 0 ; i < n; i++){
        System.out.println(arr[i]);
      } 
      sc.close();
    }

}