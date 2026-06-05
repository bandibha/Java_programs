class One {
    int x = 123;
    int y = 246;
}

class Two {
    int add() {
        One o = new One();
        return o.x + o.y;  
    }
}

class MainClassDemo1 {
    public static void main(String[] args) {
        Two t = new Two();           
        int result = t.add();        
        System.out.println("Sum = " + result);  
    }
}
