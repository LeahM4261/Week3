import java.util.Scanner;

public class WordCount {
    // Method to find the next space position in a string
    public static int nextSpacePosition(String str, int from) {
        int length = str.length();
        for (int i = from; i < length; i++) {
            if (str.charAt(i) == ' ') {
                return i;
            }
        }
        return length;
    }

    // Method to find the next non-blank space position in a string
    public static int nextNonSpacePosition(String str, int from) {
        int length = str.length();
        for (int i = from; i < length; i++) {
            if (str.charAt(i) != ' ') {
                return i;
            }
        }
        return length;
    }

    // Method to count the number of words in a string
    public static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        // Explanation of program.
        System.out.println("\nThis program demonstrates various string manipulation methods including:");
		System.out.println("- Finding the next space position");
		System.out.println("- Finding the next non-blank space position");
		System.out.println("- Counting the number of words in a sentence\n");

        //Examples of results of the methods.
		String[] exampleSentences = {"Hello world!", "   Here comes the sun.", "The miniature pet elephant became the envy of the neighborhood."};

		for (String sentence : exampleSentences) {
			int wordCountExample = countWords(sentence);
			int spacePosExample = nextSpacePosition(sentence, 0);
			int nonSpacePosExample = nextNonSpacePosition(sentence, 0);

			System.out.println("\nSentence: " + sentence);
			System.out.println("Number of words: " + wordCountExample);
			System.out.println("Next space position: " + spacePosExample);
			System.out.println("Next non-blank space position: " + nonSpacePosExample);
		}

        Scanner scanner = new Scanner(System.in);
		String userInput;
        //Where the user starts adding strings to see how the methods work.
		do {
			System.out.print("\nEnter a sentence (or type 'exit' to quit): ");
			userInput = scanner.nextLine();

			if (!userInput.equalsIgnoreCase("exit")) {
				int wordCountUserInput = countWords(userInput);
				int spacePosUserInput = nextSpacePosition(userInput, 0);
				int nonSpacePosUserInput = nextNonSpacePosition(userInput, 0);

				System.out.println("\nNumber of words in user input: " + wordCountUserInput);
				System.out.println("Next space position in user input: " + spacePosUserInput);
				System.out.println("Next non-blank space position in user input: " + nonSpacePosUserInput);
			}
		} while (!userInput.equalsIgnoreCase("exit"));

		scanner.close();
    }
}