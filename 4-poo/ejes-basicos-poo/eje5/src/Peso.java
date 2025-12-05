public class Peso {
    private double pesoKg;

    public Peso(double valor, String medida) {

        switch (medida) {
            case "K":
                this.pesoKg = valor;
                break;
            case "G":
                this.pesoKg = valor / 1000.0;
                break;
            case "Lb":
                this.pesoKg = valor * 0.453;
                break;
            case "Li":
                this.pesoKg = valor * 14.59;
                break;
            case "Oz":
                this.pesoKg = valor * 0.02835;
                break;
            case "P":
                this.pesoKg = valor * 0.00155;
                break;
            case "Q":
                this.pesoKg = valor * 43.3;
        }
    }

    public double getPeso(String medida) {

        switch (medida) {
            case "K":
                return pesoKg;
            case "G":
                return pesoKg * 1000.0;
            case "Lb":
                return pesoKg / 0.453;
            case "Li":
                return pesoKg / 14.59;
            case "Oz":
                return pesoKg / 0.02835;
            case "P":
                return pesoKg / 0.00155;
            case "Q":
                return pesoKg * 43.3;
            default:
                return 0.0;
        }
    }
}