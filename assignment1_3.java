import java.util.Scanner;
public class assignment1_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            boolean isprime = true;
            if (i <= 1) {
                continue;
            }
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
