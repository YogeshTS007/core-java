class Mobile{

   String name; 
   String address; 
   String ownerName;
   long contactNumber;
   String[] runningMobiles = {"samsung", "redmi"};
   String[] runningMobilesinSangeetha = {"iqoo", "realme"};
   public static void main (String a [])
   
   {
   Mobile   mobile = new Mobile();
   mobile.name="sangeetha";
   mobile.address = "basvangudi";
   mobile.ownerName = "kvani";
   mobile.contactNumber = 7897897890l;
   
   
   System.out.println("The Name of the mobile showroom is "+mobile.name);
   System.out.println("The Address of the mobile showroom is "+mobile.address);
   System.out.println("The Owner Name of the mobile showroom is "+mobile.ownerName);
   System.out.println("The Contact Number of the mobile showroom is "+ mobile.contactNumber);
   System.out.println("The Running Mobiles are ");
   mobile.getRunningMobiles();
   
   Mobile   mobile1 = new Mobile();
   mobile1.name= "pai showroom";
   mobile1.address = "Sudhama Nagara";
   mobile1.ownerName = "Magane Kumar";
   mobile1.contactNumber = 9879879870l;
   
   System.out.println("The name of the mobile showroom is "+mobile1.name);
   System.out.println("The Address of the mobile showroom is "+mobile1.address);
   System.out.println("The Owner Name of the mobile showroom is "+mobile1.ownerName);
   System.out.println("The Contact Number of the mobile showroom is "+mobile1.contactNumber);
   System.out.println("The Running Mobiles are ");
   mobile1.getRunningMobilesinpaishowroom();
   }
  public void getRunningMobiles(){
	  for(int z=0; z<runningMobiles.length; z++){
		  System.out.println(runningMobiles[z]);
	  }
  }
   public void getRunningMobilesinpaishowroom(){
	   for(int z=0; z<getRunningMobilesinpaishowroom.length; z++){
		   
		   System.out.println(getRunningMobilesinpaishowroom[z]);
	   }
	   
	   
   }

}