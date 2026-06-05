class TestBinary {
    public static void main(String... a) {
        int number = 12345678;
        System.out.print(Integer.toBinaryString(number));

        String binary = "1110001";
        int decimal = Integer.parseInt(binary, 2);  // Convert binary to decimal
        System.out.println("\nbinary to decimal = " + decimal);
    }
}

		





//output:101111000110000101001110	binary to decimal = 113