import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
                new Estudiante("Juan", 123),
                new Estudiante("Ana", 456),
                new Estudiante("Carlos", 789),
                new Estudiante("María", 234),
                new Estudiante("Pedro", 567)
        };
        Arrays.sort(estudiantes);

        BusquedaSecuencial busquedaSecuencial = new BusquedaSecuencial(estudiantes);
        BusquedaBinaria busquedaBinaria = new BusquedaBinaria(estudiantes);

        int idABuscar = 234;
        int indiceSecuencial = busquedaSecuencial.buscar(idABuscar);
        int indiceBinario = busquedaBinaria.buscar(idABuscar);

        System.out.println("Búsqueda secuencial:");
        if (indiceSecuencial != -1) {
            System.out.println("El estudiante con id " + idABuscar + " se encuentra en el índice " + indiceSecuencial);
        } else {
            System.out.println("El estudiante con id " + idABuscar + " no se encuentra en el arreglo");
        }

        System.out.println("\nBúsqueda binaria:");
        if (indiceBinario != -1) {
            System.out.println("El estudiante con id " + idABuscar + " se encuentra en el índice " + indiceBinario);
        } else {
            System.out.println("El estudiante con id " + idABuscar + " no se encuentra en el arreglo");
        }

        System.out.println("\nEstudiantes ordenados por id:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre() + " - " + estudiante.getId());
        }
    }
}