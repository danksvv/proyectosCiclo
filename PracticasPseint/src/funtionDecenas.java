import java.util.Scanner;

public class funtionDecenas {
    static double calcularDecenas(double num){
        return num/10.0;
    }
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);
        double numero, decenas;

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
            // funcion que llama a Calcular decenas y devuelve un double
            decenas = calcularDecenas(numero);
            // Imprimimos la parte entera del tipo double, para que visualize la decena correspondiente
            System.out.println("El número " + (int)numero + " tiene " + (int)decenas + " decenas ");
        }
    }

}
