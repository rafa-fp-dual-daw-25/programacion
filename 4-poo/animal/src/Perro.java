public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "Guau";
    }

    @Override
    public String comer() {
        return "Come croquetas";
    }
}
