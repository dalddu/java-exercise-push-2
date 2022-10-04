import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("hello");        // alt + shift +f10

        int[] arr = new int[10];
        for(int i=0; i<10; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
