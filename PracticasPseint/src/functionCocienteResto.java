import java.util.Scanner;

public class functionCocienteResto {
    // Funcion de calcula el cociente a través de un contador incremental
    static int calcularCociente(int valor1, int valor2){
        int cont=0;
        while (valor1>=valor2) {
            valor1-=valor2;
            cont++;
        }
        return cont;
    }
    // Funcion que calcula el resto, a traves de restas sucesivas
    static int calcularResto(int valor1, int valor2){
        while (valor1>=valor2) {
            valor1-=valor2;
        }
        return valor1;
    }
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);
        int num1, num2, cociente, resto;
        String validar;
        System.out.println("---------------------------------------------");
        System.out.println("COCIENTE Y RESTO A TRAVES DE RESTAS SUCESIVAS");
        System.out.println("---------------------------------------------");
        // Control de repeticiones hasta que el usuario decida parar
        do {
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

            // funciones donde pasamos dos parametros por valor para que nos devuelva el cociente y resto en cada funcion
            cociente = calcularCociente(num1, num2);
            resto = calcularResto(num1, num2);

            System.out.println("El cociente  es " + cociente + " y el resto " + resto);
            System.out.println("¿Deseas continnuar? [Si]/[No]: ");
            validar = keyboardIn.next();
            if(!validar.equalsIgnoreCase("si"))
                System.out.println("Gracias por usar el programa de cocientes y restos de una división, hasta pronto!");
        } while (validar.equalsIgnoreCase("si"));
    }
}
