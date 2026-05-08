public class SpiralDiagonalSum {

    public static void main(String[] args) {

        int n = 1001;   // size of spiral (must be odd)
        
        long sum = 1;   // start with center value

        // we move layer by layer: 3, 5, 7, ..., 1001
        for (int i = 3; i <= n; i += 2) {

            // calculate sum of 4 corners for current layer
            long cornerSum = 4L * i * i - 6 * (i - 1);

            // add to total sum
            sum += cornerSum;
        }

        System.out.println("Diagonal Sum: " + sum);
    }
}