
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.sound.midi.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Time;
public class Game
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Game
     */
    
	MidiChannel[] mChannels;
    
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
        oldGame();
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
        String i = sn.nextLine();
        clear();
        
        
        print(
        	"YOUR EXPENSES ARE THE SUM OF THE COST OF\n"+
        "THE "+PROD+" STAND AND THE COST OF THE SIGNS.\n\n"+
        	"Your profits are the difference between\n"+
        "the income from sales and your expenses.");
        
        inputTxt("Press enter to continue, esc to end...");
        String b = sn.nextLine();
        clear();
        
    }
     
 	private void oldGame()
	{
		print("HI AGAIN! welcome to lemonsville!\n"
				+ "\n"
				+ "Let's continue your last game from where\n"
				+ "You left it last Time.  Do you remember\n"
				+ "What day number it was?");
		day = inputInt("")+1;
		print("Okay we'll start with day no. " + day);
		assets = inputInt("\n"
				+ "player no. 1, how much money (assets)\n"
				+ "did you have?");
		print("Just to be fair, let's make that $10.00 ");
		print("\n"
				+ "...ready to begin?");
		String i = sn.next();
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
    private void weatherScreen() 
    {
    		System.out.println("Now let's look at the weather report to see how the day will be."); 
    		WeatherGroup();
    }
    
    
	private String inputTxt(String prompt) {
		System.out.println(prompt.toUpperCase());
		return sn.nextLine();
	}
	
	/**
	 * Allows the user to input and Int
	 * @param prompt The string to be printed to the screen
	 * @return an int value that has been input.
	 */
    
    private int inputInt(String prompt) {
    		System.out.println(prompt.toUpperCase());
    		return sn.nextInt();
    }
     
    /**
     * Asks a yes or no question and returns the user's response as a boolean.
     * @author Alejandro and Christian
     * 
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
    
    // Ismael and Mike's
    
    int glasses = 0;
    int signs = 0;
    private void day() {
    	
    
    	print("On day " +day+ "the cost of lemonade is " +cost);
    	print(PROD+" stand "+standNum+"\t assets +" +assets);
    	glasses = inputInt("how many glasses of lemonade do you\n"
    			+ "wish to make ?");
    	signs = inputInt("How many Advertising signs do you wish to make? (15 cents each)");
    	
    	
    	 
    	
    }

    


    /*
     *  Priscila, Marco and Jacob's group 
     */
    private void WeatherGroup()
    {

	    Random rand = new Random();
	    int sunny = 0;//sunny
	    int dry = 1;//dry
	    int rainy = 2;//cloudy w/ chance for rain
	    int weather = rand.nextInt(3);
	    
	    switch (weather)
	    {
		    case 0:
		    	weather0();// karen math in method
		    	break ;
		    case 1:
		    	weather1();// karen math in method
		    	break ;
		    case 2:
				weather2();// karen math in method
				
				break;
	    }   
    }
    
    private void weather0() 
    {
    	
    }
    
    private void weather1() 
    {
    	
    }
    
    private void weather2() 
    {
    	chanceRain();
    }

    private void chanceRain()
    {
	    	Random ran = new Random();
	    	int cloudyWithRain = ran.nextInt(101);
	    	double chance =((double) cloudyWithRain * 11) * 10;
	    	double weatherFactor = chance / 100;
	    	if(weatherFactor <= (double)50)
		    	{
		    	    System.out.println("No rain, what luck!");
		    	}
	    	if(weatherFactor >= (double)50)
		    	{
		    	    System.out.println("THUNDERSTORM");
		    	}
    	
    }
    private void specialEventGroup() 
    {
		// TODO Auto-generated method stub
    	Random rando = new Random();
 	    int robbery = 0;
 	    int haunted = 1;
 	    int concert = 2;
 	    int specialEvents = rando.nextInt(3);
 	    
	 	    switch (specialEvents)
	 	    {
	 		    case 0:
	 		    	event1();
	 		    	break ;
	 		    case 1:
	 		    	event2();// karen math in method
	 		    	         //   profit - 50/100
	 		    	break ;
	 		    case 2:
	 				event3();// karen math in method
	 				          // profit + 50/100
	 				break;
	 	    }
	}
    
private void robberyTime()
{
	Random ran = new Random();
	int chanceOfRobbery = ran.nextInt(101);
	double rob =((double) chanceOfRobbery * 12) * 10;
	double specialEvents = rob / 100;
	if(specialEvents > (double)50)
    	{
    	    System.out.println("You just got Robbed!");
    	}
	if( specialEvents <= (double)50)
    	{
    	    System.out.println("You escaped getting Robbed today !");
    	}
	
}

private void event1()
{
	robberyTime();
}

private void event2()
{
	
}

private void event3()
{
	
}


private void calc()
{

	Scanner scan = new Scanner(System.in);
	
	
	
	double asset = 2.00;
	double costPerGlass = 0.02;
	double signsCost = 0.15;
	
	//have to make it so that the assets change
	String intro = "You are starting off with $2.00."+
	               "You will choose how much you wish "+
	               "to spend, and that will affect your "+
	               "total amount of money.";
	System.out.println(intro);
	System.out.println();
	
	Integer glassesMade;
	System.out.print("How many glasses do you want to make? ($0.02 each): ");
	glassesMade = scan.nextInt();
	double glassTotal = costPerGlass * glassesMade;// The total amount it costs to make number of chosen glasses
	
	Integer signsBought;
	System.out.print("How many signs do you wish to put up? ($0.15 each): ");
	signsBought = scan.nextInt();
	double signsMade = (double)signsBought;// The total amount it costs to buy signs
	
	
	
	
	
	Integer PPG;
	System.out.print("How much do you want to charge per glass? (in cents): ");
	PPG = scan.nextInt();
	double pricePerGlass = (double)PPG;
	System.out.println();
	System.out.println();
	
	
	double N1 = (100) * 30 / (pricePerGlass * pricePerGlass);
	double w = (0 - signsMade) * .5;
	//adbenefit is the % increase in sales due to ads
	double adBenefit = 1 - java.lang.Math.exp(w) * 1;
	    
	double N3 = java.lang.Math.floor(weatherFactor * N1 * (1 + adBenefit));
	
	int N2 = (int)N3;
	int gm = (int)glassesMade;
	int GlassesSold = java.lang.Math.min(N2, gm);
	double income = GlassesSold * pricePerGlass / 100;
	double expensees = ((glassesMade * costPerGlass / 100) + (signsMade * signsCost));
	String expenses = String.format("%.2f", expensees);
	
	
	
	double assestss = asset + income - expensees;
	String assetss = String.format("%.2f", assestss);
	double profit = income - expensees;
	String profits = String.format("%.2f", profit);
	
	    
	
	//showResults();
	System.out.println("                   $$ Lemonsville Daily Financial Report $$             ");
	System.out.println();
	System.out.println();
	if(GlassesSold == 1)
	{
	    System.out.println(GlassesSold + " glass sold"); 
	}
	else if(GlassesSold >= 2 || GlassesSold == 0)
	{
	    System.out.println(GlassesSold + " glasses sold");
	}
	else if(weatherFactor == 0)
	{
	    if(glassesMade >= 0)
	    {
	        //updateWeatherReport(); (to create next)
	        //updating should create a storm pop up & be created by weather group
	        System.out.println("All lemonade was ruined.");
	    }
	}
	double pricePerGlass2 = pricePerGlass / 100;
	System.out.println("$ " + pricePerGlass2 + " price per glass");
	System.out.println("Income: $ " + income);
	System.out.println();
	System.out.println();
	
	if(glassesMade == 1)
	{
	    System.out.println(gm + " glass made");
	}
	else
	{
	    System.out.println(gm + " glasses made");
	}
	if(signsMade == 1)
	{
	    System.out.println(signsMade + " sign made");
	    System.out.println("Expenses: $ " + expenses);
	}
	else
	{
	    System.out.println(signsMade + " signs made");
	    System.out.println("Expenses: $ " + expenses);
	}
	System.out.println();
	System.out.println();
	System.out.println("Profit: $ " + profits);
	System.out.println("Assets: $  " + assetss);
}

/**
* Stores a user's high score for use in a video game.
* Includes the user's name (usually as 3 initials) and
* their score.  The name is immutable, but the score is
* not.
* <p>
* Also implements Comparable.
*/
public class HighScore implements Comparable<HighScore> {

 //class variables
 private static int count = 0;
 public static final int MAX_SCORE = 9000;

 //instance variables
 private String name;
 private int score;

 /**
  * Constructs a new HighScore object with the given
  * name and score.  Enforces the same restrictions on
  * score's value as {@link #setScore}.
  */
 public HighScore(String name, int score) {
   this.name = name;
   this.setScore(score);
   HighScore.count++;  //made another instance
 }

 /**
  * Constructs a new HighScore with a score of 0.
  */
 public HighScore(String name) {
   //reusing other constructor
   this(name, 0);
 }


 //instance methods

 /**
  * Can be used to sort HighScores into descending order.
  * That is, a HighScore's natural order is greatest score first.
  * See {@link Comparable} interface for more.
  * 
  * Considers only the score part of a HighScore object when sorting.
  */
 public int compareTo(HighScore other) {
   /*
    * Has to return:
    *  < 0 if this score is < than (comes before) the given other 

 score
    *  > 0 if this score is > than (comes after) the given other score
    * == 0 if the tw9o scores are equal
    *
    * Using subtraction is a good way to get this done quickly.
    * Normally, we'd use this.score - other.score, but I want
    * high scores be sorted in reverse order (as is traditional
    * this high scores).  Thus:
    */
   return other.score - this.score;
 }public String getName() {
   return this.name;
 }

 public int getScore() {
   return this.score;
 }

 /**
  * Changes this HighScore's score to the given value.
  * The new score value must be between 0 and HighScore.MAX_SCORE.
  * If less than 0, it will be set to 0; if over MAX_SCORE,
  * it will be set to MAX_SCORE.
  */
 public void setScore(int score) {
   if (score < 0) {
     this.score = 0;
   }else if (score > MAX_SCORE) {
     this.score = MAX_SCORE;
   }else {
     this.score = score;
   }
 }

 /**
  * Returns a String of the form "NAME:\tscore",
  * where \t is a tab character.
  */
 public String toString() {
   return this.name + ":\t" + this.score;
 }


 //class methods

 /**
  * Returns the total number of HighScore objects created
  * so far.
  */
 public static int getScoreCount() {
   return HighScore.count;
 }

 /**
  * Tests this class by creating and printing a few sample
  * HighScore objects.
  */
 public static void main(String[] args) {

   //create an array of HighScores
   HighScore[] scores = new HighScore[5];
   for (int i = 0; i < scores.length; i++) {
     char letter = (char) ('A' + i);
     String initials = "" + letter + letter + letter;
     scores[i] = new HighScore(initials, (i * 100) + 100);
   }

   //print scores (test toString)
   System.out.println("Array of HighScores: ");
   for (int i = 0; i < scores.length; i++) {
     System.out.println(scores[i]);
   }

   //test getScoreCount
   System.out.println();
   System.out.print("Created [5] scores? ");
   System.out.println(HighScore.getScoreCount() == scores.length);

   //test accessors
   System.out.println("First score: ");
   System.out.println("Name: " + scores[0].getName());
   System.out.println("Score: " + scores[0].getScore());

   //test 
   System.out.println();    
   System.out.println("Changing first score to...");
   scores[0].setScore(-5);
   System.out.println("negative.  [0]: " + scores[0].getScore());
   scores[0].setScore(10000);
   System.out.println("over 9000.  [9000]: " + scores[0].getScore());
   scores[0].setScore(5000);
   System.out.println("to 5000.  [5000]: " + scores[0].getScore());

   //test 2
   System.out.println();
   System.out.println("Setting 3rd score to 1000 and then sorting.");
   scores[2].setScore(1000);
   //this sort method only works because HighScore implements Comparable
   java.util.Arrays.sort(scores);
   System.out.println("Results should be in decreasing score order: ");
   for (HighScore hs : scores) {
     System.out.println(hs);
   }
 }

}











   
    
    private void playNote(int note,int length) throws InterruptedException, MidiUnavailableException {
    		mChannels[0].noteOn(note,100);
    		Thread.sleep(length);
    		mChannels[0].noteOff(note);
    		
    }
    	     
     
    
    public Game()
    {
        sn = new Scanner(System.in); //initialize critical objects
        
        /*all this stuff here is to add music..
         * @author Christian
         */
        try {
        	Synthesizer midiSynth = MidiSystem.getSynthesizer();
        	midiSynth.open();
        	
        	Instrument[] instr = midiSynth.getDefaultSoundbank().getInstruments();
        	mChannels = midiSynth.getChannels();
        	
        	midiSynth.loadInstrument(instr[0]);
        	
        	mChannels[0].noteOn(60, 1000);
        	try {Thread.sleep(1000);
        	} catch(InterruptedException e) { }
        	mChannels[0].noteOff(60);
        	 
        	  playNote(52,750);
          playNote(52,250);
          playNote(55,250);
          playNote(52,250);
          playNote(50,250);
          playNote(48,500);
          playNote(47,250);




              
        	
        	} catch(MidiUnavailableException e) {} catch(InterruptedException d) {}
        	
      
        
        intro(); //present introduction information
        
        weatherScreen();
        day();
        
        x = 0;
    }
    
     
    
     
    
    public static void main(String[] args){
        
        new Game();
    }
//test
}
