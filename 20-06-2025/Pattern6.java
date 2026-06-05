class Pattern6{
	public static void main(String...a){
		int i,j,k,l;
		i=1; j=10; k=11; l=20;
		for( ; (i<=5 || j>=6 || k<=15 || l>=16) ; ){
			System.out.println((i++)+"\t"+(j--)+"\t"+(k++)+"\t"+(l--));
		}
	}
}



/*output:

1       10      11      20
2       9       12      19
3       8       13      18
4       7       14      17
5       6       15      16

*/