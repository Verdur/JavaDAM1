class Estatica{
    static void rellenarArray (String [] arr,String input){

        for (short i = 0;i<arr.length;++i) {
            arr[i]=input;
        }

    }
}
public class Ejercicio4
{
    public static void main (String [] args){
        /*Declaro dos constantes ya que en el enunciado nos dice que es de 3 filas
        y tambien delclaro el 2 que utilizo ya que cambiando estos valores cambiairias
        el valor de ambas matrices*/

        final short TAM = 3;
        final short TAM2 = 2;
        String [] [] reg = new String [TAM] [TAM];
        String [] [] irreg = new String [TAM] [];
        irreg[0] = new String [TAM];
        irreg [1]= new String [TAM2];
        irreg [2]= new String [TAM];
        
        //Inicializo las matrices
        relleMat(reg);
        relleMat (irreg);
        
        /* Comprobacion de que el array se inicializa
        for (short i=0;i<reg.length;++i){
            for (short f = 0;f<reg[i].length;++f){
                System.out.println(reg[i][f]);
            }
        }*/
        //compruebo si son regulares
        compReg(reg);
        compReg(irreg);
    }

    static void relleMat (String [] [] mat){
        for(short i=0;i<mat.length;++i){
            Estatica.rellenarArray(mat[i],"");
        }
    }

    static void compReg(String [] [] mat){
        if (isRegular(mat)==true){
            System.out.println("Es irregular");
        }else{
            System.out.println("Es regular");
        }
    }

    static boolean isRegular (String [] [] mat){
        short i = 0;
        boolean flag = false;
        int longi =  mat[0].length;
        i=1;
        /*declaro la i a 1 ya que la matriz siempre va a ser al menos de dos filas 0-1
        ya que en caso de tener solo 1 seria un array simple
         */
        do{
            if (mat[i].length != longi){
                flag = true;
            }
            else{
                ++i;
            }
        }while (flag == false && i >= mat.length);

        return flag;
    }
}