// import java.util.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class evenFibocii_2 {
    // fibonacii series
    // 0 1 1 2 3 5 8 13 ....
    public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
    System.out.print("enter a nummber :");
    Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
    int arr[] = new int[n];
    arr[0] = 1;
    arr[1] = 2;
    for(int i = 1; i < n-1 ; i++){
      // if(arr[i+1] == 4000000) break;
        arr[i+1] = arr[i-1] + arr[i];
        list.add(arr[i+1]);
    }

    int sum = 0;
      for(int i = 0 ; i < n; i++){
        int num = list.get(i);
        if(num % 2 == 0){
          sum += num;
        }
        
      } 
      System.out.println(sum);
      sc.close();
    }

}

// only generral fibonacci series
//even valued terms