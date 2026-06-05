public class SecondDigitAddition {
    public static void main(String[] args) {
        int number1 = 786;
        int number2 = 432;


        int secondDigit1 = (number1 / 10) % 10; 
        int secondDigit2 = (number2 / 10) % 10; 

        int sum = secondDigit1 + secondDigit2;

        System.out.println("Sum of 2nd digits: " + sum);
    }
}
