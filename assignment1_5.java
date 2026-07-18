import java.util.Scanner;
public class assignment1_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s, e;
        s = sc.nextInt();
        e = sc.nextInt();
        for (int i = s; i <= e; i++) {
            int t = i;
            int sum = 0;
            while (t > 0) {
                int digit = t % 10;
                int fact = 1;
                for (int j = 1; j <= digit; j++) {
                    fact *= j;
                }
                sum += fact;
                t = t / 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
        sc.close();
    }   
}
