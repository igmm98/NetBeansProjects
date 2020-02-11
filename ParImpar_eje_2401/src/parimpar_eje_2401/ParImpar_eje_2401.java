package parimpar_eje_2401;

public class ParImpar_eje_2401 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c = 1;
        int son = 0; //Para contar impares
        int pares = 0; //Para contar pares
        while(c<100){
            System.out.println(c);
            c=c+2;
            son++;
        }
        
        //Ciclo 'FOR' o 'PARA'
        /*
        for(int n=1; n<=100;n++){
            System.out.println(c);
            if((c%2)!=0){
                son++;
            }else{
                pares++;
            }
        }*/
        /*do{
            System.out.println(c);
            if((c%2)!=0){son++;}
            else{pares++;}
            c++;
        }while (c<=100);*/
        
        System.out.println("El numero de impares que hay es: "+son+", y el numero de pares es: "+pares);
    }
}
