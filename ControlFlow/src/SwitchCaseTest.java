public class SwitchCaseTest {
    public static void main(String[] args) {
        char character = 'a';
        switch (character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(character + " is a vowel.");
                break;
            default:
                System.out.println(character + " is not a vowel.");
        }
    }
}