//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class EjeBasico1 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

//1. Datos personales:
        String nombre = "Lorena";
        int edad = 18;
        System.out.println("Mi nombre es: " + nombre + ".");
        System.out.println("Mi edad es: " + edad + ".");

// 2. Constante matemática:
        final double PI = 3.1416;
        double radio = 6;
        double areaCirculo = PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + areaCirculo);

// 3. Número positivo:
        int numPos = 10;
        if (numPos >= 0) {
            System.out.println("Es positivo!");
        }

// 4. Número positivo o negativo:
        int numPos2 = 111;
        if (numPos2 >= 0) {
            System.out.println("Es positivo!");
        } else {
            System.out.println("Es negativo");
        }

// 5. Clasificación de notas:
        int nota = 50;
        if (nota >= 90) {
            System.out.println("Tu nota es sobresaliente!");
        } else if (nota >= 70 && nota < 90) {
            System.out.println("Tu estas aprobado!");
        } else {
            System.out.println("Tu estas reprobado!");
        }

// 6. Comparación de números:
        int num1 = 5;
        int num2 = 7;
        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor ");
        } else {
            System.out.println("El número " + num2 + " es mayor ");
        }

// 7. Número par o impar:
        int parImpar = 13;
        if (parImpar % 2 == 0) {
            System.out.println("El numero " + parImpar + " es par.");
        } else {
            System.out.println("El numero " + parImpar + " es impar.");
        }

// 8. Mayoría de edad:
        int age = 19;
        if (age >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

// 9. Días de la semana:
        int diaSemana = 3;
        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día no válido");
                break;
        }

//10. Aplicar descuento:

        double precio = 1500.0;
        boolean descuento = true;
        double precioFinal;

        if (descuento) {
            precioFinal = precio * 0.9;
            System.out.println("Tiene descuento de 10%");
        } else {
            precioFinal = precio;
            System.out.println("No tiene descuento");
        }

        System.out.println("Precio original: " + precio + "€");
        System.out.println("Precio final: " + precioFinal + "€");
    }
}