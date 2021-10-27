import java.util.Scanner;

// 2.	Introducir dos números positivos y calcular el cociente y resto de la división por restas sucesivas
// (Ejemplo  n1:17 n2:4 coc:4 resto:1). Repetir el proceso hasta que no se desee continuar.
public class calcularCocienteResto {
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);
        int num1, num2, cont;
        String validar;
        System.out.println("---------------------------------------------");
        System.out.println("COCIENTE Y RESTO A TRAVES DE RESTAS SUCESIVAS");
        System.out.println("---------------------------------------------");
        // Control de repeticiones hasta que el usuario decida parar
        do {
            // Contador inicializado a cero en cada iteración
            cont=0;
            // Control de valores por teclado, para que el usuario introduzca valores positivos y el orden del dividendo y divisor
            do {
                System.out.println("Introduce el dividendo de la división : ");
                num1 = keyboardIn.nextInt();
                System.out.println("Introduce el divisor de la división : ");
                num2 = keyboardIn.nextInt();
                if (num1<num2)
                    System.out.println("El dividendo " + num1 + " tiene que ser mayor que el divisor " + num2);
                if (num1<0 || num2<0)
                    System.out.println("Introduce valores positivos mayores que cero");
            } while ((num1<0 || num2<0) || (num1<num2));
/*
            // Primer intento de llevar el control de cada resultado,
            // en esta parte del codigo se intento controlar el resto, pero este falla al tener
            // un limitante en el if, y quedando truncado en valores que se quedan iterando al infinito
            // el control correcto pasa por controlarlo desde el inicio el while, no vamos a introducir valores el control debe ser al inicio
            // en el caso de un 5 y 3, el valor num1 entra solo una vez al if, y siempre va ir comparando el num1 que seria igual a 2 en la primera iteracion
            // y nunca saldria del bucle
            do {
                System.out.println(cont);
                if (num1 >= num2){
                    num1-=num2;
                    cont++;
                }
            } while (num1!=0 && num1!=1);
*/
            // Control correcto, comparamos al inicio si num1 es mayor que num2, si sucede este pasa a restar en cada iteración el valor que se almacena en num1
            // cada vez que entra al bucle un contador va sumando, y al final el contador coincide con el cociente de la division
            // y el num1 con el resto de la división
            while (num1>=num2) {
                num1-=num2;
                cont++;
            }

            System.out.println("El cociente  es " + cont + " y el resto " + num1);
            System.out.println("¿Deseas continnuar? [Si]/[No]: ");
            validar = keyboardIn.next();
            if(!validar.equalsIgnoreCase("si"))
                System.out.println("Gracias por usar el programa de cocientes y restos de una división, hasta pronto!");
        } while (validar.equalsIgnoreCase("si"));
    }
}
