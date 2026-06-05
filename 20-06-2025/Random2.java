import java.util.Random;

class  Random2{
	public static void main(String...args){
		Random r = new Random();
		
		int a = Math.abs(r.nextInt());
		int b = Math.abs(r.nextInt());

		System.out.println(a+" "+b);
	
		int c = a+b;

		System.out.print("sum = "+c);
	}
}



/*
870511403 2016453917
sum = -1408001976

*/