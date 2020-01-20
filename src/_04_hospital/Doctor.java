package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor{
	ArrayList<Patient> patients;
	public Doctor() {
		patients = new ArrayList<Patient>();
	}
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient x) throws Exception {
		// TODO Auto-generated method stub
		if(patients.size() < 3) {
			patients.add(x);
		}
		else {
			throw new Exception();
		}
		
	}
	public void doMedicine() {
		// TODO Auto-generated method stub
		for(Patient i : patients) {
			i.caredFor = true;
		}
	}
	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

}
