//Control Flow Assignments:

//1. Assignment 1

// a. Create a class SwitchCaseTest with main() method
		
	public class SwitchCaseTest {
   		public static void main(String[] args) {
        

        // For example, let's implement a switch case statement:
       			int choice = 2;
        		switch (choice) {
           			 case 1:
              			 System.out.println("You chose option 1");
                         break;
                    case 2:
                        System.out.println("You chose option 2");
                        break;
                    case 3:
                        System.out.println("You chose option 3");
                        break;
                    default:
                        System.out.println("Invalid choice");
                    }
    	}
	}

b. Declare and initialize a character variable with any alphabet

        public class CharVariableExample {
            public static void main(String[] args) {
                // Declare and initialize a character variable with the letter 'A'
                char alphabetChar = 'A';

                // Print the value of the character variable
                System.out.println("The character variable contains: " + alphabetChar);
            }
        }

c. Find if the character is a vowel and print the result

        public class CharVariableExample {
            public static void main(String[] args) {
                // Declare and initialize a character variable with the letter 'A'
                char alphabetChar = 'A';

                // Check if the character is a vowel and print the result
                if (isVowel(alphabetChar)) {
                    System.out.println(alphabetChar + " is a vowel.");
                } else {
                    System.out.println(alphabetChar + " is not a vowel.");
                }
            }

            // Function to check if a character is a vowel
            public static boolean isVowel(char ch) {
                // Convert the character to lowercase for case-insensitive comparison
                ch = Character.toLowerCase(ch);

                // Check if the character is one of the vowels
                return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
            }
        }
