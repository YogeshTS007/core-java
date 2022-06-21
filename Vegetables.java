class Vegetables{
	static String Vegetables[] = {"tomato","potato","onion","ladies finger"};
	public static void main (String a[]){
	String value = getVegetable ("tomato");
	System.out.println("tarkari thagond ba etc " + value);
}

	public static String getVegetable(String Vegetable){
	String VegetableName = null;
	for(int i =0;i<Vegetables.length;i++){
	if(Vegetables[i]==Vegetable){
	VegetableName = Vegetables[i];

	
	}
	}
	return VegetableName;
	}
	
}