/* 
8.- Construya un programa que realice las operaciones de suma, resta, multiplicación y división. El programa deberá mostrar el siguiente menú. 
Programa calculadora 
A) Realizar una suma 
B) Realizar una resta 
C) Realizar una multiplicación 
D) Realizar una división 
E) Salir del programa 
Introduzca su opción: 
Una vez elegida la opción se solicitarán dos números y se mostrará el resultado correspondiente.
Sacchetti, Maria Giselle c2 */
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char opcion = ' ';

    while (opcion != 'E') {

        System.out.println("------Programa calculadora------");
        System.out.println("(A) Realizar una suma");
        System.out.println("(B) Realizar una resta");
        System.out.println("(C) Realizar una multiplicacion");
        System.out.println("(D) Realizar una division");
        System.out.println("(E) Salir del programa");
        System.out.print("Introduzca su opcion-> ");
        opcion = scanner.next().toUpperCase().charAt(0);


        switch (opcion) {
            //suma
            case 'A':
                System.out.println("\n --------- \n");
                System.out.print("Ingresar el primer numero: ");
                double num1Suma = scanner.nextDouble();
                System.out.print("Ingresar el segundo numero: ");
                double num2Suma = scanner.nextDouble();
                System.out.println("El resultado de la suma es: " + (num1Suma + num2Suma));
                break;
            case 'B':
            //resta
                System.out.println("\n --------- \n");
                System.out.print("Ingresar el primer numero: ");
                double num1Resta = scanner.nextDouble();
                System.out.print("Ingresar el segundo numero: ");
                double num2Resta = scanner.nextDouble();
                System.out.println("El resultado de la resta es: " + (num1Resta - num2Resta));
                break;
            case 'C':
            //multiplicacion
                System.out.println("\n --------- \n");
                System.out.print("Ingresar el primer numero: ");
                double num1Multiplicacion = scanner.nextDouble();
                System.out.print("Ingresar el segundo numero: ");
                double num2Multiplicacion = scanner.nextDouble();
                System.out.println("El resultado de la multiplicacion es: " + (num1Multiplicacion * num2Multiplicacion));
                break;
            case 'D':
            //division
                System.out.println("\n --------- \n");
                System.out.print("Ingresar el numerador: ");
                double numerador = scanner.nextDouble();
                double denominador;
                do {
                    System.out.print("Ingresar el denominador (no debe ser cero): ");
                    denominador = scanner.nextDouble();
                    if (denominador == 0) {
                        System.out.println("Error: El denominador no puede ser cero. Intente de nuevo.");
                    }
                } while (denominador == 0);
                System.out.println("El resultado de la division es: " + (numerador / denominador));
                break;
            case 'E':

                System.out.println("Saliendo de calculadora");
                break;
            default:

                System.out.println("Opcion no valida. Intentelo nuevamente.");
                break;
        }
    }

    scanner.close();
  }

}