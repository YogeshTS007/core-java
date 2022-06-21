class ShoppingMall1{
  
     String name;
	 String address;
	 long contactNo;
	 String owner;
	 String multiplex;
	 String shopsMantriSquare[] = {"lifestyle", "pantaloons", "Shooppers Stop", "H&M"};
	 String shopsOrion[] = {"Mac V", "Auralia", "MAX", "American Eagle", "Tommy Hilfiger"};
	 String shopsPhoenix[] = {"ZARA", "Sephora", "Allen solly", "American Eagle", "Amoeba"};
	 String shopsVR[] = {"adidas", "Fun city", "H & M", "iplanet", "Levi's", "Puma", "Wildcraft"};
	 
	 public static void main(String a[])
	 {
		 ShoppingMall1 shoppingMall = new ShoppingMall1();
		 shoppingMall.name = "Mantri Square";
		 shoppingMall.address = "Malleswaram";
		 shoppingMall.owner = "Mantri Developers";
		 shoppingMall.contactNo = 8803016000L;
		 shoppingMall.multiplex = "Inox";
		 System.out.println("The Name of the Shopping Mall is "+ shoppingMall.name);
		 System.out.println("The address of the shooping mall is "+ shoppingMall.address);
		 System.out.println("The contact number of the shiopping mall is "+ shoppingMall.contactNo);
		 System.out.println("The owner of the shopping mall is "+ shoppingMall.owner);
		 System.out.println("The theater present in shopping mall "+ shoppingMall.multiplex );
		 System.out.println("The shops in the shopping mall ===========");
		 shoppingMall.getShoppingMallMantri();
		 
		 ShoppingMall1 shoppingMall1 = new ShoppingMall1();
		 shoppingMall1.name = "Orion";
		 shoppingMall1.address = "Dr. Rajakumar Road, Rajajinagar";
		 shoppingMall1.owner = "Brigade Developers";
		 shoppingMall1.contactNo = 9862561245L;
		 shoppingMall1.multiplex = "PVR";
		 System.out.println("The Name of the Shopping Mall is "+ shoppingMall1.name);
		 System.out.println("The address of the shooping mall is "+ shoppingMall1.address);
		 System.out.println("The contact number of the shiopping mall is "+ shoppingMall1.contactNo);
		 System.out.println("The owner of the shopping mall is "+ shoppingMall1.owner);
		 System.out.println("The theater present in shopping mall "+ shoppingMall1.multiplex);
		 System.out.println("The shops in the shopping mall ===========");
		 shoppingMall1.getShoppingMallOrion();
		 
		 ShoppingMall1 shoppingMall2 = new ShoppingMall1();
		 shoppingMall2.name = "Phoenix Market City";
		 shoppingMall2.address = "Whitefield main road, Singayyanapalya";
		 shoppingMall2.owner = "Phoenix Mills Co. Ltd";
		 shoppingMall2.contactNo = 89756896582L;
		 shoppingMall2.multiplex = "PVR";
		 System.out.println("The Name of the Shopping Mall is "+ shoppingMall2.name);
		 System.out.println("The address of the shooping mall is "+ shoppingMall2.address);
		 System.out.println("The contact number of the shiopping mall is "+ shoppingMall2.contactNo);
		 System.out.println("The owner of the shopping mall is "+ shoppingMall2.owner);
		 System.out.println("The theater present in shopping mall "+ shoppingMall2.multiplex);
		 System.out.println("The shops in the shopping mall ===========");
		 shoppingMall2.getShoppingMallPhoenix();
		 
		 ShoppingMall1 shoppingMall3 = new ShoppingMall1();
		 shoppingMall3.name = "VR Bengaluru";
		 shoppingMall3.address = "Whitefield main road, Singayyanapalya";
		 shoppingMall3.owner = "Sid Yoga";
		 shoppingMall3.contactNo = 9807658957L;
		 shoppingMall3.multiplex = "PVR";
		 System.out.println("The Name of the Shopping Mall is "+ shoppingMall3.name);
		 System.out.println("The address of the shooping mall is "+ shoppingMall3.address);
		 System.out.println("The contact number of the shiopping mall is "+ shoppingMall3.contactNo);
		 System.out.println("The owner of the shopping mall is "+ shoppingMall3.owner);
		 System.out.println("The theater present in shopping mall "+ shoppingMall3.multiplex);
		 System.out.println("The shops in the shopping mall ===========");
		 shoppingMall2.getShoppingMallVr();
		 
	 }
	 
     public void getShoppingMallMantri()
	 {
		 for(int i=0; i<shopsMantriSquare.length;i++)
		 {
			 System.out.println(shopsMantriSquare[i]);
		 }
	 }
	 
	 public void getShoppingMallOrion()
	 {
		 for(int i=0; i<shopsOrion.length;i++)
		 {
			 System.out.println(shopsOrion[i]);
		 }
	 }
		 
		 public void getShoppingMallPhoenix()
		 {
			 for(int i=0; i<shopsPhoenix.length;i++)
			 {
				 System.out.println(shopsPhoenix[i]);
			 }
		 }
		 
		 public void getShoppingMallVr()
		 {
			 for(int i=0; i<shopsVR.length;i++)
			 {
				 System.out.println(shopsVR[i]);
			 }
		 }
		 
	 
	 






}