package datos_usuarios;

import java.util.Scanner;
/**
 *
 * @author Manuel Barrera
 */
public class Datos_Usuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.println("Ingrese su nombre, por favor");
        nombre = input.nextLine();
        System.out.println("Ingrese su edad, por favor");
        edad = input.nextInt();
        System.out.println(nombre);
        System.out.println(edad);
    }
    
}
