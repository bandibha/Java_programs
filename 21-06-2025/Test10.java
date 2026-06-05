import java.util.StringTokenizer;
class Test10{
	public static void main(String...a){
		String s = "Hello, welcome to bits";

		String delimiter=" ";

		StringTokenizer st = new StringTokenizer(s, delimiter);

		int nTokens = st.countTokens();

		System.out.println("No. of tokens = "+nTokens);

		String[] sNew = new String[st.countTokens()];

		for(int i=0; i<sNew.length; i++){
			sNew[i] = st.nextToken();
		}
		
		//print the array 'sNew'
		
		for(String temp: sNew) {
			System.out.print(temp+" ");
		}

		System.out.println();

		//reversing every token and printing
		
		for(String tmp : sNew){
			for(int i=tmp.length()-1; i>=0; i--){
				System.out.print(tmp.charAt(i));
			}
			System.out.print(" ");			
		}
	}
}


