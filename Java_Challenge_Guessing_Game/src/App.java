import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Welcome User : )");
        System.out.println("Please Enter You Name :");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        System.out.println("Hello " + name);

        int start;

        System.out.println("Should we start the game press 1 if yes, else press 0");

        start = scanner.nextInt();

        if(start==0) {
            System.out.println(":(");
        }
        else if(start==1) {
            System.out.println("Launching the game");
            int playCount = 0;
            String higher = "Guess a higher number than entered number";
            String lower = "Guess a lower number than entered number";
            Random random = new Random();
            int answer = abs(random.nextInt())%16;
            while(playCount<5) {
                int guess = scanner.nextInt();
                if(guess==answer){
                    System.out.println(
                        "Congo you won"
                    );
                    break;
                }
                else{
                    playCount++;
                    if(guess<answer){
                        System.out.println(higher);
                    }
                    else{
                        System.out.println(lower);
                    }
                }
            }
            if(playCount==5)
                System.out.println("Game Over :(");
        }
        else {
            System.out.println("please enter valid choice");
        }


    }

    private static int abs(int nextInt) {
        if(nextInt<0)
            return -1*nextInt;
        else 
            return nextInt;
    }
}
