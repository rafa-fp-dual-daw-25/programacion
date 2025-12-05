public class EjeBasico3 {
    public static void main(String[] args) {
        //1. Mayoría de edad con nacionalidad:
        int edad = 21;
        boolean nacionalidad = true;

        if (edad >= 18 && nacionalidad == true) {
            System.out.println("Puedes votar");
        } else {
            System.out.println("No puedes votar!!!");
        }

        // 2. Aprobación con condiciones:
        int nota = 70;
        boolean asistencia = true;
        if (nota >= 60 && asistencia == true) {
            System.out.println("Estás aprobado!!!");
        } else {
            System.out.println("Estás suspenso. :(");
        }
        //3. Rango válido:
        int num = 55;
        if (num >= 50 && num <= 100) {
            System.out.println("Dentro del rango.");
        } else {
            System.out.println("Fuera del rango.");
        }


        //4. Usuario y contraseña:
        String usuario = "admin";
        String contrasena = "1234";


        if (usuario.equals("admin") && contrasena.equals("1234")) {
            System.out.println("Acceso permitido!");
        } else {
            System.out.println("Acceso denegado!");
        }

        //5. Compra con descuento adicional:
        double precio = 250;
        boolean tarjeta = false;

        double precioFin = 0;

        if (precio > 200) {
            precioFin = precio * 0.85;

            if (tarjeta) {
                precioFin = precioFin * 0.95;
            }
            System.out.println("El precio original es: " + precio + " €.");

            System.out.println("El precio con descuento es: " + precioFin + " €.");
        }

        //6. Categoría de edad:
        int edadPersona = 65;

        if (edadPersona < 12) {
            System.out.println("Esta persona es NIÑO.");
        } else if ((edadPersona >= 12) && (edadPersona < 17)) {
            System.out.println("Esta persona es ADOLESCENTE.");
        } else if ((edadPersona >= 18) && (edadPersona < 64)) {
            System.out.println("Esta persona es ADULTO.");
        } else {
            System.out.println("Esta persona es ADULTO MAYOR.");
        }

        //7. Validar número par y múltiplo de 5:
        int numMulti = 15;

        if ((numMulti % 2 == 0) && (numMulti % 5 == 0)) {
            System.out.println("El número: " + numMulti + "es par y multiplo de 5.");
        } else System.out.println(numMulti + " NO es par y multiplo de 5.");

        //8. Contraseña segura:
        String clave = "DAW@2025";

        if (clave.length() >= 8 && clave.contains("@")) {
            System.out.println("'Contraseña segura!");
        } else {
            System.out.println("Contraseña insegura!");
        }

        //9. Evaluar dos números:
        int num1 = 111;
        int num2 = 13;

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Ambos números son positivos.");
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            System.out.println("Ambos números son negativos.");
        } else {
            System.out.println("Son diferentes.");
        }

        //10. Operador ternario:
        int mensajeEdad = 12;

        {
            String mensaje = (mensajeEdad >= 18) ? "Eres mayor de edad." : "Eres menor de edad.";
            System.out.println(mensaje);
        }
    }
}


