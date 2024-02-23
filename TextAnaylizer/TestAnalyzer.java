public class TestAnalyzer {

    public static int countCharacters (String input){
        if (input == null){
            return 0;
        }

        String noSpaces = input.replace(" ", "");
        return noSpaces.length();
    }

    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }
        String[] words = input.trim().split("\\s+");

        return words.length;
    }

    public static int countUniqueWords(String input){
        if (input == null || input.trim().isEmpty()){
            return 0;
        }
        String[] words = input.toLowerCase().trim().split("\\s+");

        java.util.Arrays.stream(words).distinct().forEach(System.out::println);

        return (int) java.util.Arrays.stream(words).distinct().count();
    }
    

    public static void main(String[] args){
        String testString = "Hello world, hello Java. Hello again!";

        System.out.println("\nCharacter count (excluding spaces): " +countCharacters(testString));
        System.out.println("\nWord count: " +countWords(testString));
        System.out.println("\nUnique word (case-insensitive): "+countUniqueWords(testString));
        System.out.println("\nAnalyzed Test String: " +(testString));
    }


}