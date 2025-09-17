import java.util.Stack;

public class decodeStr {
    
    static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resultStack = new Stack<>();
        String result = "";
        int num = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');   // build full number
            } 
            else if (ch == '[') {
                countStack.push(num);
                resultStack.push(result);
                num = 0;
                result = "";
            } 
            else if (ch == ']') {
                int count = countStack.pop();
                String prev = resultStack.pop();
                result = prev + result.repeat(count);
            } 
            else {
                result += ch;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String result = decodeString("3[b2[ac]]");
        System.out.println(result);
    }
}


