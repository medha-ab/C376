public class VowelNotFoundException {
    public static void checkForVowels(String str) throws VowelsNotFoundException {
        if (!str.toLowerCase().matches(".*[aeiou].*")) {
            throw new VowelsNotFoundException("No vowels found in the string!");
        }
    }

    public static void main(String[] args) {
        try {
            checkForVowels("Hll");
        } catch (VowelsNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
