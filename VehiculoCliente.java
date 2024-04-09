package InterfacesParking;

import java.util.Random;

public class VehiculoCliente implements Vehiculo {
	//Declaraciones de variables y atributos
    private final String matricula;
    private int tiempo;
	Random random = new Random();

    public VehiculoCliente(String matricula) {
        this.matricula = matricula;
        this.tiempo = 0;
    }
    
    public String toString(){
        return matricula;
    }

    public void setTiempo(int tiempo) {
    	//Tiempo aleatorio que estara cada coche en el parking
        this.tiempo = random.nextInt(2880) + 120;
    }

    public double factura() {
    	//Se calcula el coste por hora y por dia 
        int hora = tiempo / 60;
        double coste = 0;
        if(hora==24){
            coste =25;
        }else{
            coste = hora * 1.2;
        }
       return coste;
    }

    public boolean hayPlaza(Parking parking) {
    	//Se llama al metodo hayPlaza() para comprobar que se cumple dicha condicion
        return parking.hayPlaza();
    }

    public void aparca(Parking parking) {
    	//Se llama al metodo hayPlaza() para comprobar que se puede aparcar en dicho parking 
        if (hayPlaza(parking)) {
            parking.ocuparPlaza();
            System.out.println("El vehiculo con matricula " + matricula + " ha sido estacionado.");
        } else {
            System.out.println("No hay plazas disponibles en el parking");
        }
    }
}