//java Programing to demonnstrate thr guessing game
import java.util.Scanner;
  class  Number_Guessing_game {
    public static void guessingNumberGame()
    {
        Scanner sc = new Scanner (System.in);

        //genrate a random number between 1 and 100
        int number =1+ (int )(100*Math.random());
        
        //number of attempt's
        int K = 5;
        System.out.print("Guess a number between 1 and 100. You have "+K+" attempts.");

        //loop for K attempts
        for(int i=0;i<K;i++){
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
             
            //chek conditions
            if(guess == number){
                System.out.println("Congratulations! You guessed the correct number .");
                sc.close();

                //Exit function if guessed correctly
                return;

            }
            else if (guess<number){
                System.out.println("the number is greater than " + guess);

            }
            else{
                System.out.println("The number is less than " +guess);
            }
        }
        //If the user runs out of attempts
        System.out.println ("you 've exhausted all attempts. the correct number was :" + number);
        sc.close();

        
    }
        public static void main(String[] args) {
            guessingNumberGame();
        
           
        }
    }
