package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	
	ArrayList<Doctor> doctor;
	ArrayList<Patient> patient;
	
	public Hospital() {
		doctor = new ArrayList<Doctor>();
		patient = new ArrayList<Patient>();
	}
	
	public void addDoctor(Doctor x) {
		// TODO Auto-generated method stub
		doctor.add(x);
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctor;
	}

	public void addPatient(Patient x) {
		// TODO Auto-generated method stub
		patient.add(x);
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patient;
	}

	public void assignPatientsToDoctors() throws Exception{
		// TODO Auto-generated method stub
		int patientNum = 0;
		for(int i = 0; i < doctor.size(); i++)
		{
			while(doctor.get(i).getPatients().size() < 3 && patientNum < patient.size())
			{
				doctor.get(i).assignPatient(patient.get(patientNum));
				patientNum++;
			}
		}
	}

	

}
