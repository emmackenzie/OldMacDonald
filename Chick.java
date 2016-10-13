class Chick implements Animal 
{     
    private int mySound; 
    private String myType;

    public Chick(String type, int sound)
    {
        myType = type;
        //myChoice = choice;
        mySound = sound;
    }

    public Chick() 
    {
    	myType = "";
        mySound = (int)(Math.random()*2);

        if (mySound == 0)
            mySound = "cheep";
        else 
            mySound = "cluck";	
    } 

    public int getSound()
    {
    	return(mySound);
    }

    public String getType()
    {
    	return(myType);
    }
}
