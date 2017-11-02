

import javax.sound.midi.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Time;
import java.text.DecimalFormat;

public class Game
{
    // instance variables - replace the example below with your own
    DecimalFormat df;
    
    final int TEMPO = 126*1000; //tempo of song
    final int WHOLE = TEMPO/60;
    final int HALF = WHOLE/2;
    final int QUART = HALF/2;
    final int EIGTH = QUART/2;
    final int SIXT  = EIGTH/2;
    
    final int TRIP = HALF/3;
    
    MidiChannel[] mChannels;
    
    
    final int bpm = 126;
    final int quart = 126/60;
    final int half = 0;
    
    int weatherFactor;
    

    
    final String PROD = "LEMONADE";
    final String LEM = "LEMON";
    final String UNT = "GLASSES";
    final String SUGAR = "SUGAR,";

    
    public int day = 1;
    public int standNum = 1;
    public double asset = 2.00;
    public double profit = 0;
    public double cost = .02;
    public int GlassesSold;
    
    
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
        clear();
        
        
        print(
        	"YOUR EXPENSES ARE THE SUM OF THE COST OF\n"+
        "THE "+PROD+" STAND AND THE COST OF THE SIGNS.\n\n"+
        	"Your profits are the difference between\n"+
        "the income from sales and your expenses.");
        
        inputTxt("Press enter to continue, esc to end...");
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
		asset = inputInt("\n"
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
    		
    	
    
    
    private void weatherScreen() 
    {
    		System.out.println("Now let's look at the weather report to see how the day will be."); 
    		
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
		    	weather0();
		    	break ;
		    case 1:
		    	weather1();
		    	break ;
		    case 2:
				weather2();
				
				break;
	    }   
    }
    
    private void weather0() 
    {
    	System.out.println("Todays weather forecast is Sunny.");
    	weatherFactor = 1;
    }
    
    private void weather1() 
    {
    	System.out.println("Todays weather forecast is extremely dry.");
    	weatherFactor = 2;
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
	    	double factor = chance / 100;
	    	if(factor <= (double)50)
		    	{
		    	    System.out.println("Todays weather forecast is: No rain, what luck!");
		    	    weatherFactor = (int) factor; 
		    	}
	    	if(factor >= (double)50)
		    	{
		    	    System.out.println("Todays weather forecast is: THUNDERSTORM!");
		    	    weatherFactor = 0; 
		    	}
    	
    }
    private void specialEventGroup() 
    {
		// TODO Auto-generated method stub
    	Random rando = new Random();
 	    int robbery = 0;
 	    int haunted = 1;
 	    int concert = 2;
 	    int nothing = 3;
 	    int specialEvents = rando.nextInt(4);
 	    
	 	    switch (specialEvents)
	 	    {
	 		    case 0:
	 		    	robberyTime();
	 		    	break ;
	 		    
	 		    case 1:
	 		    	hauntedTime();// karen math in method      //   profit - 50/100
	 		    	break ;
	 		    
	 		    case 2:
	 			concertTime();// karen math in method         // profit + 50/100
	 			break;
	 		    
	 		    case 3:
	 		    	nothingTime();
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
    	    asset = asset*.25;
    	}
	if( specialEvents <= (double)50)
    	{
    	    System.out.println("You escaped getting Robbed today !");
    	}
	
}

private void hauntedTime()
{
	print("UH OH! The non-copyright infringing Ghostblasters didn't show up to work today, so no one showed up to your stand. Your profit for the day a is 0.");
	GlassesSold = 0;
}

private void concertTime()
{
	print("Great to be you! Some performer you never heard of has come to town. Business is booming and you gain extra money today.");
	GlassesSold *= 1.25;
}

private void nothingTime()
{
	print("How boring nothing happened...");
}


private void calc()
{
	Scanner scan = new Scanner(System.in);
    
    
    
    
    
    double costPerGlass = 0.02;
    double signsCost = 0.15;
    
    //have to make it so that the assets change
    String intro = "You are starting off with " + form(asset) + " dollars." +
                   "You will choose how much you wish \n"+
                   "to spend, and that will affect your \n"+
                   "total amount of money.";
    System.out.println(intro);
    System.out.println();
    int glassesMade;
        do {
      System.out.print("How many glasses do you want to make? ($0.02 each): ");
      while(!scan.hasNextInt()) {
        String input = scan.next();
        System.out.printf("'%s' is not a valid number.\n", input);
      }
      glassesMade = scan.nextInt();
    } while(glassesMade < 0);
    
   // prints cost and assets
    double checkGMValidation = glassesMade * costPerGlass;
    
    double newAsset = asset - checkGMValidation;
    
   
    if(checkGMValidation > asset) {
        while(checkGMValidation > asset) {
            System.out.print("\nYou don't have enough money");
            do {
                System.out.print("\nHow many glasses do you want to make? ($0.02 each): ");
            while(!scan.hasNextInt()) {
                String input = scan.next();
                System.out.printf("'%s' is not a valid number.\n", input);
            }
            glassesMade = scan.nextInt();
            checkGMValidation = glassesMade * costPerGlass;
              
                newAsset = asset - checkGMValidation;
               
            } while(glassesMade < 0);
        }
        
    }



    int signsMade;    
    do {
      System.out.print("\nHow many signs do you wish to put up? ($0.15 each): ");
      while(!scan.hasNextInt()) {
        String input = scan.next();
        System.out.printf("'%s' is not a valid number.\n", input);
      }
      signsMade = scan.nextInt();
    } while(signsMade < 0);
    
    double checkSBValidation = signsMade * signsCost;
    
    newAsset -= checkSBValidation;
    
    double assetSB;
    
        if(checkSBValidation > newAsset) {
            while(checkSBValidation > newAsset) {
                System.out.print("\nYou don't have enough money");
            do {
                System.out.print("\nHow many signs do you wish to put up? ($0.15 each): ");
            while(!scan.hasNextInt()) {
                String input = scan.next();
                System.out.printf("'%s' is not a valid number.\n", input);
                }
            signsMade = scan.nextInt();
            checkSBValidation = signsMade * signsCost;
                
                newAsset = asset - checkSBValidation;
            } while(signsMade < 0);
            }
        
    }

    double pricePerGlass;
    do {
      System.out.print("\nHow much do you want to charge per glass? (in cents): ");
      while(!scan.hasNextInt()) {
        String input = scan.next();
        System.out.printf("'%s' is not a valid number.\n", input);
      }
      pricePerGlass = scan.nextInt();
    } while(pricePerGlass < 0);
	

    double glassTotal = costPerGlass * glassesMade;// The total amount it costs to make number of chosen glasses
	
	double N1 = (100) * 30 / (pricePerGlass * pricePerGlass);
	double w = (0 - signsMade) * .5;
	//adbenefit is the % increase in sales due to ads
	double adBenefit = 1 - java.lang.Math.exp(w) * 1;
	    
	double N3 = weatherFactor * N1 * (1 + adBenefit);
	
	int N2 = (int)N3;
	int gm = (int)glassesMade;
	GlassesSold = java.lang.Math.min(N2, gm);
	specialEventGroup();
	GlassesSold = Math.min(GlassesSold, gm);
	double income = GlassesSold * pricePerGlass / 100;
	double expensees = ((glassTotal) + (signsMade * signsCost));
	String expenses = String.format("%.2f", expensees);
	
	
	
	
	profit = income - expensees;
	asset += profit;
	
	
	
	String profits = String.format("%.2f", profit);
	String assetss = String.format("%.2f", asset);
	
	    
	
	String  i = inputTxt("");
	
	
	
	
	
	//showResults();
	System.out.println("                   $$ Lemonsville Daily Financial Report $$             ");
	System.out.println("					Day: " +day+ "					  ");
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
	System.out.println("$ " + form(pricePerGlass2) + " price per glass");
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


   
    
    private void playNote(int note,int length) throws InterruptedException, MidiUnavailableException {
    		mChannels[0].noteOn(note,100);
    		Thread.sleep(length);
    		mChannels[0].noteOff(note);
    		
    }
    	     
    private String form(double num){
    	return df.format(num);
    }
     
    
    public Game()
    {
        sn = new Scanner(System.in); //initialize critical objects
        df = new DecimalFormat("0.00");
        
        /*all this stuff here is to add music..
         * @author Christian
         */
        try {
        	Synthesizer midiSynth = MidiSystem.getSynthesizer();
        	midiSynth.open();
        	
        	Instrument[] instr = midiSynth.getDefaultSoundbank().getInstruments();
        	mChannels = midiSynth.getChannels();
        	
        	midiSynth.loadInstrument(instr[0]);
        	

        	 
            sevenNation();



              
        	
        	} catch(MidiUnavailableException e) {} catch(InterruptedException d) {}
        	
      
        
        intro(); //present introduction information
        
        while(day <= 10)
        {
        weatherScreen();
        WeatherGroup();
        calc();
        if(yesNo("Would you like to end the game?")) {
        			break;
        		}
        day++;
        clear();
        }
        String assetss = String.format("%.2f", asset);
        print("Your Final Score is: " + assetss + " dollars! Congrats.");
        String i = inputTxt("");
    
        
    }
    
     private void sevenNation() throws InterruptedException, MidiUnavailableException{
    	 playNote(52,QUART+EIGTH);
         playNote(52,EIGTH);
         playNote(55,EIGTH+SIXT);
         playNote(52,EIGTH+SIXT);
         playNote(50,EIGTH);
         playNote(48,HALF);
         playNote(47,HALF);
     }

    
    public static void main(String[] args){
        
        new Game();
    }
//test
}
