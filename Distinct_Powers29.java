import java.util.*;

public class Distinct_Powers29 {
    public static void main(String[] args){

        HashSet<Double> st = new HashSet<>();

        for(int i = 2; i <= 100; i++){
            st.add(Math.pow(i, 5));
        }
        

        ArrayList<Double> list = new ArrayList<>(st);
        Collections.sort(list);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}