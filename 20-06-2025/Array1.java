class Array1{
	public static void main(String...a){
		int[] array = {1,2,3,4,5};
		//print
		for (int i=0; i<array.length; i++){
			System.out.print(array[i]);
		}
		//using enhanced for-loop
		for (int n:array){
			System.out.print(n);
		}
	}
}


/*output:
1234512345
*/