public class NextAlphabet {
        public static void main(String[] args) {
                String str = "hello java";
                String output = getNextCharacter(str);
                System.out.println(str);
                System.out.println(output);
            }
            public static String getNextCharacter(String str) {
                char[] result = new char[str.length()];
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (Character.isAlphabetic(ch)) {
                        char startchar = Character.isLowerCase(ch) ? 'a' : 'A';
                        char nextChar = (char) ((ch - startchar + 1) % 26 + startchar);
                        result[i] = nextChar;
                    } else {
                        result[i] = ch;
                    }
                }
                return new String(result);
            }
}
