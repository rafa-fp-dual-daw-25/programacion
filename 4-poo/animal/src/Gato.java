public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "Miau";
    }

    @Override
    public String comer() {
        return "Come pescado";
    }
}
