public class ExtractInitials {
    public static void main(String[] args) {
        String input = "Softra Services Limited";
        String output = extractInitials(input);
        System.out.println(input);
        System.out.println(output);
    }

    private static String extractInitials(String input) {
        String[] words = input.split("\\s+");
        String initials = "";

        for (String word : words) {
            if (!word.isEmpty()) {
                initials += word.charAt(0);
            }
        }

        return initials;
    }
}
