public class Main {
        public static void main(String[] args) {

            String input = "I live in Dhaka";

            int[] charCount = new int[26];

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (c >= 'a' && c <= 'z') {
                    charCount[c - 'a']++;
                } else if (c >= 'A' && c <= 'Z') {
                    charCount[c - 'A']++;
                }
            }

            for (int i = 0; i < 26; i++) {
                if (charCount[i] > 0) {
                    System.out.println((char) (i + 'a') + " " + charCount[i]);
                }
            }
        }
    }
