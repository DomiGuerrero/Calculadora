/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Domingo_Entornos
 * @version prueba de ejercicio 1
 * @since Febrero 2022
 */

public class Calculadora {
    private int num1;
    private int num2;
    
    /**
     * 
     * @param a primer parametro
     * @param b segundo parametro
     */
    public Calculadora(int a, int b){
        num1=a;
        num2=b;
    }
    
    /**
     * 
     * @return devuelve la suma de los dos parametros dados en un entero
     */
    
    public int suma(){
        int result=num1+num2;
        return result;
    }
    
    /**
     * @see resta2
     * @return si el resultado de la resta de los parámetros es mayor que 0 devuleve un entero resultado
     */
    public int resta(){
        int result;
        if (resta2())   result = num1-num2;
        else            result = num2-num1;
        return result;
    }
    
    /**
     * 
     * @return comprueba si el primer parámetro es mayor que el segundo 
     */

    public boolean resta2(){
        if (num1 > num2)    return true;
        else                return false;
    }
    
    /**
     * 
     * @return devuelve la multiplicacion de ambos parámetros 
     */
    
    public int multiplica(){
        int result=num1*num2;
        return result;
    }
    
    /**
     * @deprecated 
     * @return  devuelve la division de ambos parámetros 
     */
    
    public int divide(){
        int result=num1/num2;
        return result;
    }
    
    /**
     * 
     * @return comprueba si se hace una división por 0 y si no es el caso devuelve el resultado
     */
    
    public Integer divide2(){
        if(num2==0) return null;
        int result=num1/num2;
        return result;
    }
    
    /**
     * 
     * @throws ArithmeticException  division por 0
     * @return devuelve el resultado de la division de ambos parámetros
     */

     public int divide0(){
        if(num2==0) 
            throw new java.lang.ArithmeticException("División por 0");
        else{
            int result=num1/num2;
            return result;
        }
    }
     
     
    /**
     * @see suma
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calcu = new Calculadora(20, 10);
        System.out.println(calcu.suma());
    }
    
}
