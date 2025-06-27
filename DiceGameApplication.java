import java.util.*;

class DiceGameApplication{
    int roll_dice(){
        Random rand = new Random();
        int sum;
        
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        sum = dice1 + dice2;

        System.out.println("Rolling dice...");
        System.out.println("Die 1: " + dice1);
        System.out.println("Die 2: " + dice2);
        System.out.println("Total value: " + sum);

        return sum;
    }

    String Greeting(){
        System.out.println("What is your name?");
        System.out.print("> ");

        Scanner scan = new Scanner(System.in);
        String username = scan.next();

        System.out.println("Hello, " + username);
        
        return username;
    }
    
    public static void main(String args[]){
        DiceGameApplication game = new DiceGameApplication();

        String username = game.Greeting();
        int total = game.roll_dice();
    }
}