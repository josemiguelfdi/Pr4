package es.ucm.fdi.model;

import java.util.List;

public abstract class Event {
	private int time;
	
	Event(Event e) {
		
	}

	Event(Integer integer){
		time = integer;
	}
	
	/**
	 * Obtener el tiempo del evento
	 * @return
	 */	
	public int getScheduledTime(){
		return 1;
	}
	
	public int compareTo(Event evento){
		return 1;
	}
	
	protected Junction checkIfJunctionExists(RoadMap roadMap, String cadJunction){
		return null;
	}
	
	protected Vehicle checkIfVehicleExists(RoadMap roadMap, String cadVehicle){
		return null;
	}
	
	protected Road checkIfRoadExists(RoadMap roadMap, String cadRoad){
		return null;
	}
	
	protected SimulatedObject checkIfSimObjExists(RoadMap roadMap, String cadSimulatedObject){
		return null;
	}
	
	protected List<Junction> parseListOfJunctions(RoadMap roadMap, String[] arrayJunctions){
		return null;
	}
	
	protected List<Road> parseListOfRoads(RoadMap roadMap, String cadRoads){
		return null;
	}
	
	protected List<SimulatedObject> parseListOfSimObj(RoadMap roadMap, String[] arraySimulatedObject){
		return null;
	}
	
	protected List<Vehicle> parseListOfVehicles(RoadMap roadMap, String[] arrayVehicles){
		return null;
	}
	
	public abstract void execute(Road road, int n);	
}
