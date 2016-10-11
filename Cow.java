class Cow implements Animal 
{     
    String mySound; 
    String myType;

    public Cow() 
    {
    	mySound = "moo";
    	myType = "cow";
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
