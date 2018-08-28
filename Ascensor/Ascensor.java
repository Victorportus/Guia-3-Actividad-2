import java.util.Scanner;

public class Ascensor {
    static Scanner teclado = new Scanner(System.in);
    
    private int numPisos;
    private int numSotanos;
    static Ascensor ed[] = new Ascensor[1];

    public Ascensor() {
        numPisos = 0;
        numSotanos= 0;
    }
    
    public Ascensor(int p, int s) {
        numPisos = p;
        numSotanos= s;
    }
    
    public int getNumPisos() {
        return numPisos;
    }


    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }


    public int getNumSotanos() {
        return numSotanos;
    }


    public void setNumSotanos(int numSotanos) {
        this.numSotanos = numSotanos;
    }
    
    public static void main(String[] args) {
        System.out.println(".::EL ASCENSOR DE MI CASA::.");
        System.out.println("");
        System.out.println("");
        int dato = 9;
        do{
            System.out.println("1. Crea tu propio ascensor.");
            System.out.println("2. Mira como sube tu ascensor.");
            System.out.println("3. Mira como baja tu ascensor.");
            System.out.println("4. ¿Cuantos pisos puede atender mi ascensor?");
            System.out.println("0. Sal del ascensor.");
            dato = teclado.nextInt();
            System.out.println("");
            System.out.println("");
        
            switch (dato) {
                case 1:
                miAscensor();
                break;
                
                case 2:
                subir();
                break;
                
                case 3:
                bajar();
                break;
                
                case 4:
                atender();
                break;
            }
            
        }while (dato != 0);
        
    }
    
    public static void miAscensor() {
        
        System.out.println("Crea tu propio ascensor");
        System.out.println("");
        System.out.println("¿Cuantos pisos tiene el edificio?");
        int numPisos = teclado.nextInt();
        System.out.println("¿Cuantos sotanos tiene el edificio?");
        int numSotanos = teclado.nextInt();        
        ed[0] = new Ascensor(numPisos, numSotanos);
        System.out.println("");
    }
    
    public static void subir() {
        
        System.out.println("¿En que piso se encuentra el ascensor?");
        int piso = teclado.nextInt();
        int sotanos = ed[0].getNumSotanos() * -1;
        if (piso == 0){
            System.out.println("ERROR!!! el piso 0 no existe!!!");
            System.out.println("");
            return;
        }
        if (piso < sotanos){
            System.out.println("ERROR!!! el piso seleccionado esta por debajo del piso mas bajo.");
            System.out.println("");
            return;
        } 
        if (piso > ed[0].getNumPisos()){
            System.out.println("ERROR!!! el piso seleccionado esta por encima del piso mas alto.");        
            System.out.println("");
            return;
        }  
        if (piso == -1){
            piso = 1; 
            System.out.println("Si el ascensor sube 1 piso, quedaras en el piso -> "+ piso);
            System.out.println("");
            return;
        }
        if (piso == ed[0].getNumPisos()){
            System.out.println("Estas en el piso mas alto, no puedes subir mas.");
            System.out.println("");
            return;
        }
        if (((piso < -1) && (piso >= sotanos)) || ((piso < ed[0].getNumPisos()) && (piso >= 1))){
            piso++;
            if (piso == ed[0].getNumPisos()){
                System.out.println("Si el ascensor sube 1 piso, quedaras en el piso -> "+ piso);
                System.out.println("Has llegado al piso mas alto.");
                System.out.println("");
                return;
            }
            System.out.println("Si el ascensor sube 1 piso, quedaras en el piso -> "+ piso);
            System.out.println("");
        }        
    }
    
    public static void bajar(){
        
        System.out.println("¿En que piso se encuentra el ascensor?");
        int piso = teclado.nextInt();
        int sotanos = ed[0].getNumSotanos() * -1;
        if (piso == 0){
            System.out.println("ERROR!!! el piso 0 no existe!!!");
            System.out.println("");
            return;
        }
        if (piso < sotanos){
            System.out.println("ERROR!!! el piso seleccionado esta por debajo del piso mas bajo.");
            System.out.println("");
            return;
        } 
        if (piso > ed[0].getNumPisos()){
            System.out.println("ERROR!!! el piso seleccionado esta por encima del piso mas alto.");        
            System.out.println("");
            return;
        }
        if (piso == 1){
            piso = -1; 
            System.out.println("Si el ascensor baja 1 piso, quedaras en el piso -> "+ piso);
            System.out.println("");
            return;
        }
        if (piso == sotanos){
            System.out.println("Estas en el piso mas bajo, no puedes bajar mas.");
            System.out.println("");
            return;
        }
        if (((piso <= -1) && (piso > sotanos)) || ((piso <= ed[0].getNumPisos()) && (piso > 1))){
            piso--;
            if (piso == sotanos){
                System.out.println("Si el ascensor baja 1 piso, quedaras en el piso -> "+ piso);
                System.out.println("Has llegado al piso mas bajo.");
                System.out.println("");
                return;
            }
            System.out.println("Si el ascensor baja 1 piso, quedaras en el piso -> "+ piso);
            System.out.println("");
        }
    }
    
    public static void atender(){
        int piso = ed[0].getNumPisos() + ed[0].getNumSotanos();
        System.out.println("El ascensor atiende > "+ piso + " < pisos.");
        System.out.println("");        
    }
}
    
    


