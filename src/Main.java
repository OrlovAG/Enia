import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/INPUT.txt"));

        int N, A, B;
        N = scanner.nextInt();
        A = scanner.nextInt();
        B = scanner.nextInt();

        System.out.println(2 * A * B * N);

        scanner.close();
    }
}