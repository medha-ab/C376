public class StringManipulations {
    public static void main(String[] args) {
        String input = "Hello World";
        String modifiedOutput = replaceFirstAndLast(input);
        System.out.println(input);
        System.out.println(modifiedOutput);
    }

    private static String replaceFirstAndLast(String input) {
        if (input.length() < 2) {
            return input;
        }
        char firstChar = input.charAt(0);
        char lastChar = input.charAt(input.length() - 1);
        return lastChar + input.substring(1, input.length() - 1) + firstChar;
    }
}
