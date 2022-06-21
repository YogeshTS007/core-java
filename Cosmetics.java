class Cosmetics{

   int id;
   String name;
   String brand;
   int price;
   String quantity;
   String application;
   
   public static void main(String a[])
   {
	   
	   Cosmetics cosmetics = new Cosmetics();
	   cosmetics.id = 568;
	   cosmetics.name = "Lipstick";
	   cosmetics.brand = "Sugar Cosmetics";
	   cosmetics.price = 458;
	   cosmetics.quantity = "49gms";
	   cosmetics.application = "Red";
	   System.out.println("The id of the cosmetics is "+ cosmetics.id);
	   System.out.println("the Name of the cosmetics is "+ cosmetics.name);
	   System.out.println("The brand Name of the cosmetics "+ cosmetics.brand);
	   System.out.println("The price of the lipstick is "+ cosmetics.price);
	   System.out.println("The quantity of the lipstick is "+ cosmetics.quantity);
	   System.out.println("The coloue of the lipstick is "+cosmetics.application);
	    System.out.println("------------------------------------------------------");
	   
	   Cosmetics cosmetics1 = new Cosmetics();
	   cosmetics1.id = 1257;
	   cosmetics1.name = "Foundation";
	   cosmetics1.brand = "Lakme";
	   cosmetics1.price = 228;
	   cosmetics1.quantity = "28gms";
	   cosmetics1.application = "face";
	   System.out.println("The id of the cosmetics is "+ cosmetics1.id);
	   System.out.println("the Name of the cosmetics is "+ cosmetics1.name);
	   System.out.println("The brand Name of the cosmetics "+ cosmetics1.brand);
	   System.out.println("The price of the foundation is "+ cosmetics1.price);
	   System.out.println("The quantity of the foundation is "+ cosmetics1.quantity);
	   System.out.println("The of the foundation is used in  "+cosmetics1.application);
	    System.out.println("------------------------------------------------------");
	   
	   Cosmetics cosmetics2 = new Cosmetics();
	   cosmetics2.id = 985;
	   cosmetics2.name = "Kajal";
	   cosmetics2.brand = "Lakme";
	   cosmetics2.price = 232;
	   cosmetics2.quantity = "16gms";
	   cosmetics2.application = "Eye liner";
	   System.out.println("The id of the cosmetics is "+ cosmetics2.id);
	   System.out.println("the Name of the cosmetics is "+ cosmetics2.name);
	   System.out.println("The brand Name of the cosmetics "+ cosmetics2.brand);
	   System.out.println("The price of the Kajal is "+ cosmetics2.price);
	   System.out.println("The quantity of the Kajal is "+ cosmetics2.quantity);
	   System.out.println("The of the kajal is used as  "+cosmetics2.application);
	    System.out.println("------------------------------------------------------");
	   
	   Cosmetics cosmetics3 = new Cosmetics();
	   cosmetics3.id = 5487;
	   cosmetics3.name = "FaceWash";
	   cosmetics3.brand = "Garnier";
	   cosmetics3.price = 320;
	   cosmetics3.quantity = "100gms";
	   cosmetics3.application = "face";
	   System.out.println("The id of the cosmetics is "+ cosmetics3.id);
	   System.out.println("the Name of the cosmetics is "+ cosmetics3.name);
	   System.out.println("The brand Name of the cosmetics "+ cosmetics3.brand);
	   System.out.println("The price of the facewash is "+ cosmetics3.price);
	   System.out.println("The quantity of the facewash is "+ cosmetics3.quantity);
	   System.out.println("The of the facewash is used  "+cosmetics3.application);
	   
	   
   }
   
   



}