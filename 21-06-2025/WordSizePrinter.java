/*task-2:	use the above string 'newText' and display the size of each word in that string
		Expected output: 48724

*/
class WordSizePrinter {
    public static void main(String[] args) {
        String newText = "Good Morning, Welcome to BITS";
        String[] words = newText.split("\\s+");
        String output = "";

        for (String word : words) {
            int wordLength = word.length();  // Includes symbols and punctuation
            output += wordLength;
        }

        System.out.println("Sizes of each word (with symbols): " + output);
            }
}