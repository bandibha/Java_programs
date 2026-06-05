class Test5{
	public static void main(String...a){
		String s1 = "Welcome to BITS college. It is good to start training ";
		String searchText = "to";

		int index = s1.lastIndexOf(searchText);

		if(index > 0){
			System.out.println("found at "+index+" position");
		}
		else{
			System.out.println("not found");
		}
	}
}









//found at 36 position