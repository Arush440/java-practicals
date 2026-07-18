import java.util.Scanner;
public class assignment1_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int number;
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter your no.");
            number=sc.nextInt();
            if(number%2==0){
                System.out.println("--> Even");
            }
            else{
                System.out.println("--> Odd");
            }
        }
        sc.close();
    }
}
