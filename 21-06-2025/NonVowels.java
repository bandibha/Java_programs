//task-3 :	use the above string, display only non-vowels
//expected o/p:	Gd Mrnng, Wlcm t BTS

class NonVowels{

	static boolean isVowel(char c){

		int index = "aeiouAEIOU".indexOf(c);

		return index > 0 ? true : false;

	}

	public static void main(String...a){

		String newText = "Good Morning, Welcome to BITS";

		String op="";

		for(int i=0; i<newText.length(); i++){

			if(!isVowel(newText.charAt(i)) ){

			op+=newText.charAt(i);

		}

	}

	System.out.print(op);

	}

}



//	Gd Mrnng, Wlcm t BTS