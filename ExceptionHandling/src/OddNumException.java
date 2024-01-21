
public class OddNumException {
    public static void checkEvenNumber(int number) throws OddNumbersException {
        if (number % 2 != 0) {
            throw new OddNumbersException("Number is odd!");
        }
    }

    public static void main(String[] args) {
        try {
            checkEvenNumber(5);
        } catch (OddNumbersException e) {
            System.out.println(e.getMessage());
        }
    }
}
