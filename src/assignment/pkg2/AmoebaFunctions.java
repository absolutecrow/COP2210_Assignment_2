//********************************************************************************
// PantherID:  4138075
// CLASS: COP 2210 – Spring 2018
// ASSIGNMENT # 2
// DATE: 02/05/2018
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************
package assignment.pkg2;

import java.util.Random;

public class AmoebaFunctions {
    
    //Declaring constants and variables.
    private String colonyName;
    private String caretakerName;
    private double colonySize;
    private int daysToFeed;
    private boolean vitamins;
    private int timesToBreed;
    private int successfulBred;
    private double deaths;
    private int startingColonySize;
    private int sicknessCounter;
    private static final int GROWTH_MULTIPLIER = 2;
    private static final int VITAMINS_PERCENTAGE = 20;
    private static final int NO_VITAMINS_PERCENTAGE = 25;
    private static final double POPULATION_REDUCTION = 0.1;
    private final Random RNG = new Random();
            
    //Constructor to initalize variables.
    public AmoebaFunctions()
    {
        this.vitamins = false;
        this.colonySize = 0;
        this.caretakerName = "None";
        this.colonyName = "None";
        this.daysToFeed = 0;
        this.timesToBreed = 0;
        this.startingColonySize = 0;
        this.successfulBred = 0;
        this.deaths = 0;
        this.sicknessCounter = 0;
    }
    
    //Adding the days to feed.
    public void feed(int daysToFeed)
    {
        this.daysToFeed += daysToFeed;
    }
    
    //Returning successfulBred as daysFed and successfulBred are equivalent.
    public int getDaysFed()
    {
        return successfulBred;
    }
    
    /*
    Breed function. Copies over the amount of times to breed. If it is greater
    than 0 then check for food, if it is greater than 0 then double the size of 
    the colony, reduce the food by 1, and increase breeding count by 1. Check
    for any potential death after breeding. Affected death will use the
    after breeding numbers of the colony.
    */
    public void breed(int timesToBreed)
    {
        this.timesToBreed = timesToBreed;
        
        while(timesToBreed > 0)
        {
            if(daysToFeed > 0)
            {
                colonySize *= GROWTH_MULTIPLIER;
                daysToFeed--;
                successfulBred++;
                sicknessChecker();
            }
            else
            {
                timesToBreed = 0;
            }
            timesToBreed--;
        }
        
    }
    
    //Rounding the colony size to return to the user interface.
    public double getFinalColonySize()
    {
        return Math.round(colonySize);
    }
    
    //Return the requested breed amount
    public int getRequestedBreed()
    {
        return timesToBreed;
    }
    
    //Return the amount of successful breed.
    public int getSuccessfulBred()
    {
        return successfulBred;
    }
    
    //Sets the name of the colony
    public void setColonyName(String colonyName)
    {
        this.colonyName = colonyName;
    }
    
    //Returns name of colony
    public String getColonyName()
    {
        return this.colonyName;
    }
    
    //Set Caretaker name
    public void setCaretakerName(String caretakerName)
    {
        this.caretakerName = caretakerName;
    }
    
    //Returns caretaker name
    public String getCaretakerName()
    {
        return caretakerName;
    }
    
    //Set the starting size to the colony and store the inital size elsewhere.
    public void setStartingSize(int startingSize)
    {
        colonySize = (double) startingSize;
        startingColonySize = startingSize;
    }
    
    //Return the initial size
    public int getStartingSize()
    {
        return startingColonySize;
    }
    
    //To give the colony vitamins or not.
    public void setVitamins(boolean vitamins)
    {
        this.vitamins = vitamins;
    }
    
    //Start of the sickness function
    public void sicknessChecker()
    {
        //Return a number from 1 to 100 to be treated as a percentage
        int percentage = 1 + RNG.nextInt(100);
               
        //Checking if the user decided to give vitamins
        if(vitamins == true)
        {
            //Compare the rolled percentage to the VITAMIN_PERCENTAGE (20)
            //Count the deaths and reduce colony size if perfentage is <= 20
            if(percentage <= VITAMINS_PERCENTAGE)
            {
                deaths += (colonySize * POPULATION_REDUCTION);
                colonySize -= (colonySize * POPULATION_REDUCTION);
                sicknessCounter++;
            }

        }
        //If the user did NOT give vitamins.
        else
        {
            //Compare to the rolled percentage to the NO_VITAMINS_PERCENTAGE (25)
            if(percentage <= NO_VITAMINS_PERCENTAGE)
            {
                deaths += (colonySize * POPULATION_REDUCTION);
                colonySize -= (colonySize * POPULATION_REDUCTION);
                sicknessCounter++;
            }

        }
    }
    
    //Round the number of death and return it.
    public double getNumberOfDeaths()
    {
        return Math.round(deaths);
    }
    
    public int getSicknessCounter()
    {
        return sicknessCounter;
    }
    
}
