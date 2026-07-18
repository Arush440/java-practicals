import java.util.Scanner;
public class assignment1_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<11;j++){
                System.out.println(i+ " * "+j+" = "+(i*j) );
            }
        }
        sc.close();
    }

    
}

