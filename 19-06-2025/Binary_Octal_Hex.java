class Binary_Octal_Hex {
    public static void main(String... a) {
        int number = 12345678;
        System.out.print(Integer.toBinaryString(number));

        String binary = "1110001";
	String octal = "235";
	String hex = "A";
        int decimalFromBinary = Integer.parseInt(binary, 2);  
	int decimalFromOctal = Integer.parseInt(octal, 8); 
	int decimalFromHex = Integer.parseInt(hex, 16); 
        System.out.println("\nbinary to decimal = " + decimalFromBinary);
	System.out.println("\noctal to decimal = " + decimalFromOctal);
	System.out.println("\nhex to decimal = " + decimalFromHex);
    }
}





// Output:101111000110000101001110	binary to decimal = 113		octal to decimal = 157		hex to decimal = 10