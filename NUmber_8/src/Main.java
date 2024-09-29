public class Main {
    public static void main(String[] args) {

        String input = "I am a SQA Engineer";

        int wordCount = 0;
        int charCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        boolean isWord = false;

        char[] inputArray = input.toCharArray();

        for (int i = 0; i < inputArray.length; i++) {
            char c = inputArray[i];

            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                charCount++;
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                        c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
                isWord = true;
            } else if (c == ' ' || i == inputArray.length - 1) {
                if (isWord) {
                    wordCount++;
                    isWord = false;
                }
            }
        }


        if (isWord) {
            wordCount++;
        }


        System.out.println("Words: " + wordCount);
        System.out.println("Chars: " + charCount);
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}
