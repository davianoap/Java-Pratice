import java.util.Scanner;
public class Practice7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Masukkan nilai A : ");
        int a = sc.nextInt();
        int i;
        
        for(i = 1; i<=10;i++) {
            System.out.println(a+"X"+i+"="+a*i);
        }
    }
}
