public class BusquedaSecuencial {
    private Estudiante[] estudiantes;

    public BusquedaSecuencial(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void setArreglo(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Estudiante[] getEstudiantes() {
        return this.estudiantes;
    }

    public int buscar(int valor) {
        for (int i = 0; i < this.estudiantes.length; i++) {
            if (this.estudiantes[i].getId() == valor) {
                return i;
            }
        }
        return -1;
    }
}
