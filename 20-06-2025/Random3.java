import java.util.Random;

class  Random3{
	public static void main(String...args){
		Random r = new Random();
		
		int a = Math.abs(r.nextInt()) %10;
		int b = Math.abs(r.nextInt()) %10;

		System.out.println(a+" "+b);
	
		int c = a+b;

		System.out.print("sum = "+c);
	}
}



/*
0 9
sum = 9
*/
