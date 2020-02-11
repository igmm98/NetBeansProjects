package javaapplication4;
import java.util.Scanner;

public class JavaApplication4 {
    /**
     //* @param args the command line arguments
     */
    public static int [] casas = new int [10];//Arreglo estatico
    public static Scanner leer = new Scanner(System.in);//Lector
    
    public static void main(String[] args) {
        casas();
        recorrer();
    }
    public static void casas(){
        
        for(int n=0;n<10;n++){
            int num;
            System.out.println("Ingrese cantidad de habitantes en la casa "+(n+1)+":");
            num = leer.nextInt();
            
            if(num>0 && num<8){
            casas[n]=num;
            
            }else{System.out.println("No valido");
            n--;}
        }
    }
    public static void recorrer(){
        for(int n=0;n<10;n++){
            if(casas[n]==1){System.out.println("Soltero");}
            else if(casas[n]>1 && casas[n]<5){System.out.println("Hay familia");}
            else if(casas[n]>4){System.out.println("Es oficina");}
        }
    }
    
}