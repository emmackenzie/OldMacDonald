class Farm 
{     
   private Animal[] aBunchOfAnimals = new Animal[3];
   	public Farm()
   	{
   		aBunchOfAnimals[0] = new Cow("cow", "moo");
   		aBunchOfAnimals[1] = new Pig("pig", "oink");
   		aBunchOfAnimals[2] = new Chick("chick", sound);
   	}

   	public void AnimalSounds()
   	{
   		for(int i  = 0; i < aBunchOfAnimals.length; i++)
   			System.out.println( aBunchOfAnimals[i].getType() + " goes " + aBunchOfAnimals[i].getSound());
   	}
}  
