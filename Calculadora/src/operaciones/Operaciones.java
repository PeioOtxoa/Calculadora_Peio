package operaciones;
public class Operaciones{
	
    /**
     * @author peio
     * Suma los dos numeros que recibe como parametros
     * 
     * @param valor1
     * @param valor2
     * @return La suma como número entero
     * @throws
     */
	
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    
    /**
     * @author peio
     * Resta los dos numeros que recibe como parametros
     * 
     * @param valor1
     * @param valor2
     * @return La resta como número entero
     * @throws
     */
    
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    
    /**
     * @author peio
     * Multiplica los dos numeros que recibe como parametros
     * 
     * @param valor1
     * @param valor2
     * @return La multiplicación como número entero
     * @throws
     */
    
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    
    /**
     * @author peio
     * Divide los dos numeros que recibe como parametros
     * 
     * @param valor1 Dividiendo
     * @param valor2 División
     * @return La división como número entero
     * @throws ArithmeticException Contemplamos la división entre cero
     */
    
    public int dividir (int valor1, int valor2)throws ArithmeticException{
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    
    /**
     * @author peio
     * Calcula el resto de los dos numeros que recibe como parametros
     * 
     * @param valor1 
     * @param valor2 
     * @return El resto como número entero
     * @throws ArithmeticException Contemplamos la división entre cero
     */
    
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}