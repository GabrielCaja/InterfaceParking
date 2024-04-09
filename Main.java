package InterfacesParking;


public class Main {
    public static void main(String[] args) {
    	
    	//Se crean 2 parking con distintas localizaciones
        Parking parkingEste = new Parking(1,Localizacion.ESTE); 
        Parking parkingNorte = new Parking(1,Localizacion.NORTE); 
        
        //Se crean 3 vehiculos
        Vehiculo v1 = new VehiculoCliente("123GDGC");
        Vehiculo v2 = new VehiculoCliente("547AFFEG");
        Vehiculo v3 = new VehiculoCliente("1574FUAH");

        System.out.println(parkingEste);
        System.out.println(parkingNorte);

        //Tiempo de estancia en el parking por vehiculo
        v1.setTiempo(1440);
        v2.setTiempo(120);

        //Se aparcan los coches en el parking ESTE
        v1.aparca(parkingEste); 
        v2.aparca(parkingEste); 
        v3.aparca(parkingEste); 
       
        //Se les factura el importe
        double factura = v1.factura();
        double factura2 = v2.factura();

        System.out.println("El importe a pagar para el vehiculo con matricula: " + v1 + ", es: " + factura + "€");
        System.out.println("El importe a pagar para el vehiculo con matricula: " + v2 + ", es: " + factura2 + "€");

    }
}