class Test1{
	public static void main(String...a){
		String str1 = "Hello";
		String str3 = "Hello";

		String str4 = new String("Hello");

		if(str1 == str3){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not Equal");
		}

		if(str3 == str4){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not Equal");
		}
	}
}





//output:	Equal		Not Equal