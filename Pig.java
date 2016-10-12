class Pig implements Animal 
{     
    private String mySound; 
    private String myType;

    public Pig(String type, String sound)
    {
        myType = type;
        mySound = sound;
    }

    public Pig() 
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
