class Test{
	public static void main(String...a){
		int number=12345;
		String str = String.valueOf(number);
		System.out.print("# of digits = " +str.length());

		String s2= Integer.toString(number);
		System.out.println("# of digits = " +s2.length());
	}
}