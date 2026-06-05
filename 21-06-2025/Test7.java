class Test7 {
    public static void main(String args[]){
        String a = "Hello";
        String b= "hello";
        int result =  a.compareToIgnoreCase(b);
        if(result > 0)
        System.out.println(a+" is bigger than " +b);
        else if(result < 0)
        System.out.println(a+" is smaller than " +b);
        else 
        System.out.println(a+" is equals  than " +b);

    }
}




//	Hello is equals  than hello