package com.xworkz.hospital.crud;

import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.dto.PatientDTO;

public interface Hospital {
	  boolean createPatient1(PatientDTO dto);
		 void getPatientDetails();
		 boolean updatePatientAddressById1(int id, String address);
		 boolean updatePatientContactNoByName(String name, long contactNo);
		 boolean deletePatientDetailsByName(String name);
		 boolean deletePatientByContactNo(long contactNo);
		 String getPatientNameById(int id);
		 long getPatientContactNoByName(String name);
		 boolean deletePatientDetailsByGender(Gender gender);
		boolean createPatient(PatientDTO dto);
		void updatePatientAddressById(int existingId, String updateAddress);
		boolean updatePatientAddressById11(int id, String address);
		 
}
