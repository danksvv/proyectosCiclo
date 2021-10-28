import java.util.Scanner;

public class notaMedia {
    public static void main(String[] args) {

        Scanner keyboardIn = new Scanner(System.in);
        double nota, media_aprobados, nota_aprobados=0;
        int alumnos=0;

        System.out.println("----------------------------------------");
        System.out.println("NOTA MEDIA DE ALUMNOS APROBADOS EN CLASE");
        System.out.println("----------------------------------------");
        // Recorrido de los 40 alumnos
        for (int i=0; i<10; i++){
            // Recorrido para cargar los valores y forzar a que el usuario introduzca valores validos
            do {
                System.out.println("Introduce la nota del " + (i+1) + "º alumno :");
                nota = keyboardIn.nextDouble();
                // Si el usuario introduce valores incorrectos, informamos que introduzca valores validos
                if (nota<0 || nota>10)
                    System.out.println("Introduce una nota valida entre 0 y 10");
                // Sino si la nota es mayor que 5, va ir acumulando la suma de nota aprobados y un contador de alumnos aprobados
                else if (nota>=5){
                    nota_aprobados += nota;
                    alumnos++;
                }

            } while(nota<0 || nota>10);
        }
        // Calculamos la media de los aprobados
        media_aprobados = nota_aprobados/alumnos;
        media_aprobados = Math.round(media_aprobados*100)/100.0;
        // Imprimimos el resultado
        System.out.println("===================================================");
        System.out.println("En total hay " + alumnos + " alumnos aprobados y la media es " + media_aprobados);
        System.out.println("===================================================");
    }
}
