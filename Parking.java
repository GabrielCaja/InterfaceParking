package InterfacesParking;

import java.util.Random;

public class Parking {
	//Declaraciones de variables y atributos
	Random random = new Random();
    private int plazasDisponibles;
	private Localizacion localizacion;

    public Parking(int plazasDisponibles,Localizacion localizacion) {
        this.plazasDisponibles = random.nextInt(5) + 1;
        this.localizacion = localizacion;
    }

    public boolean hayPlaza() {
        return plazasDisponibles > 0;
    }

    public void ocuparPlaza() {
    	//Cada vez que se ocupa una plaza se quita 1 disponible
        plazasDisponibles= plazasDisponibles-1;
    }

	@Override
	public String toString() {
		return "El parking del "+ localizacion + " tiene " + plazasDisponibles + " plazas disponibles";
	}
    
    
}
