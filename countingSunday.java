// import java.util.Scanner;

public class countingSunday {

    // Start => 1 jan , 1901 day =Monday
    // End => 31 December , 2000 day = ?

    public static void main(String[] args) {
        int countSun = 0;
        // Scanner sc = new Scanner(System.in);
        // String month = sc.nextLine();
        // int day = 1;
        // int count = 0;
        int year = 1901;
        int[] monthLengths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int date = 0;

        for(int i = 0 ; i < monthLengths.length;i++){
            date = (date + monthLengths[i]) % 7;
            
           if( i == 1 && isLeap(2025)){
              date = (date +1) % 7;
           }
         
           
          }

          for(int i = 1901 ; i <= 2000 ; i++ ){
            for(int m = 0 ; m < 12; m++){
                if(date == 6){
                    countSun++;
                }

                int daysThisMonth = monthLengths[m];
                if(m==1 && isLeap(year)){
                    daysThisMonth =29;
                }
                 date = (date + daysThisMonth) % 7;
            }
          }
        

      System.out.println(countSun);


    }


























        // // count sunday in 30days month => 4
        // for (int i = 1; i <= 30; i++) {
        //     if (day % 7 == 6) {
        //         count += 1;
        //     }
        //     day++;
        // }
       

    //     // count sunday in 31days month => 4
    //     day = 1;
    //     for (int j = 1; j <= 31; j++) {
    //         if (day % 7 == 6) {
    //             count += 1;
    //         }
    //         day++;
    //     }
    //      System.out.println(count);
    //     //count sunnday in February => 28days ...leap year => 29
    //      day = 1;
    //      int limit = 28;
    //      if(isLeap(year)) limit = 29;
    //     for (int j = 1; j <= limit; j++) {
    //         if (day % 7 == 0) {
    //             count += 1;
    //         }
    //         day++;
    //     }


    //     // 30-Days months
    //     // if (month.equals("April") || month.equals("June") || month.equals("September") || month.equals("November")) {
    //     //     // logic for 30-day months
    //     // }

    //     // // 31-days months
    //     // if (month.equals("January") || month.equals("March") || month.equals("May") || month.equals("July") ||
    //     //     month.equals("August") || month.equals("October") || month.equals("December")) {
    //     //     // logic for 31-day months
    //     // }
    // }

    // while( year <= 2000){
    //     if(isLeap(year)){

    //     }
    // }
    



    // leap year
    private static boolean isLeap(int num) {
        if (num % 4 == 0 && num % 100 != 0 || num % 400 ==0) {
                return true;
        }
        return false;
    }
}