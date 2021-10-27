import java.util.Scanner;

// 1.	Introduce un número de 1 a 50 y visualizar a qué decena pertenece (Ejemplo 42: decena 4). Repetir el proceso 10 veces.
public class calcularDecenas {
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);
        double numero;
        double decena;
        System.out.println("CACULADORA DE DECENAS");
        // Control de los 10 intentos
        for (int i=0; i<10; i++) {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Tienes " + (10 - i) + " operaciones disponibles para hallar la decena de un nº entre 1 y 50 ");
            System.out.println("-----------------------------------------------------------------------------");
            // Control del rango que introduce el usuario entre 1 y 50
            do{
                System.out.println("Introduce un valor númerico entre 1 y 50 : ");
                numero = keyboardIn.nextDouble();
            }while (numero<1 || numero>50);
            // Calculamos la parte de la decena al dividir entre 10
            decena = numero/10;
            // Imprimimos la parte entera del tipo double, para que visualize la decena correspondiente
            System.out.println("El número " + (int)numero + " tiene " + (int)decena + " decenas ");
        }
    }
}
