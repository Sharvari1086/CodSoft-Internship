import java.util.Scanner;
import java.util.Random;
public class NumberGame {
    public static void main(String args[])
    {   Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int ans=random.nextInt(100)+1;
        int trials = 3;
        boolean correct=false;
        System.out.println("***************NUMBER GUESSSING GAME****************\n");
        while(trials>0) {
            System.out.println("Guess a number between 1 to 100 in 3 tries");
            int guess = sc.nextInt();
            if (guess == ans) {
                System.out.println("Congratulations you guessed the number right!!!");
                break;
            }
            else if(guess>ans)
            {
                System.out.println("Sorry the answer you have guessed is high");
                System.out.println("You have"+" " +(trials-1) +" "+ "tries left\n");
                trials--;
            }
            else if(guess<ans)
            {
                System.out.println("Sorry the answer you have guessed is low.");
                System.out.println("You have"+" "+(trials-1) +" "+ "tries left\n");
                trials--;
            }

        }
        if(correct==false)
        {
            System.out.println("Sorry you ran out of trials.The number was"+ " "+ans);
        }
    }
}
