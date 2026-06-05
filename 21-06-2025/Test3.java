class Test3{
	public static void main(String...a){
		String s1 = "Welcome to Balaji Institute of Technology and Science";
		String s2 = s1.toLowerCase();

		System.out.println(s2);
		System.out.println(s1.toUpperCase());

		//number of characters in a string
		System.out.println("# of charecters = "+s1.length());
		
		String searchText = "to";
		int index = s1.indexOf(searchText);

		if(index > 0){
			System.out.println("the given word "+searchText+" is found at " +index);
		}
		else{
			System.out.println("not found");
		}
	}
}





/*
welcome to balaji institute of technology and science
WELCOME TO BALAJI INSTITUTE OF TECHNOLOGY AND SCIENCE
# of charecters = 53
the given word to is found at 8


*?

