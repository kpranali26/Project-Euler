public class PythaTriplet_8 {
    public static void main(String[] args) {
        int res = 0;
        for(int i = 1 ; i < 1000/3; i++){
            for(int j = i+1; j < 1000/2; j++){

                int k = 1000 - i - j;
                if(i*i + j*j == k*k ||  k*k + j*j == i*i || k*k + i*i  ==  j*j  ){
                    res = i * j * k ;
                }
            }
        }

        System.out.println(res);
    }
}



//this is exactly one special pythagorous triplet for which a+b+c = 1000!
//there only one triplet exist for this 
// here we have used three sum problem concept!!