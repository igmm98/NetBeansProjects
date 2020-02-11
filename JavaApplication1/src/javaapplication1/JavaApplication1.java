

package javaapplication1;

import java.util.Scanner; //SE UTILIZA PARA LEER
import java.util.Random;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        /*
         //ARREGLO BIDIMENSIONAL JAVA <<<<
        int [][] coordenadas = {{2,4},{1,3},{11,12}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Dimension[" + i + "] Dato en posición[" + j + "] = "
                                   + coordenadas[i][j]);}
        }
        */
        Scanner lector = new Scanner(System.in);
        int n = 0;
        int vidasDelJuego = 10;
        System.out.println("****************************************************** \n");
        System.out.println("Eje Y de 5 Espacios (0 a 4)");
        System.out.println("   | ");
        System.out.println("   | ");
        System.out.println("    --- Eje X de 5 Espacios (0 a 4) \n");
        System.out.println("INICIAS CON "+vidasDelJuego+" VIDAS \n");
        System.out.println("****************************************************** \n");
        
        String coordenadas[][] = {{"","","","",""},{"","","","",""},{"","","","",""},{"","","","",""},{"","","","",""}};
        while(n<2){
            Random randomNum = new Random();
            Random randomNum2 = new Random();
            int a = randomNum.nextInt(5);
            int b = randomNum2.nextInt(5);
            //System.out.println("El numero random es = "+a+","+b);
            
            if(coordenadas[a][b]==""){
                coordenadas[a][b]="BARCO";
                System.out.println("Barco generado con exito");
                n++;
            }else{System.out.println("¡Nope, se randomizará otro barco!");}
            
        }
        int coordenadaY;
        int coordenadaX;
        
        int x = 0;
        //inicio while
        while(vidasDelJuego>0){
            
            System.out.println("Ingrese coordenada Y");
            coordenadaY = lector.nextInt();
            System.out.println("Ingrese coordenada X");
            coordenadaX = lector.nextInt();
            
            if(coordenadaY<5 && coordenadaX<5){
                if(coordenadas[coordenadaY][coordenadaX]=="BARCO"){
                    System.out.println("Hundiste un barco!!! \n");
                    x++;
                    if(x==n){
                        System.out.println("\n GANASTE");
                        break;}
                }else{
                    vidasDelJuego--;
                    System.out.println("\n Suerte para la proxima \n PERDISTE UNA VIDA, TE QUEDAN "+vidasDelJuego+"\n");
                    
                    if(vidasDelJuego==0){
                        System.out.println("¡HAZ PERDIDO!");
                    }
                }
            
            }else{System.out.println("Coordenadas Invalidas");}
            
            
            
        }//fin while
        
        
        
        
        
    
        /*Scanner lector = new Scanner(System.in);
        int n2 = 0;
        while(n2<2){
            
            
            n2++;
        }*/
        
    }
    
}
