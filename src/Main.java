import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes deseas ingresar? ");
        int numEstudiantes = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea

        // Variable para almacenar la tabla de estudiantes
        StringBuilder tablaEstudiantes = new StringBuilder();
        tablaEstudiantes.append("| Universidad | Código | Dirección | Teléfono | Nombre | Apellido | Carrera | Semestre | Código Banner |\n");
        tablaEstudiantes.append("----------------------------------------------------------------------------------------------\n");

        for (int i = 1; i <= numEstudiantes; i++) {
            System.out.println("Ingresando datos del estudiante " + i + ":");

            // Crear objetos de la clase Universidad y Estudiante
            Universidad universidad = new Universidad();
            Estudiante estudiante = new Estudiante();

            // Ingresar datos para Universidad
            System.out.print("Nombre de la Universidad: ");
            universidad.setNombre(sc.nextLine());

            System.out.print("Código de la Universidad: ");
            universidad.setCodigo(sc.nextLine());

            System.out.print("Dirección de la Universidad: ");
            universidad.setDireccion(sc.nextLine());

            System.out.print("Teléfono de la Universidad: ");
            universidad.setTelefono(sc.nextLine());

            // Ingresar datos para Estudiante
            System.out.print("Nombre del estudiante: ");
            estudiante.setNombre(sc.nextLine());

            System.out.print("Apellido del estudiante: ");
            estudiante.setApellido(sc.nextLine());

            System.out.print("Carrera del estudiante: ");
            estudiante.setCarrera(sc.nextLine());

            System.out.print("Semestre del estudiante: ");
            estudiante.setSemestre(sc.nextLine());

            System.out.print("Código Banner del estudiante: ");
            estudiante.setBanner(sc.nextLine());

            // Agregar datos a la tabla
            tablaEstudiantes.append(universidad.mostrarInfo() + " " + estudiante.imprimir() + "\n");
        }

        // Mostrar la tabla completa al finalizar
        System.out.println("\nTabla de estudiantes:");
        System.out.println(tablaEstudiantes.toString());
    }
}