import java.util.Random;

class  Random4{
	public static void main(String...args){
		Random r = new Random();
		
		int a = Math.abs(r.nextInt()) % 9 + 1;
		int b = Math.abs(r.nextInt()) % 9 + 1;

		System.out.println(a+" "+b);
	
		int c = a+b;

		System.out.print("sum = "+c);
	}
}