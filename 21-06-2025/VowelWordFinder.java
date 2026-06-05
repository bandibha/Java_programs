//task-4: display a word which  has more than 2 vowels
// expected o/p :	Welcome


class VowelWordFinder {
    public static void main(String[] args) {
        String newText = "Good Morning, Welcome to BITS";
        String[] words = newText.split("[\\s,]+"); // Split by space or comma

        for (String word : words) {
            if (countVowels(word) > 2) {
                System.out.println(word);
            }
        }
    }

    private static int countVowels(String word) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : word.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}




//	Welcome