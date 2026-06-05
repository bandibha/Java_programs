//task-5:	display only the uppercase characters
//expected o/p:		GMWBITS


class UppercaseExtractor {
    public static void main(String[] args) {
        String newText = "Good Morning, Welcome to BITS";
        String result = "";

        for (char ch : newText.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result += ch; // Concatenate directly to the string
            }
        }

        System.out.println(result);
    }
}




//	GMWBITS