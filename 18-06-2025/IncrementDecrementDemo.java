public class IncrementDecrementDemo {
    public static void main(String[] args) {
        int n = 155;

        System.out.println("Initial value of n: " + n);

        // Post-Increment
        System.out.println("Post-Increment (n++): " + (n++)); 
        System.out.println("After Post-Increment, n: " + n);  

        // Reset n
        n = 155;

        // Pre-Increment
        System.out.println("Pre-Increment (++n): " + (++n)); 
        // Reset n
        n = 155;

        // Post-Decrement
        System.out.println("Post-Decrement (n--): " + (n--)); 
        System.out.println("After Post-Decrement, n: " + n);  

        // Reset n
        n = 155;

        // Pre-Decrement
        System.out.println("Pre-Decrement (--n): " + (--n));  
    }
}