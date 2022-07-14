import java.util.Scanner ;

class HospitalTester {

	public static void main(String a []){
		
		Scanner	sc	=	new	Scanner(System.in);
		System.out.println("Enter the number of Patient to be Added");
		int size = sc.nextInt();
			Hospital hos = new Hospital (size);
			
		for(int i=0 ; i < size ; i++){
		
		System.out.println("Enter the Patient Name");
		String name = sc.next ();
		
		System.out.println("Enter the Patient Address");
		String address = sc.next ();
		
		System.out.println("Enter the Patient Id");
		int id = sc.nextInt();
		
		System.out.println("Enter the Patient Contact Number");
		long contactNo = sc.nextLong();


	
	PatientDTO dto = new PatientDTO();
	

	dto.setId(id);
	dto.setName(name);
	dto.setAddress(address);
	dto.setContactNo(contactNo);
	
	hos.createPatient(dto);
	}
		hos.getPatientDetails();
	//dto.setGender(Gender.Male);
		System.out.println("enter the existing id for which adress has to be upadated");
		int existingId = sc.nextInt();
		System.out.println("enter the address to be updated ...... ");
		String updatedAddress = sc.nextLine();

		hos.updatePatientAdressById(6,"rajasthan");
		hos.getPatientDetails();
	
	/*dto.setId(1);
	dto.setName("Shashank");
	dto.setAddress("Vijayanagar");
	//dto.setGender(Gender.Male);
	dto.setContactNo(9980841222l);

	PatientDTO dto1 = new PatientDTO();

	dto1.setId(2);
	dto1.setName("Yogesh ");
	dto1.setAddress("Basavanagudi");
	dto1.setGender(Gender.Male);
	dto1.setContactNo(8073498569l);
	
		PatientDTO dto2 = new PatientDTO();

	dto2.setId(3);
	dto2.setName("Gombe");
	dto2.setAddress("K S Layout");
	dto2.setGender(Gender.Female);
	dto2.setContactNo(8973676438l);
	
		PatientDTO dto3 = new PatientDTO();

	dto3.setId(4);
	dto3.setName("Likki");
	dto3.setAddress("Govindarajanagara");
	dto3.setGender(Gender.Male);
	dto3.setContactNo(9879877865l);
	
		PatientDTO dto4 = new PatientDTO();

	dto4.setId(5);
	dto4.setName("Shailu");
	dto4.setAddress("Varadarajanagara");
	dto4.setGender(Gender.Female);
	dto4.setContactNo(9987841222l);
	
	
	hos.createPatient(dto1);
	hos.createPatient(dto2);
	hos.createPatient(dto3);
	hos.createPatient(dto4);*/
		
	}

}