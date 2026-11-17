public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota (String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    public void cumplirAnios () {
        edad = edad + 1;
    }

    public void mostrarFicha () {
        System.out.println("El nombre de la mascota es: " + nombre);
        System.out.println("La especie del animal es: " + especie);
        System.out.println("La edad del animal es: " + edad);
    }
}
