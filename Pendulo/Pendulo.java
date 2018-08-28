import java.util.Scanner;

public class Pendulo {
    static Scanner teclado = new Scanner(System.in);
    
    private double longitud;
    private double aceleracion;
    
    public Pendulo() {
        longitud = 0;
        aceleracion = 0;
    }
    
    public Pendulo(double l, double a) {
        longitud = l;
        aceleracion = a;    
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }
    
    public static void main(String[] args) {
                
        System.out.println(".::PENDULO::.");
        System.out.println("");
        System.out.println("");
        System.out.println("Ingrese los datos del pendulo");
        System.out.println("");
        System.out.println("Ingrese la longitud del pendulo");
        double longitud = teclado.nextDouble();
        if (longitud <= 0) {
        	System.out.println("ERROR!!! la longitud debe ser mayor que 0" );
        	main(args);
        }        
        System.out.println("Ingrese la aceleracion gravitacional del pendulo");
        double aceleracion = teclado.nextDouble();
        if (aceleracion <= 0) {
        	System.out.println("ERROR!!! la aceleracion debe ser mayor que 0" );
        	main(args);
        }  
        Pendulo pen = new Pendulo (longitud, aceleracion);
        System.out.println("");        
        double p = (2 * (Math.PI)) * Math.sqrt(pen.aceleracion / pen.longitud); 
        System.out.println("La oscilacion de pendulo es:" + p);
        System.out.println("");
        main(args);
        
    }
}
