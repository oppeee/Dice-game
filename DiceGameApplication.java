import java.util.*

class DiceGameApplication{
    int roll_dice(void){
        Random rand = new Random();
        int sum;
        
        dice1 = rand.nextInt(6) + 1;
        dice2 = rand.nextInt(6) + 1;
        sum = dice1 + dice2;

        System.out.println("Total value: " + sum);

        return sum;
    }

    public static void maiin(String args[]){
        int total = roll_dice;
    }
}