package es.ucm.fdi.model;

public class NewJunctionEvent extends Event{

	public NewJunctionEvent(int n, String cad) {
		super(n);
	}

	@Override
	public void execute(Road road, int n) {

	}
	
	public String toString(){
		return null;
	}
}
