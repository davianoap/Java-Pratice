import java.util.Scanner;
public class Practice6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukkan nilai A : ");
        int a = sc.nextInt();
        System.out.println("Masukkan nilai B : ");
        int b = sc.nextInt();

        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a % b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }
}
