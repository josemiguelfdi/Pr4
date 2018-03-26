package es.ucm.fdi.model;

import java.util.List;

import es.ucm.fdi.ini.IniSection;

public class Vehicle extends SimulatedObject{

	public Vehicle(String cadVehicle, int n, List<Junction> listJunctions) {
		super(cadVehicle);
	}
	
	public Road getRoad(){
		return null;
	}
	
	public int getMaxSpeed(){
		return 1;
	}
	
	public int getSpeed(){
		return 1;
	}
	
	public int getLocation(){
		return 1;
	}
	
	public int getKilometrage(){
		return 1;
	}
		
	public int getFaultyTime(){
		return 1;
	}
	
	public boolean atDestination(){
		return true;
	}
	
	public List<Junction> getItinerary(){
		return null;
	}
	
	void makeFaulty(int n){

	}
	
	void stepSpeed(){
		
	}

	@Override
	void advance(int numberOfStep) {
		
	}
	
	void moveToNextRoad() {
		
	}
	
	@Override
	protected String getReportSectionTag() {
		return null;
	}

	@Override
	protected void fillReportDetails(IniSection initiateSection) {
	
	}
}
