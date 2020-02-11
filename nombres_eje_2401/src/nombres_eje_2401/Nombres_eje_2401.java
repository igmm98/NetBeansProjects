package nombres_eje_2401;
import java.util.Scanner;

public class Nombres_eje_2401 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        int contJuan = 0;
        int contPedro = 0;
        int contSara = 0;
        boolean detener = false;
        int contador = 1;
        
        while(detener==false){
            
            System.out.println("Ingrese nombre:");
            nombre = leer.next();
            
            switch (nombre.toLowerCase()){
                case "juan":
                    System.out.println("El nombre ingresado es Juan");
                    contJuan++;
                    System.out.println("El nombre Juan se ha ingresado "+contJuan+" veces");
                    break;
                case "pedro":
                    System.out.println("El nombre ingresado es Pedro");
                    contPedro++;
                    System.out.println("El nombre Pedro se ha ingresado "+contPedro+" veces");
                    break;
                case "sara":
                    System.out.println("El nombre ingresado es Sara");
                    contSara++;
                    System.out.println("El nombre Sara se ha ingresado "+contSara+" veces");
                    break;
                default:
                    System.out.println("¡Nombre inexistente!");
                    if(contador>5){//   CON ESTA INSTRUCCION LA EJECUCION DEL CODIGO SE DETIENE UNA VEZ SE HAYAN INGRESADO AL MENOS 5 NOMBRES Y EL NOMBRE INGRESADO NO EXISTA
                        detener = true;
                    }
                    break;
            }
            
            contador++;
        }
    }
}
