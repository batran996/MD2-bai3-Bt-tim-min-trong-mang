import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        int size,element;
        System.out.println("nhập sô lượng các phản tử");
        size = scanner.nextInt();
        int[] array =new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("array[" + (i+1) + "] = ");
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println(" min = " + min);
    }
}