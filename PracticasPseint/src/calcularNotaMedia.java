// 3.	Introducir las notas de los 40 alumnos de la clase y calcular la media de los aprobados. Validar que la nota sea correcta
import java.util.Scanner;

public class calcularNotaMedia {
    public static void main(String[] args) {

        Scanner keyboardIn = new Scanner(System.in);
        double nota, nota_total_aprobados=0, cont=0, nota_media;
        int alumnos=10;
        // Solicitamos la nota de x=alumnos veces en la iteración del for
        for (int i=0; i<alumnos; i++){
            // Validamos que la nota introducida sea valida, entre 0 y 10
            do {
                System.out.println("Introduce la nota del " + (i + 1) + "º alumno :");
                nota = keyboardIn.nextDouble();
                // Si nota esta fuera del rango solicitado, avisamos al usuario que introduzca un nº valido
                if (nota<0 || nota>10)
                    System.out.println("Introduce una nota valida entre 0 y 10 : ");
            } while (nota<0 || nota>10);
            // Si la nota es mayor que 5 (aprobados) entrará al if y sumara las veces que vaya recorriendo el for
            if (nota>=5){
                nota_total_aprobados += nota;
                // El contador almacena las veces que ha entrado en el if
                cont++;
            }
        }
        // nota media de alumnos aprobados
        nota_media = nota_total_aprobados/cont;
        nota_media = Math.round(nota_media*100)/100.0;

        System.out.println("La nota media de los " + (int)cont + " alumnos aprobados es " + nota_media);
    }
}
