import java.util.Scanner ;


class HospitalTester{

     public static void main(String a[]){
	 
	     Scanner sc = new Scanner(System.in);
		    System.out.println("The number of patient");
			int size = sc.nextInt();
	   
		 Hospital hos = new Hospital(size);
		 
		 for(int i=0; i<size;i++) {
		 PatientDTO dto = new PatientDTO();
		 
		      System.out.println("Enter the patient name ");
	          String name = sc.next();
			  System.out.println("Enter the patient address ");
			  String address = sc.next();
			  System.out.println("Enter the patient id ");
			  int id = sc.nextInt();
			  System.out.println("Enter the patient contact no ");
			  long contactNo = sc.nextLong();
			  System.out.println("Enter the gender");
			  String ge = sc.next();
			  
		 
		 dto.setGender(Gender.valueOf(ge)); 
		 dto.setId(id);
		 dto.setName(name);
		 dto.setAddress(address);
		 dto.setContactNo(contactNo);

	
		/* PatientDTO dto1 = new PatientDTO();
		 dto1.setGender(Gender.female); 
		 dto1.setId(2);
		 dto1.setName("Devi");
		 dto1.setAddress("Rajajinagar");
		 dto1.setContactNo(8974563268l);
		 
		 PatientDTO dto2 = new PatientDTO();
		 dto2.setGender(Gender.male); 
		 dto2.setId(3);
		 dto2.setName("Raja");
		 dto2.setAddress("Yeshavanthpura");
		 dto2.setContactNo(985473215l);
		 
		 PatientDTO dto3 = new PatientDTO();
		 dto3.setGender(Gender.female); 
		 dto3.setId(4);
		 dto3.setName("Rani");
		 dto3.setAddress("Yeshavanthpura");
		 dto3.setContactNo(9264875688l);
		 
		 
		 PatientDTO dto4 = new PatientDTO();
		 dto4.setGender(Gender.male); 
		 dto4.setId(5);
		 dto4.setName("Gaja");
		 dto4.setAddress("Attiguppe");
		 dto4.setContactNo(6984514578l);*/
		 
		 
		 hos.createPatient(dto);}
		/* hos.createPatient(dto1);
		 hos.createPatient(dto2);
		 hos.createPatient(dto3);
		 hos.createPatient(dto4);*/
		/* hos.getPatientDetails();
		 System.out.println("Enter the existing id to update the address");
		 int existingId = sc.nextInt();
		 System.out.println("Enter address to be update");
		 String updateAddress = sc.next();
		 hos.updatePatientAddressById(existingId, updateAddress);
		 hos.getPatientDetails();
		 
		 
		 System.out.println("Enter the existing Name to update the ContatNo");
		 String existingName = sc.next();
		 System.out.println("Enter contactNo to be update");
		 long updateContactNo = sc.nextLong();
		 hos.updatePatientContactNoByName(existingName, updateContactNo);*/
		 
		 
		 hos.getPatientDetails();
		 System.out.println("Enter the name to be deleted");
		 String name1 = sc.next();
		 hos.deletePatientDetailsByName(name1);
		 hos.getPatientDetails();
		 System.out.println("enter the contact no to be deleted");
		 long contactNo1 = sc.nextLong();
		 hos.deletePatientByContactNo(contactNo1);
		 hos.getPatientDetails();
		 
	 
	 
	 }


}