public class StringManipulation {
    public static void main(String[] args) {
        String sampleInput = "abcxXXcxerxxXXwer";
        String modifiedOutput = processString(sampleInput);
        System.out.println(modifiedOutput);
    }

    private static String processString(String input) {
        String output = "";
        String xs = "";

        for (char ch : input.toCharArray()) {
            if (ch == 'x') {
                xs += ch;
            } else {
                output += ch;
            }
        }

        return output + xs;
    }
}
