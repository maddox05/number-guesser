import java.util.Random;
public class gamestart
{
    private int maxnumber;
    private int enterednumber;

    public gamestart(int max, int usernum)
    {
        maxnumber = max;
        enterednumber = usernum;

    }
    public void gameisgoing(){
        Random rand = new Random();
        if (enterednumber <= maxnumber){
            int randomnumber = rand.nextInt(maxnumber+1);
            if(randomnumber == enterednumber){
                System.out.println("you guessed correctly! The Random Number was: " + randomnumber);
            }
            else{
                System.out.println("you guessed Incorrectly. The Random Number was: " + randomnumber);
            }

        }
        else{
            System.out.println("you must guess equal to or lower than you max number");
        }
    }

}