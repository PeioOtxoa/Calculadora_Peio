package menu;
import java.util.Scanner;

/**
 * 
 * @author peio
 *
 */

public class Menu {
    private static Scanner teclado = new Scanner(System.in);
    
    /**
     * @author peio
     * 
     * @return devuelve un array con los valores introducidos por el usuario
     */
    
    
    public int[] pedirNumeros(){
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
    
    /**
     * @author peio
     * 
     * @apiNote Le pide que tipo de operación quiere hacer
     * 
     * @return Devuelve el int con la operación seleccionada
     */
    
    public String menuOpciones() {
        String ret = "";
        do {
            System.out.print ("Operaciones [+, -, *, /, %]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
                ));
                return ret;
    }
    
    /**
     * @author peio
     * 
     * @apiNote Pregunta a ver si quiere continuar trabajando
     * 
     * @return Devuelve el boolean true o false
     */
    
    public boolean repetir(){
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("¿Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));
                    
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
    }
}