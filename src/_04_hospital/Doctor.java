package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public abstract class Doctor {
	protected ArrayList<Patient> pat = new ArrayList<Patient>();
	Doctor(ArrayList<Patient> pat){
		this.pat = pat;
	}
	public Boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public Boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return null;
	}

	public void assignPatient(Patient patient) {
		// TODO Auto-generated method stub
		if(pat.size()>3) {
			System.out.println("Full on patients");
		}
		else {
			pat.add(patient);
		}
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return pat;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		
	}

}
