import java.util.Arrays;

class BinarySearch2 {
    public static void main(String... a) {
        Integer ar[] = {76, 3, 7, 635, 32, 65, 332, 46}; 
        int element = 32;

        // indexOf works correctly with Integer[]
        int index = Arrays.asList(ar).indexOf(element);

        if (index < 0) {
            System.out.println(element + " not found");
        } else {
            System.out.println(element + " found at " + (index + 1) + " Position");
        }
    }
}
