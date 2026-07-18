import java.util.Scanner;

public class assignment1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = 27;
        boolean guessed = false;
        for (int i = 0; i < 5; i++) {
            int guess = sc.nextInt();
            if (guess == secret) {
                System.out.println("Congratulations");
                guessed = true;
                break;
            } else if (guess < secret) {
                System.out.println("Too Low");
            } else {
                System.out.println("Too High");
            }
        }
        if (!guessed) {
            System.out.println("Better Luck Next Time!");
        }
        sc.close();
    }
}
