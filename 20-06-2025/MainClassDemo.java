class One {
    static int x=123;
    static int y=246;
 }
 class Two {
    static int add(){
        return One.x + One.y;

    }
 }
 class MainClassDemo{
    public static void main(String args[]){
        System.out.println("Sum = "+Two.add());
    }
 }