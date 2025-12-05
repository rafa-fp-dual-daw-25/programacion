import java.util.Scanner;

public class EjeBucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*        //1. Contador simple (for): Ingresa un número N y muestra los números del 1 al N
        int n = 5;

        for (var i = 1; i <= n; i++) {
            System.out.println(i);
        }

        System.out.println("__________________");*/

/*        //2. Cuenta regresiva (for): Ingresa un número N y muestra una cuenta atrás desde N hasta 1
        int n = 5;

        for (var i = n; i >= 0; i--) {
            System.out.println(i);
        }*/

/*        //3. Tabla de multiplicar (for): Ingresa un número y muestra su tabla de multiplicar del 1 al 10
        int n = 5;

        for (var i = 1; i <= 10; i++) {
            var resultado = n * i;
            System.out.println(i + " x " + n + " = " + resultado);
        }*/

/*        //4. Sumatoria (for): Ingresa un número N y calcula la suma de los números del 1 al N.
        int n = 5;
        var suma = 0;

        for (var i = 1; i <= n; i++) {
            System.out.print(suma + " + " + i + " = ");
            suma = suma + i;
            System.out.println(suma);
        }*/

/*        //5. Números pares (while): Ingresa un número N y muestra los números pares desde 1 hasta N.
        int n = 5;
        int par = 1;

        while (par < n) {
            if (par % 2 == 0) {
                System.out.print(par + " ");

            }
            par++;
        }
        System.out.println();*/

/*        //6. Adivinar número (while): Ingresa un número secreto y deja que el usuario adivine hasta acertar

        int numSec = 14;
        System.out.println("Adivina el numero secreto: ");
        int numUser = sc.nextInt();

        while (numUser != numSec) {
            System.out.println("Intenta otra vez: ");
            numUser = sc.nextInt();
        }
        System.out.println("Muy bien! El numero secreto es: " + numSec);*/

/*        //7. Menú repetitivo (do-while): Muestra un menú simple con opciones hasta que el usuario elija
        //salir.

        int opt = sc.nextInt();
        do {
            System.out.println("1 - MENU PRINCIPAL");
            System.out.println("2 - MENU SECUNDARIO");
            System.out.println("3 - MENU TERCIARIO");
            System.out.println("0 - SALIR");
            opt = sc.nextInt();
        } while (opt != 0);
        System.out.println("SESION FINALIZADA");*/

/*        //8. Suma hasta cero (do-while): Ingresa números y súmalos hasta que se ingrese un cero.

        int numero;
        int suma = 0;

        System.out.println("Ingresa números para sumar (0 para terminar)");

        do {
            System.out.print("Ingresa un número: ");
            numero = sc.nextInt();
            suma += numero;

        } while (numero != 0);

        System.out.println("La suma total es: " + suma);*/

    /*    //9. Validar contraseña (while): Pide una contraseña hasta que el usuario escriba la correcta.

        String pinSys = "rafa@1234";
        System.out.println("Escribe la contraseña: ");
        String pinUser = sc.next();

        while (!pinSys.equals(pinUser)) {
            System.out.println("Contraseña incorrecta");
            System.out.println("Escribe la contraseña: ");
            pinUser = sc.next();
        }
        System.out.println("Contraseña correcta. Acceso permitido");*/

        //10. Números impares (for): Ingresa un número N y muestra los impares desde 1 hasta N.

        System.out.println("Ingresa un numero natural : ");
        int n = sc.nextInt();

        for (var i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("Fin.");
    }
}