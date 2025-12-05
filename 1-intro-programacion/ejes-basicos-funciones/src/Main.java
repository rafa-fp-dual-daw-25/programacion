public class Main {
    public static void main(String[] args) {

        String nameProgramador = "Rafael", nameRobot = "R2-D2";
        int sensor1 = 8, sensor2 = 16;

        robot();
        sensores();
        programador("Rafael");
        nRobot(nameProgramador, nameRobot);
        updateSensor(sensor1, sensor2);
        velocidad(80);
        movimiento(10);
        temperatura(42.5);
        sensor(27.8, 22.3, 48.23);
        pasos(7);
    }

    //1. Crea una función que muestre por pantalla 'Robot inicializado'. Llama a la función desde el main.
    public static void robot() {
        System.out.println("Robot inicializado");
    }

    //2. Crea una función que imprima el mensaje 'Sensores calibrados correctamente'. Llama a la función.
    public static void sensores() {
        System.out.println("Sensores calibrados correctamente");
    }

    //3. Crea una función que muestre un mensaje con tu nombre como si fueras el programador del robot.
    public static void programador(String n) {
        System.out.println("El programador es " + n);

    }

    //4. Crea una función que reciba el nombre de un robot como parámetro y muestre un mensaje de bienvenida.

    public static void nRobot(String n, String r) {
        System.out.println("Hola, " + n + "! Soy " + r + ".");
    }

    //5. Crea una función que reciba dos números y devuelva la suma como si fueran datos de sensores.

    public static void updateSensor(int s1, int s2) {
        int suma = s1 + s2;
        System.out.println("Nuevos datos de sensores: " + suma);
    }

    //6. Crea una función que reciba la velocidad de un motor y muestre si es segura (<100) o peligrosa (>=100).

    public static boolean velocidad(int v) {
        if (v < 100) {
            System.out.println("Velocidad segura");
            return true;
        } else {
            System.out.println("Velocidad peligrosa");
            return false;
        }
    }

    //7. Crea una función que reciba un número N y en un bucle muestre 'Movimiento ejecutado' N
    //veces

    public static void movimiento(int n) {
        int i = 1;
        while (i <= n) {
            System.out.println("Movimiento ejecutado " + i);
            i++;
        }
    }

    //8. Crea una función que reciba una temperatura y muestre si el robot debe enfriarse (>40 grados) o seguir funcionando.

    public static void temperatura(double t) {
        if (t > 40) {
            System.out.println("Temperatura actual (" + t + "ºC), el robot debe enfriarse.");
        } else {
            System.out.println("Temperatura actual (" + t + "ºC), el robot puede seguir funcionando.");
        }
    }

    //9. Crea una función que reciba tres lecturas de un sensor de distancia y devuelva la más pequeña (mínima).

    public static void sensor(double a, double b, double c) {
        double menor = Math.min(a, Math.min(b, c));
        System.out.println("La menor lectura es: " + menor + ".");
    }

    //10. Crea una función que reciba un número N y, usando un bucle, simule que el robot da N pasos, mostrando cada paso.

    public static void pasos(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Paso numero " + i + " del robot.");
        }
        System.out.println("Movimientación del robot finalizada.");
    }
}