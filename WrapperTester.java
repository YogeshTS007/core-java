
public class WrapperTester {
	
	public static void main(String[] args) {
		
		Integer baba = 78 ;
		//auto-boxing
		Integer baba1 =78;
		System.out.println(baba == baba1);
		Long baba2 =78l;
		System.out.println(baba==baba2.intValue());
		//un-boxing
		baba=baba1.intValue();
		System.out.println(baba1==baba);
		
		
		Short baba3 = 78;
		System.out.println(baba ==baba3.shortValue());
		
		Byte baba4 = 78;
		System.out.println(baba==baba4.byteValue());
		
		Float baba5 = (float) 78;
		System.out.println(baba==baba5.floatValue());
		
		Double baba6 = (double) 78;
		System.out.println(baba==baba6.doubleValue());
		
		
	}

}

