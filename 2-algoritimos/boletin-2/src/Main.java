public class Main {
    public static void main(String[] args) {

        //1
        int num1 = 50, num2 = 30, num3 = 10;
        System.out.println("LA SUMA ES: " + (suma(num1, num2, num3)));

        //11
        conversionTiempo(5405);

        //12
        int[] billetes = {500, 200, 100, 50, 20, 10, 5};
        getBilletes(802, billetes);




    }

    public static int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void conversionTiempo (int tiempoTotal) {

        int h = tiempoTotal / 3600;
        int m = (tiempoTotal % 3600)/60;
        int s = tiempoTotal % 60;

        System.out.println(tiempoTotal + " segundos, es lo mismo que " + h + ":" + m + ":" + s);
    }

    public static void getBilletes(int euros, int[] billetes){
        System.out.println("Billetes = " + euros );
        int resto = euros;

        for(int i = 0; i < billetes.length; i++){
            if(resto >= billetes[i]) {
                System.out.println(resto / billetes[i] + " Billete de " + billetes[i]);
                resto = resto % billetes[i];
            }
        }
        System.out.println("Resto: " + resto);
    }

}