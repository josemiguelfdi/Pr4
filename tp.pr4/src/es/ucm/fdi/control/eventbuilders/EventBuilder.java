//EventBuilder : Constructor de eventos
package es.ucm.fdi.control.eventbuilders;

import es.ucm.fdi.ini.IniSection;
import es.ucm.fdi.model.Event;

public abstract class EventBuilder {
	EventBuilder(){	
	}
	
	public abstract Event parse(IniSection initiateSection);
	
	public String template(){
		return null;		
	}
}
