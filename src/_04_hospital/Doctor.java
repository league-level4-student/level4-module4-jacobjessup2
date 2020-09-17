package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	protected ArrayList<Patient> pat = new ArrayList<Patient>();
	
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException{
		// TODO Auto-generated method stub
		if(pat.size()>=3) {
			throw new DoctorFullException();
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
		for (int i = 0; i < pat.size(); i++) {
			pat.get(i).checkPulse();
		}
	}

}
