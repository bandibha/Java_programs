import java.lang.StringBuffer;

class ReverseNumber1 {
	public static void main(String...a){
		int number = 12345;
		String n = Integer.toString(number);
		StringBuffer sb = new StringBuffer(n);
		System.out.println(sb.reverse().toString());
	}
}