class BinarySearch{
	public static void main(String...a) {
		int ar[] = {76,3,7,635,32,65,332,46};
		int element = 32;
		//step-1	sort
		Arrays.sort(ar);

		//step-2:	search using built-in method
		int index = (Arrays.binarySearch(ar, element));

		if (index < 0){
			System.out.print(element+" not found");
		}
		else{
			System.out.print(element+ " found at "+(index+1)+"position");
		}
	}
}
		