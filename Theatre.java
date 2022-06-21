class Theatre{

   String name;
   String address;
   String ownerName;
   long contactNumber;
   String[] runningMovies = new String [3];
   String[] runningMoviesinUrvashi = new String[3];
   public static void main (String a [])
   
   {
   Theatre   theatre = new Theatre();
   theatre.name="Veeresh";
   theatre.address = "Banglore";
   theatre.ownerName = "RudraPrathap";
   theatre.contactNumber = 7897897890l;
   theatre.runningMovies[0] = "charlie 777";
   theatre.runningMovies[1] = "major";
   theatre.runningMovies[2] = "jurassic world";
   
   
   System.out.println("The Name of the Theatre is "+theatre.name);
   System.out.println("The Address of the Theatre is "+theatre.address);
   System.out.println("The Owner Name of the Theatre is "+theatre.ownerName);
   System.out.println("The Contact Number of the Theatre is "+ theatre.contactNumber);
   System.out.println("The Running Movies are ");
   theatre.getRunningMovies();
   
   Theatre   theatre1 = new Theatre();
   theatre1.name= "Urvashi";
   theatre1.address = "Sudhama Nagara";
   theatre1.ownerName = "Ganesh Kumar";
   theatre1.contactNumber = 9879879870l;
   theatre.runningMoviesinUrvashi[0]="vikram";
   theatre.runningMoviesinUrvashi[1] = "kgf2";
   theatre.runningMoviesinUrvashi[2] = "major";
   
   System.out.println("The name of the Theatre is "+theatre1.name);
   System.out.println("The Address of the Theatre is "+theatre1.address);
   System.out.println("The Owner Name of the Theatre is "+theatre1.ownerName);
   System.out.println("The Contact Number of the Theatre is "+theatre1.contactNumber);
   System.out.println("The Running Movies are ");
   theatre1.getRunningMoviesinUrvashi();
   }
  public void getRunningMovies(){
	  for(int z=0; z<runningMovies.length; z++){
		  System.out.println(runningMovies[z]);
	  }
  }
   public void getRunningMoviesinUrvashi(){
	   for(int z=0; z<runningMoviesinUrvashi.length; z++){
		   
		   System.out.println(runningMoviesinUrvashi[z]);
	   }
	   
	   
   }

}