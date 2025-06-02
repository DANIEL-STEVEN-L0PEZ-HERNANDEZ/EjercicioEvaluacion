import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RegistroEmpleados {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("=== Registro de Empleados ===");

        while (continuar) {
            System.out.print("Ingrese ID del empleado: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            System.out.print("Ingrese nombre del empleado: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese apellido del empleado: ");
            String apellido = scanner.nextLine();

            System.out.print("Ingrese departamento del empleado: ");
            String departamento = scanner.nextLine();

            System.out.print("Ingrese salario del empleado: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // limpiar buffer

            Empleado empleado = new Empleado(id, nombre, apellido, departamento, salario);
            empleados.add(empleado);

            System.out.print("¿Desea agregar otro empleado? (s/n): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        // 3. Mostrar empleados usando Iterator
        System.out.println("\n=== Empleados Registrados ===");
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) {
            Empleado e = iterator.next();
            System.out.println(e);
        }
    }
}