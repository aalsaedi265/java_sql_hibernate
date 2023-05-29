package trafficLightDesktopApp;

public enum traficlight {
    
	RED ("Stop"),
	YELLOW ("Wait"),
	GREEN ("Go") ;
	
	private String action;
	
	// constructor
	private traficlight (String action) {
		this.action = action;
	}

	// getter method of action
	public String getAction() {
		return action;
	}
	
}
