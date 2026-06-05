public class TextProcessor {
    public static void main(String[] args) {
        String text = "hai welcome , 1how6are7you?";
        StringBuilder digitsOnly = new StringBuilder();
        StringBuilder maskedText = new StringBuilder();
        int sum = 0;

        for (char ch : text.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitsOnly.append(ch);
                maskedText.append(ch);
                sum += ch - '0';
            } else {
                maskedText.append('*');
            }
        }

        System.out.println("Digits only     : " + digitsOnly);
        System.out.println("Sum of digits   : " + sum);
        System.out.println("Masked Text     : " + maskedText);
    }
}