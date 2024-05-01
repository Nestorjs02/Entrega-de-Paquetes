import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al sistema de gestión de envíos de paquetería!");

        // Mostrar instrucciones de uso
        System.out.println("Por favor, siga las instrucciones para utilizar el sistema:");
        System.out.println("1. Ingrese los detalles del paquete cuando se le solicite.");
        System.out.println("2. Ingrese el peso del paquete en kilogramos.");
        System.out.println("3. Ingrese las dimensiones del paquete en centímetros (altura, ancho, largo).");
        System.out.println("4. Ingrese el tipo de servicio (estándar, urgente, frágil).");

        // Obtener información del paquete desde la consola
        System.out.println("\nIngrese el peso del paquete (en kg):");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese la altura del paquete (en cm):");
        double altura = scanner.nextDouble();
        System.out.println("Ingrese el ancho del paquete (en cm):");
        double ancho = scanner.nextDouble();
        System.out.println("Ingrese el largo del paquete (en cm):");
        double largo = scanner.nextDouble();
        System.out.println("Ingrese el tipo de servicio (estándar, urgente, frágil):");
        String tipoServicio = scanner.next();

        // Crear instancia de la clase apropiada de Paquete (PaqueteEstandar, PaqueteUrgente o PaqueteFragil)
        Paquete paquete;
        switch (tipoServicio) {
            case "estandar":
                paquete = new PaqueteEstandar(peso, altura, ancho, largo, tipoServicio);
                break;
            case "urgente":
                paquete = new PaqueteUrgente(peso, altura, ancho, largo, tipoServicio);
                break;
            case "fragil":
                paquete = new PaqueteFragil(peso, altura, ancho, largo, tipoServicio);
                break;
            default:
                System.out.println("Tipo de servicio no válido");
                scanner.close();
                return;
        }

        // Crear instancia de la clase GestorEnvios y se inicializan las tarifas y costos adicionales
        GestorEnvios gestorEnvios = new GestorEnvios(10.0, 15.0, 20.0, 0.5, 0.2);

        // Calcular y mostrar el costo de envío
        double costoEnvio = gestorEnvios.calcularCosto(paquete);
        System.out.println("\nEl costo de envío es: $" + costoEnvio);

        scanner.close();
    }
}