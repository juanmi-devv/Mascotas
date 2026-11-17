public class Main {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Luna", "Perro", 4);
        Mascota m2 = new Mascota("Milo", "Gato", 2);
        m1.mostrarFicha();
        m1.cumplirAnios();
        m1.mostrarFicha();
        m2.mostrarFicha();
    }
}