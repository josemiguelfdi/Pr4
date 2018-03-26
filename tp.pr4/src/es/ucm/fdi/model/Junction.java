package es.ucm.fdi.model;

import java.util.List;

import es.ucm.fdi.ini.IniSection;

public class Junction extends SimulatedObject{

	public Junction(String junction) {
		super(junction);
	}

	public Road roadTo(Junction junction){
		return null;
	}
	
	public Road roadFrom(Junction junction){
		return null;
	}
	
	public List<IncomingRoad> getRoadsInfo(Junction junction){
		return null;
	}
	
	void addIncomingRoad(Road road){
	
	}
	
	void addOutGoingRoad(Road road){
		
	}
	
	void enter(Vehicle vehicle){
		
	}

	@Override
	void advance(int numberOfStep) {
		
	}
	
	protected void switchLights() {
			
	}
	
	protected IncomingRoad createIncommingRoadQueue(Road road) {
		return null;
	}
	
	@Override
	protected String getReportSectionTag() {
		return null;
	}
	
	@Override
	protected void fillReportDetails(IniSection initiateSection) {
		
	}	
}
