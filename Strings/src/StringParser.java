public class StringParser {
        public static void main(String[] args) {
            String originalString = "computer";
            System.out.println(originalString);
            String parsedString = parseStringWithDash(originalString);
            System.out.println(parsedString);
        }

        private static String parseStringWithDash(String input) {
            String result = "";

            for (int index = input.length() - 1; index >= 0; index--) {
                result += input.charAt(index);
                if (index != 0) {
                    result += '-';
                }
            }

            return result;
        }
}
