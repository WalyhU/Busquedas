public class BusquedaBinaria {
    private Estudiante[] estudiantes;

    public BusquedaBinaria(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void setArreglo(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Estudiante[] getEstudiantes() {
        return this.estudiantes;
    }

    public int buscar(int valor) {
        int inicio = 0;
        int fin = this.estudiantes.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (this.estudiantes[medio].getId() == valor) {
                return medio;
            } else if (this.estudiantes[medio].getId() < valor) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }
}
