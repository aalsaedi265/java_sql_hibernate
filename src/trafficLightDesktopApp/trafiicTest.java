package trafficLightDesktopApp;

public class trafiicTest {
    public static void main(String[] args) {
		
		traficlight [] lights = traficlight.values();
		// for-each loop starts to access Enum elements
		for (traficlight light : lights) {
			System.out.println("Light : " + light.toString()
							+ " Action : " + light.getAction());
		}

	}
}
