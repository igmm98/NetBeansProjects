package ordenarascendente;
import java.util.Scanner;

public class OrdenarAscendente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int [] arreglo = new int[10];
        for(int a=0; a<10;a++){
            System.out.println("Ingrese dato "+(a+1)+":");
            arreglo[a] = leer.nextInt();
        }
        int [] arregloOrdenado = new int[10];
        for(int b = 0; b<10;b++){
            
            for(int c = 0; c<10;c++){
                
                if(arreglo[b]<arreglo[c]){
                    
                    arregloOrdenado[b] = arreglo[b];
                    
                }
                
            }
            
        }
        for(int d = 0;d<10;d++){
            System.out.println(arregloOrdenado[d]);
        }
    }
    
}
