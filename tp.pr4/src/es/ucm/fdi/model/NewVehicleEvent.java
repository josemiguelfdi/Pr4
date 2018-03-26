package es.ucm.fdi.model;

public class NewVehicleEvent extends Event{

	public NewVehicleEvent(Integer time, String cad, Integer integer, String[] array) {
		super(time);
	}

	@Override
	public void execute(Road road, int n) {
		
	}
	
	public String toString(){
		return null;
	}
}
