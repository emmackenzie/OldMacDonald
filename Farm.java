class Farm 
{     
   private Animal[] aBunchOfAnimals = new Animal[4];
   	public Farm()
   	{
   		aBunchOfAnimals[0] = new Cow("cow", "moo");
   		aBunchOfAnimals[1] = new Pig("pig", "oink");
   		aBunchOfAnimals[2] = new Chick("chick", "cluck", "cheep");
         aBunchOfAnimals[3] = new NamedCow("cow", "Elsie", "moo");
         
   	}

   	public void AnimalSounds()
   	{
   		for(int i  = 0; i < aBunchOfAnimals.length - 1; i++)
   			System.out.println( aBunchOfAnimals[i].getType() + " goes " + aBunchOfAnimals[i].getSound());

         System.out.println( "The cow is known as " + ((NamedCow)aBunchOfAnimals[3]).getName() );
   	}

}  
