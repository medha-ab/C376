public class MaxLengthSubstring {
     public static void main(String[] args) {
            String input1 = "Hi How are you";
            String output1 = findMaxLengthSubstring(input1);
            System.out.println(output1);
            String input2 = "This is java String program ";
            String output2 = findMaxLengthSubstring(input2);
            System.out.println(output2);
        }
     private static String findMaxLengthSubstring(String input) {
            String[] words = input.split("\\s+");
            String maxLengthSubstring = "";
            for (String word : words) {
                if (word.length() > maxLengthSubstring.length()) {
                    maxLengthSubstring = word;
                }
            }
            return maxLengthSubstring;
     }
}
