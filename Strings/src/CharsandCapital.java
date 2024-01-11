public class CharsandCapital {
        public static void main(String[] args) {
            // Given input
            String input = "Softra Services Limited";
            String output = extractCharsAndCapitalize(input);
            System.out.println(input);
            System.out.println(output);
        }
       private static String extractCharsAndCapitalize(String input) {
            String[] words = input.split("\\s+");
            String result = "";

            for (int i = 0; i < words.length; i++) {
                if (i < words[i].length()) {
                    result += words[i].charAt(i);
                }
            }

            return result.toUpperCase();
        }
}
