package es.ucm.fdi.model;

public class NewRoadEvent extends Event{

	public NewRoadEvent(int time, String cad1, String cad2, String cad3, int n, int m) {
		super(time);
	}

	@Override
	public void execute(Road road, int n) {
		
	}
	
	public String toString(){
		return null;
	}
}
