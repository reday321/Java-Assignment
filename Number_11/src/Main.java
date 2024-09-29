public class Main {
        public static void main(String[] args) {
            String input = "I am a SQA Engineer";
            String result = input.replaceAll("[AEIOUaeiou]", "");
            System.out.println(result);
        }
    }

