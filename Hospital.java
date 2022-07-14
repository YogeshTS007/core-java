class Hospital{

		//Has many patients

	PatientDTO[] dtos ;
	//instance variable
	int index;

	public Hospital(int size){
		dtos = new PatientDTO[size];
			System.out.println ("Hospital Const is Created");
	}
	
	public boolean createPatient(PatientDTO dto){
			System.out.println("Inside create Patient Method");
		boolean isAdded = false ;
		if (dto !=null || dto.getName() !=null){
			this.dtos[index++]=dto ;
			isAdded = true ;
			System.out.println("Patient information Added Successfully");
		}
		else{
			System.out.println("Cannot Add Patient... Please fill the mandatory fields");
		}
	return isAdded;
	}
	public void getPatientDetails(){
		System.out.println("Inside get Patient Details");
		for(int i =0 ; i<dtos.length ; i++){
			System.out.println(dtos[i].getId()+"    "+dtos[i].getName()+"    "+dtos[i].getAddress()+/*"    "+dtos[i].getGender()/+*/"    "+dtos[i].getContactNo());
		}
		
	}
	public boolean updatePatientAdressById(int id,String address){
		System.out.println("Inside update Patient Adress By Id Method");
		boolean updatedAddress = false ;
		for(int i = 0 ; i<dtos.length;i++){
			if(dtos[i].getId()==id){
				dtos[i].setAddress(address);
				updatedAddress = true ;
			}
			else{
				System.out.println("patient details are not matching....failed to update ");
			}
		}
		return updatedAddress;
	}
}