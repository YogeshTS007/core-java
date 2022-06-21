class GroceryStores{

	String nameOfStore ;
	String address ;
	String ownerName ;
	long contactNo ;
	String [] groceryList = {"rava","godhi","rice"};


	public satatic void main (String a[]){


		GroceryStores groceryStores = new GroceryStores ();
		groceryStores.nameOfStore = "guru ragvendra stores";
		groceryStores.address = "rajajinagar";
		groceryStores.ownerName = "gurudatha";
		groceryStores.contactNo = 8976541235L;


		System.out.println("name of the grocery store is "+ groceryStores.nameOfStore );
		System.out.println("address of the grocery store is "+ groceryStores.address);
		System.out.println("owner of the grocery store is "+ groceryStores.ownerName);
		System.out.println("contact Number of the grocery store owner is "+ groceryStores.contactNo);

		groceryStores.getgroceryList();


		}

		public void getgroceryList(){

			for (int z = 0;z<groceryList.length;z++){
				System.out.println(groceryList[z]);
			}
		}

}