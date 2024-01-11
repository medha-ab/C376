public class WhileLoop {
    public static void main(String[] args) {
        int num = 12321;
        int temp = num;
        int revnum = 0;
        while (num != 0) {
            int digit = num % 10;
            revnum = revnum * 10 + digit;
            num /= 10;
        }
        if (temp == revnum) {
            System.out.println(temp + " is a palindrome.");
        } else {
            System.out.println(temp + " is not a palindrome.");
        }
    }
}
