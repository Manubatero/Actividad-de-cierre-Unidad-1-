package operaciones;

import java.util.Scanner;
/**
 *
 * @author Manuel Barrera
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println("El resultado de la suma de estos valores es: " + (num1 + num2));
        System.out.println("El resultado de la resta de estos valores es: " + (num1 - num2));
        System.out.println("El resultado de la multiplicacion de estos valores es: " + (num1 * num2));
        System.out.println("El resultado de la division de estos valores es: " + (num1 / num2));
    }
    
}
