
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Game
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Game
     */
    
    final String PROD = "LEMONADE";
    final String LEM = "LEMON";
    final String UNT = "GLASSES";
    final String SUGAR = "SUGAR,";
    
    public int day = 1;
    public int standNum = 1;
    public double assets = 2.00;
    public double cost = .02;
    
    
    Scanner sn;
    
     void intro(){
        System.out.println(
        "HI WELCOME TO "+LEM+"SVILLE, CALIFORNIA!\n\n"+
        "IN THIS SMALL TOWN, YOU ARE IN CHARGE OF\n"+
        "RUNNING YOUR OWN "+PROD+" STAND. YOU CAN\n"+
        "COMPETE WITH AS MANY OTHER PEOPLE AS YOU\n"+
        "WISH, BUT HOW MUCH PROFIT YOU MAKE IS UP\n"+
        "TO YOU (THE OTHER STAND'S SALES WILL NOT\n"+
        "AFFECT YOUR BUSINESS IN ANY WAY). IF YOU\n"+
        "MAKE THE MOST MONEY, YOU'RE THE WINNER!!\n\n");
        
        if (yesNo(
        "ARE YOU STARTING A NEW GAME (YES OR NO)")){
        	clear();
        	print("started new game");
        }
        else {
        	clear();
        	print("started old game");
        }
        
        
        
         
        print(
        "TO MANAGE YOUR "+PROD+" STAND, YOU WILL\n"+
        "NEED TO MAKE THESE DECISIONS EVERY DAY:\n\n"+
        "1. HOW MANY "+UNT+" OF "+PROD+" TO MAKE\n"+
        "   (ONLY ONE BATCH IS MADE EACH MORNING)\n"+
        "2. HOW MANY ADVERTISING SIGNS TO MAKE\n"+
        "   (THE SIGNS COST FIFTEEN CENTS EACH)\n"+
        "3. WHAT PRICE TO CHARGE FOR EACH GLASS\n");
        
        print(
        "YOU WILL BEGIN WITH $2.00 CASH (ASSETS).\n"+
        "BECAUSE YOUR MOTHER GAVE YOU SOME "+SUGAR+"\n"+
        "YOUR COST TO MAKE LEMONADE IS TWO CENTS\n"+
        "A GLASS (THIS MAY CHANGE IN THE FUTURE).");
        
        inputTxt("PRESS ENTER TO CONTINUE, ESC TO END...");
        clear();
        
        
        print(
        	"YOUR EXPENSES ARE THE SUM OF THE COST OF\n"+
        "THE "+PROD+" STAND AND THE COST OF THE SIGNS.\n\n"+
        	"Your profits are the difference between\n"+
        "the income from sales and your expenses.");
        
        inputTxt("Press enter to continue, esc to end...");
        
        clear();
        
        
        
        
        
        
        
        
        
    }
   //this method acts like it clears the screen.
    
    private void clear()
    	{
    		char c = '\n';
    		int length = 25;
    		char[] chars = new char[length];
    		Arrays.fill(chars, c);
    		System.out.print(String.valueOf(chars));
    	}
    
    		private void print(String text)
    		{
    			System.out.println(text.toUpperCase());
    		}
    
    /*
     * TODO: Create actual weather randomizing system.
     
     */
    private void weatherScreen() {
    	System.out.println("It is currently sunny"); 
    }
    
    
    			private String inputTxt(String prompt)
    			{
    				System.out.println(prompt.toUpperCase());
    				return sn.nextLine();
    			}
    
    private int inputInt(String prompt) {
    		System.out.println(prompt.toUpperCase());
    		return sn.nextInt();
    }
    
    /**
     * Asks a yes or no question and returns the user's response as a boolean.
     * @author Alejandro and Christian
     * 
     * repsonse as a boolean.
     * 
     * @param prompt The string to print to the screen
     * @return Returns a boolean true if yes or y is entered, returns false if anything else is.
     */
    private boolean yesNo(String prompt) {
    		System.out.println(prompt.toUpperCase());
    		String answer = sn.nextLine().toUpperCase();
    		if (answer.equals("YES")||answer.equals("Y")) {
    			return true;
    		}
    		else {
    			return false;
    		}
    	 
    }
    
    
    
    private void day() {
    	int glasses;
    	print("On day "+day+"the cost of lemonade is "+cost);
    	print(PROD+" stand "+standNum+"\t assets +" +assets);
    	glasses = inputInt("how many glasses of lemonade do you\n"
    			+ "wish to make ?");
    	int signs = inputInt("How many Advertising signs do you wish to make? (15 cents each)");
    	
    }

    


    /*
     *  Priscila, Marco and Jacob's group 
     */
    private void WeatherGroup()
    {

    Random rand = new Random
    	int weather1 = 0;
    int weather2 = 1;
    int weather3 = 2;
    int weather4 = 3;
    int 

    	
    }
    
    
    
    
    /* 
     * aaron and israels part
     */
   
    
    	     
     
    
    public Game()
    {
        sn = new Scanner(System.in); //initialize critical objects
        intro(); //present introduction information
        
        weatherScreen();
        
        
        x = 0;
    }
    
    
    
    
    
    public static void main(String[] args){
        
        new Game();
    }
//test
}
