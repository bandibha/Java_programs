//task-1 :	Extract all the vowel characters from the below given string and display.
class VowelExtractor {
    public static void main(String[] args) {
        String newText = "Good Morning, Welcome to BITS";
        String vowels = "";

        for (int i = 0; i < newText.length(); i++) {
            char ch = newText.charAt(i);
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                vowels += ch;
            }
        }

        System.out.println("Vowels in the string: " + vowels);
    }
}



//	Vowels in the string: oooieoeoI