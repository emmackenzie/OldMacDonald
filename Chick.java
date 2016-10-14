class Chick implements Animal 
{     
    private String mySound; 
    private String myType;

    public Chick(String type, String sound1, String sound2)
    {
        myType = type;

        if (Math.random() < .5)
            mySound = sound1;
        else
            mySound = sound2;
    }

    public Chick() 
    {
    	myType = "";
        mySound = "";
    } 

    public String getSound()
    {
    	return(mySound);
    }

    public String getType()
    {
    	return(myType);
    }
}
