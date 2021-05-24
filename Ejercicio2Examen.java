import java.util.Scanner;
import java.util.StringTokenizer;

class EjercicioA{
    private float numReal;

    public float getnumReal() {
        return numReal;
    }

    public void setnumReal(float numReal) {
        this.numReal = numReal;
    }

    public EjercicioA(float numReal){
        this.numReal = numReal;
    }
}

public class Ejercicio2
{
    public static void main (String [] args) throws Exception {
        //Creo el objeto pasando el metodo que solo devuelve numeros correctos.
        EjercicioA num = new EjercicioA(petNum());  
        System.out.println(num.getnumReal());
        //vuelvo a pedir el numero en el set y luego muestro el nuevo resultado
        num.setnumReal(petNum());
        System.out.println(num.getnumReal());
    }

    static float petNum(){
        //Creo la constante que me indica los decimales permitidos
        final int CANTDECI = 2;
        float input = 0;
        boolean flag=false;
        String input2 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un decimal de maximo 2 decimales");
        do{
            try{
                input=Float.parseFloat(sc.nextLine());
                //convierto el numero a cadena con el tokenizer
                StringTokenizer stt1 =  new StringTokenizer(Float.toString(input));
                //salto de forma que la asignacion a la cadena sea despues del .
                stt1.nextToken(".");
                input2=stt1.nextToken(".");
                //si la cadena de los decimales es mayor que al asignado me tira una excepcion
                if(input2.length() > CANTDECI){
                    throw new Exception("Error : Mas de dos decimales");
                }else
                {
                    //en caso de no ser mayor salimos y devolvemos el numero
                    flag = true;
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while(flag == false);
        return input;
    }

}
