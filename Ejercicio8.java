package ejercicio.pkg8;
import java.util.Scanner;
/**
 *
 * @author Manuel Barrera
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Por favor, ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Por favor, ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        int resultadoEntero = num1 / num2;
        System.out.println("Resultado con int (sin decimales): " + resultadoEntero);
        double resultadoDecimal = (double) num1 / num2;
        System.out.println("Resultado con double (con decimales): " + resultadoDecimal);

        
    }
}
