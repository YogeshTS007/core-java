import java.util.Arrays;
class Customer{


    OrderDTO[] orders ;
	int index;
	
	public Customer(int size){
	  orders = new OrderDTO[size];
      System.out.println("The Customer constructor is created");	  
	
	}
	
	public boolean createOrder(OrderDTO order){
	
	    System.out.println("Inside the createOrder");
		boolean isAdded = false;
		
		if(order != null && order.getName() != null) {
		    
			this.orders[index++] = order;
			isAdded = true;
			System.out.println("The Order detail is saved");
		} else {
		   System.out.println("The order is not saved");
		
		}
	       System.out.println("the createOrder() is ended");
	   return isAdded;
	}
	
	public void getOrderDetails(){
	
	     
		 for(int i=0; i<orders.length; i++){
		    
			  System.out.println(orders[i].getId()+"  "+orders[i].getName()+"  "+orders[i].getPrice()+"  "+orders[i].getType());
		 
		 }
	     
	}
	
	/*public boolean updateTypeById(int id, String type){
		 
		 System.out.println("Inside updateTypeById ");
		 boolean updateType = false;
		 for(int i=0; i<orders.length;i++){
			 if(orders[i].getId() == id ){
				 orders[i].setType(type);
				 updateType = true;
				 
			 }
			 else{
				 System.out.println("The order id is not found");
			 }
		 }
		 return updateType;
	 }*/
	 
	 public boolean updatePriceByName(String name, int price){
		 
		 System.out.println("Inside updatePriceByName ");
		 boolean updatePrice = false;
		 for(int i=0; i<orders.length;i++){
			 if(orders[i].getName().equals(name)){
				 orders[i].setPrice(price);
				 updatePrice = true;
				 
			 }
			 else{
				 System.out.println("The order name is not found");
			 }
		 }
		 return updatePrice;
	 }
	 
	 public boolean deleteByName(String name){
		 System.out.println("inside deleteByName");
		 boolean deleteOrder=false;
		 int i,j;
		 for(i=0,j=0;j<orders.length;j++){
			 if(!orders[j].getName().equals(name)){
				 orders[i++]=orders[j];
				 deleteOrder = true;
			 } else {
				 System.out.println("the order is deleted");
			 }
		 }
		 orders = Arrays.copyOf(orders, i);
		 return deleteOrder;
	 }
	 
	 
	  public boolean deleteById(int id){
		 System.out.println("inside deleteById");
		 boolean deleteOrder=false;
		 int i,j;
		 for(i=0,j=0;j<orders.length;j++){
			 if(orders[j].getId()!=id){
				 orders[i++]=orders[j];
				 deleteOrder = true;
			 } else {
				 System.out.println("the order is deleted");
			 }
		 }
		 orders = Arrays.copyOf(orders, i);
		 return deleteOrder;
	 }
	 





}