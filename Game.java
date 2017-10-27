
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
	    	int weather0 = 0;//sunny
	    int weather1 = 1;//dry
	    int weather2 = 2;//cloudy w/ chance for rain
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
	    
	    	specialEventGroup();   	

    }
    
    
    
    

    private void specialEventGroup() {
		// TODO Auto-generated method stub
		
	}
	/* 
     * aaron and israels part
     */

   
    
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
