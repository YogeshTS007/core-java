class HospitalTester{


	public static void main(String a[]){
	
	Hospital hos = new Hospital();
	PatientDTO dto = new PatientDTO();
	
	dto.setGender(Gender.male);
	dto.setId(1);
	dto.setName("Spoorthy raj ");
	dto.setAddress("hoskote");
	dto.setContactNumber(9782986576l);
	dto.setWardNumber("three");
	
	
	
	PatientDTO dto1 = new PatientDTO();
	
	dto1.setGender(Gender.female);
	dto1.setId(2);
	dto1.setName("sadeeq");
	dto1.setAddress("baglore");
	dto1.setContactNumber(9867658423l);
	dto1.setWardNumber("four");
	
	
	
	
	PatientDTO dto2 = new PatientDTO();
	
	dto2.setGender(Gender.male);
	dto2.setId(3);
	dto2.setName("farhan");
	dto2.setAddress("tumkur");
	dto2.setContactNumber(9864740221l);
	dto2.setWardNumber("five");
	
	
	
	
	PatientDTO dto3 = new PatientDTO();
	
	dto3.setGender(Gender.female);
	dto3.setId(4);
	dto3.setName("ganga");
	dto3.setAddress("Nelmangla");
	dto3.setContactNumber(8679877578l);
	dto3.setWardNumber("six");
	
	
	
	PatientDTO dto4 = new PatientDTO();
	
	dto4.setGender(Gender.transgender);
	dto4.setId(5);
	dto4.setName("shanthi ");
	dto4.setAddress("New delhi");
	dto4.setContactNumber(7578765454l);
	dto4.setWardNumber("seven");
	
	
	
	
	hos.createPatient(dto);
	hos.createPatient(dto1);
	hos.createPatient(dto2);
	hos.createPatient(dto3);
	hos.createPatient(dto4);
	hos.getPatientDetails();
	
	
	
	
	
	
	}











}