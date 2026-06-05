public class LastDigitSum {
    public static void main(String[] args) {
        int n1 = 12345;
        int n2 = 67891;
        int lastDigitSum = (n1 % 10) + (n2 % 10);
        System.out.println("Last digit sum: " + lastDigitSum);
    }
}