class Prime{
	public static void main(String...a){
		int n = 13;
		if (n==1){
			System.out.println("not a prime");
		}
		else if(n==2){
			System.out.println("prime");
		}
		else if(n%2==0){
			System.out.println("not a prime");
		}
		else{
			for (int i=3; i*i<=n; i+=2) {
				if(n%i == 0)
					{
						System.out.println("not a prime");
						break;
					}
				}
				System.out.println("prime");
			}
	}
}			