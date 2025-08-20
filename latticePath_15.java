public class latticePath_15 {
    public static void main(String[] args) {
        int num = helper(2, 2);
        System.out.println("Total routes are :" + num);
    }
    private static int helper(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }
        int count = 0;
        if(row > 0){
            count += helper(row - 1, col);
        }
        if(col > 0){
            count += helper(row, col - 1);
        }
        return count;
    }
}
