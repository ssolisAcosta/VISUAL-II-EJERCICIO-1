package clases.basicas;

/**
 * @Instituto Rumiñahui
 * @author SSolis
 */
public class OperacionesDeber {

    public static void metodo1(){
        boolean b = true;
        int i=1;
        if(b){
            i++;
        }
        System.out.println(i);
    }
     public static void metodo2(){
        boolean b=(true&&!false)?
                false:true;
         System.out.println(b);
    }
     
}
