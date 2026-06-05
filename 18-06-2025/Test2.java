class Test2{
	public static void main(String...a){
		int number = 786;
		if( number % 9 == 0)
		{
			System.out.print("9");
		}
	else if(number >=1 && number <= 9 ){
		System.out.print(number);
		}
	else{
		System.out.print(number % 9);
	}
}
}



#	output:	3
		