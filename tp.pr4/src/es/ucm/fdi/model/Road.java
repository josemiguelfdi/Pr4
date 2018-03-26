package es.ucm.fdi.model;

import java.util.List;

import es.ucm.fdi.ini.IniSection;

public class Road extends SimulatedObject{

	public Road(String cad, int n, int m, Junction junctionSrc, Junction junctionDst) {
		super(cad);
	}
	
	public Junction getSource(){
		return null;
	}
	
	public Junction getDestination(){
		return null;
	}
	
	public int getLength(){
		return 1;
	}
	
	public int getMaxSpeed(){
		return 1;
	}
	
	public List<Vehicle> getVehicle(){
		return null;
	}
	
	@Override
	void advance(int numberOfStep) {
		
	}	
	
	void enter(Vehicle vehicle){
		
	}
	
	public void exit(Vehicle vehicle){
	}
	
	@Override
	protected String getReportSectionTag() {
		return null;
	}
	
	@Override
	protected void fillReportDetails(IniSection initiateSection) {
		
	}	
	
	protected int calculateBaseSpeed(){
		return 1;
	}
	
	protected int reduceSpeedFactor(int n){
		return 1;
	}
}
