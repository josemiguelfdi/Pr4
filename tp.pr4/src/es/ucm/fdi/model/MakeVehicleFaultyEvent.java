package es.ucm.fdi.model;

public class MakeVehicleFaultyEvent extends Event{

	public MakeVehicleFaultyEvent(int time, Integer integer, String[] array) {
		super(time);
	}
		
	@Override
	public void execute(Road road, int n) {
		
	}
	
	public String toString(){
		return null;
	}
}
