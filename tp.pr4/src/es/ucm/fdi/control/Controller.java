/*InputStream : Es superclase de FileInputStream, InputStream se usa para
 * leer datos basados en bytes, un byte a la vez.  
 *OutputStream : Es superclase de FileOutputStream, el write(byte) metodo se usa 
 *para escribir un solo byte en el outputStream.    *  
 * 
 * Objetivo: La clase Controller controla la ejecución del simulador 	 
 * */
package es.ucm.fdi.control;

import java.io.InputStream;
import java.io.OutputStream;

import es.ucm.fdi.control.eventbuilders.EventBuilder;
import es.ucm.fdi.control.eventbuilders.MakeVehicleFaultyEventBuilder;
import es.ucm.fdi.control.eventbuilders.NewJunctionEventBuilder;
import es.ucm.fdi.control.eventbuilders.NewRoadEventBuilder;
import es.ucm.fdi.model.TrafficSimulator;

public class Controller {
	protected TrafficSimulator sim; // simulador que usa
	protected OutputStream outputStream; // flujo de salida
	protected InputStream inputStream; // flujo de entrada
	protected int ticks; // pasos de la simulacion dados por el usuario
	EventBuilder[] eventBuilders = {new NewJunctionEventBuilder(),
									new NewRoadEventBuilder(),
									new NewJunctionEventBuilder(),
									new MakeVehicleFaultyEventBuilder()}; // array de constructores de eventos
	
	public Controller(TrafficSimulator trafficSimulator, int time, InputStream inStream, OutputStream outStream){
		sim = trafficSimulator;
		outputStream = outStream;
		inputStream = inStream;
		ticks = time;		
	}
	
	public Controller(TrafficSimulator trafficSimulator, OutputStream outputStream){
		
	}
	
	/**
	 *Establece los constructores de eventos 
	 * @param array_of_events
	 */
	public void setEventBuilders(EventBuilder[] arrayOfEvents){
				
	}
		
	/**
	 * Obtiene el array de constructors de eventos
	 * @param array_of_events
	 */
	public EventBuilder[] getEventBuilders(){
		return null;		
	}
	
	public void run(){
		
	}
	
	public void reset(){
		
	}	
	
	public void setOutputStream(OutputStream outputStream){
		
	}
	
	public void run(int n){
		
	}
	
	public void loadEvents(InputStream inputStream){
			
	}
}
