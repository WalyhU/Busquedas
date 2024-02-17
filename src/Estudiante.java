public class Estudiante implements Comparable<Estudiante> {
    private String nombre;
    private Integer id;

    public Estudiante(String nombre, Integer id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public int compareTo(Estudiante other) {
        return this.id.compareTo(other.id);
    }
}
