import java.util.Scanner;

public class EjeIfScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*//1. Sensor de temperatura: Ingresa una temperatura en °C. Si es < 0 muestra 'Hace frío', si es > 30 muestra 'Hace calor', si no 'Clima templado'.
        System.out.println("Ingresa una temperatura en °C: ");
        int temp = sc.nextInt();

        if (temp < 0) {
            System.out.println("Hace frío!");
        } else if (temp > 30) {
            System.out.println("Hace calor!");
        } else {
            System.out.println("Clima templado!");
        }*/

        /*//2. Detector de color favorito: Ingresa un color. Si es 'rojo', 'azul' o 'verde', muestra 'Es un color primario', si no, 'Otro color'.

        System.out.println("Ingresa un color: ");
        String color = sc.next();

        if (color.equals("rojo") || color.equals("verde") || color.equals("azul")) {
            System.out.println("El color " + color.toUpperCase() + " es primario.");
        } else {
            System.out.println("El color: " + color.toUpperCase() + " no es primario.");
        }*/

        /*//3. Radar de velocidad: Ingresa la velocidad de un coche. Si es mayor a 120 km/h muestra 'Multa', si es menor o igual 'Velocidad correcta'
        System.out.println("Ingresa la velocidad: ");
        int velocidad = sc.nextInt();

        if (velocidad > 120) {
            System.out.println("Recibiras una multa!");
        } else {
            System.out.println("Velocidad correcta!");
        }*/

        /*//4. Clasificador de animales: Ingresa un animal. Si es 'perro' o 'gato' muestra 'Doméstico'. Si es 'tigre' o 'león' muestra 'Salvaje'. Otro caso: 'No clasificado'.
        System.out.println("Ingresa un animal: ");
        String animal = sc.next();

        if (animal.equals("perro") || animal.equals("gato")) {
            System.out.println("Animal domestico.");
        } else if (animal.equals("tigre") || animal.equals("león")) {
            System.out.println("Animal salvaje.");
        } else {
            System.out.println("Animal no clasificado.");
        }*/

        /*//5. Entrada a un concierto: Ingresa la edad. Si es menor de 12 no puede entrar, si está entre 12 y 17 necesita adulto, si es 18 o más puede entrar solo.

        System.out.println("Ingresa la edad: ");
        int eventoedad = sc.nextInt();

        if (eventoedad < 12) {
            System.out.println("No puede entrar.");
        } else if (eventoedad >= 12 && eventoedad < 18) {
            System.out.println("Puede entrar acompañado de un adulto.");
        } else {
            System.out.println("Puede entrar solo.");
        }*/

        /*//6. Semáforo: Ingresa un color ('rojo', 'amarillo', 'verde'). Muestra: 'Detente', 'Precaución' o 'Avanza'.

        System.out.println("Ingresa un color (rojo, amarillo o verde): ");
        String semaforo = sc.next().toLowerCase();

        while (!semaforo.equals("rojo") && !semaforo.equals("amarillo") && !semaforo.equals("verde")) {
            System.out.println("Ingresa un color (rojo, amarillo o verde): ");
            semaforo = sc.next();
        }
        if (semaforo.equals("rojo")) {
            System.out.println("Detente!");
        } else if (semaforo.contains("amarillo")) {
            System.out.println("Precaución!");
        } else {
            System.out.println("Avanza!");
        }*/

        /*//7. Juego de adivinanza: Ingresa un número secreto y luego una suposición. Indica si acertó, si el número secreto es mayor o menor.
        int secret = 10;
        System.out.println("Descubre el número secreto:");
        int suposicion = sc.nextInt();

        if (suposicion == secret) {
            System.out.println("Enhorabuena! Dio en el clavo.");
        } else {
            while (suposicion != secret) {
                if (suposicion < secret) {
                    System.out.println("El numero secreto es mayor. Intenta otra vez:");
                } else {
                    System.out.println("El numero secreto es menor. Intenta otra vez:");
                }
                suposicion = sc.nextInt();
                if (suposicion == secret) {
                    System.out.println("Enhorabuena! El numero correcto es " + suposicion + ".");
                }
            }
        }*/

        /*//8. Comparador de palabras: Ingresa dos palabras.Si son iguales, muestra 'Coinciden'.Si no, 'No coinciden'
        System.out.println("Ingresa la primera palabra: ");
        String palabra1 = sc.next();

        System.out.print("Ingresa la segunda palabra: ");
        String palabra2 = sc.next();

        String mensaje = (palabra1.equals(palabra2)) ? "Las palabras coinciden" : "Las palabras no coinciden";
        System.out.println(mensaje);*/

/*        //9. Sistema de votación: Ingresa 3 votos (String: 'A', 'B' o 'C'). Muestra quién ganó o si hay
        //empate.

        System.out.println("Ingresa 3 votos (A, B o C):");

        int a = 0, b = 0, c = 0;

        for (int i = 0; i < 3; i++) {
            String voto = sc.next().toUpperCase();
            if (voto.equals("A")) {
                a++;
            } else if (voto.equals("B")) {
                b++;
            } else if (voto.equals("C")) {
                c++;
            } else {
                System.out.println("Inválido");
                i--;
            }
        }

        if (a > b && a > c) {
            System.out.println("Ganó A");
        } else if (b > a && b > c) {
            System.out.println("Ganó B");
        } else if (c > a && c > b) {
            System.out.println("Ganó C");
        } else {
            System.out.println("Empate");
        }*/

        //10. Calculadora básica: Ingresa dos números y una operación (+, -, *, /). Muestra el resultado
        //según la operación.

        System.out.println("Ingresa el primer numero: ");
        int calc1 = sc.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int calc2 = sc.nextInt();
        System.out.println("Tipo de operación (+ - * /): ");
        String operador = sc.next();

        int resultado = 0;

        switch (operador) {
            case "+":
                resultado = calc1 + calc2;
                break;
            case "-":
                resultado = calc1 - calc2;
                break;
            case "*":
                resultado = calc1 * calc2;
                break;
            case "/":
                resultado = calc1 / calc2;
                break;
            default:
                System.out.println("Operador no válido.");
        }
        System.out.println(resultado);
    }
}