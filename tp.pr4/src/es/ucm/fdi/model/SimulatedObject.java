/*identifier : identificador
 * 
 * 
 * 
 * 
 * */
package es.ucm.fdi.model;

import es.ucm.fdi.ini.IniSection;

public abstract class SimulatedObject {
	private String id;
	
	public SimulatedObject(String identifier) {
		id = identifier;
	}
	
	public String getId(){
		return null;
	}
	
	public String toString(){
		return null;
	}
	
	public String generateReport(int n){
		return null;		
	}
	
	/**
	 * Rellena el informe detallado
	 * @param initiateSection
	 */
	protected abstract void fillReportDetails(IniSection initiateSection);
	
	/**
	 * Obtener informe de la seccion etiquetada
	 * @return
	 */
	protected abstract String getReportSectionTag();
	
	/**
	 * Avanza un determinado número de pasos
	 * @param numberOfStep
	 */
	abstract void advance(int numberOfStep);	
}
