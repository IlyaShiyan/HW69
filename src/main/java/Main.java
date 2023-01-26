import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();

        System.out.println("length 1 = " + a.length());

        System.out.printf("length 2 = %s \n",b.length());

        try (PrintWriter pw = new PrintWriter(System.out)){
            pw.println("length 3 = " + c.length());
        }
    }
}
