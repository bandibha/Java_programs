class VowelOrNot{
	public static void main(String...a){
		char ch = (a[0].toLowerCase()).charAt(0);
		switch(ch){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.print("vowel");
		break;
		default: System.out.println("not a vowel");
		break;
		}
	}
}