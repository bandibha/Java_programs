public class StringToArray {
    public static void main(String[] args) {
        String n = "12345";
        char[] digits = n.toCharArray();

        for (char digit : digits) {
            System.out.println(digit);
        }
    }
}