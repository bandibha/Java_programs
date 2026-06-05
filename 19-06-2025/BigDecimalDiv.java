import java.math.BigDecimal;
import java.math.RoundingMode;

class BigDecimalDiv{
	public static void main(String...a) {
		String n1 ="12345678910111213";
		String n2 ="91011121314151617";
		BigDecimal number1 = new BigDecimal(n1);
		BigDecimal number2 = new BigDecimal(n2);
		BigDecimal n3 = number1.add(number2);
		
		BigDecimal number4 = number2.divide(number1, 2, RoundingMode.CEILING);
		System.out.println(number4);
	}
}
