class Array{
	public static void main(String...a){
		//declaring and defining an array with elements
		int[] ar ={1,2,3,4,5,6,7,8,9,10};

		//to print the elements
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]+" ");
		}

		//using foreach statement
		for (int n: ar) {
		System.out.print(n+" ");
		}
	}
}
