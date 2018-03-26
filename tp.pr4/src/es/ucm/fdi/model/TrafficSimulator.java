package es.ucm.fdi.model;

import java.io.OutputStream;
import java.util.List;

public class TrafficSimulator {
	private RoadMap mpa; // estructura que almacena los objetos simulados
	List<Event> evetns; // lista de eventos que hay que ejecutar 
	private int time; // contador de pasos del simulador
	private OutputStream outStream; // flujo de salida utilizada
	
	public TrafficSimulator(OutputStream outputStream) {
		outStream = outputStream;
	}
	
	public void run(int n){
		
	}
	
	public void addEvent(Event e){
		
	}
	
	public void reset(){
		
	}	
	
	public void setOutputeStream(OutputStream outputStream){
		
	}
	
//	public void addObserver(TrafficSimulatorObserver o){
//		
//	}
	
//	public void removerObserver(TrafficSimulatorObserver o){
//		
//	}
		
	public String toString(){
		return null;
	}	
}
