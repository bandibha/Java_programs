import java.util.Random;

class  Random5{
	public static void main(String...args){
		Random r = new Random();
		
		int a = Math.abs(r.nextInt()) % 900 + 100;
		int b = Math.abs(r.nextInt()) % 900 + 100;

		System.out.println(a+" "+b);
	
		int c = a+b;

		System.out.print("sum = "+c);
	}
}