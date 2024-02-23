import java.util.Scanner;

public class WordCount {
    public static int nextSpacePosition(String str, int from) {
        int length = str.length();
        for (int i = from; i < length; i++) {
            if (str.charAt(i) == ' ') {
                return i;
            }
        }
        return length;
    }

    public static int nextNonSpacePosition(String str, int from) {
        int length = str.length();
        for (int i = from; i < length; i++) {
            if (str.charAt(i) != ' ') {
                return i;
            }
        }
        return length;
    }

    public static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String input1 = "Helloworld!";
        int position1 = nextSpacePosition(input1, 0);
        System.out.println("Next space position: " + position1);

        String input2 = "   Hello World!";
        int position2 = nextNonSpacePosition(input2, 0);
        System.out.println("Next non-blank space position: " + position2);

		String input3 = "This is a sample sentence.";
		int wordCountInput3 = countWords(input3);
		System.out.println("Number of words in input3: " + wordCountInput3);

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String userInput = scanner.nextLine();

		int wordCountUserInput = countWords(userInput);
		
		int spacePosUserInput = nextSpacePosition(userInput, 0);
		
		int nonSpacePosUserInput = nextNonSpacePosition(userInput, 0);

		System.out.println("Number of words in user input: " + wordCountUserInput);
		System.out.println("Next space position in user input: " + spacePosUserInput);
		System.out.println("Next non-blank space position in user input: " + nonSpacePosUserInput);

		scanner.close();
    }
}