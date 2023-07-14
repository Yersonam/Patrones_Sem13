import Observer.*;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Subject subject = new Subject();
        SolPE nuevoSol = new SolPE(subject);
        PesoMX monedaMX = new PesoMX(subject);
        PesoARG monedaARG = new PesoARG(subject);
        RealBRA monedaBRA = new RealBRA(subject);
        List<Observador> observadores = subject.getObservadores();

        subject.agregar(nuevoSol);
        subject.agregar(monedaMX);
        subject.agregar(monedaARG);
        subject.agregar(monedaBRA);



        int opcion;

        do {
            String input = JOptionPane.showInputDialog(
                    "----- MENU -----\n" +
                            "1. Mostrar valor monetario actual 1\n" +
                            "2. Ingresar Valor monetario 2\n" +
                            "3. Agregar nueva moneda 3\n" +
                            "4. Eliminar moneda\n" +
                            "5. Salir\n" +
                            "Selecciona una opción:"
            );

            opcion = Integer.parseInt(input);

            switch (opcion) {
                case 1:
                    StringBuilder mensaje = new StringBuilder();
                    for (Observador observador : observadores) {
                        mensaje.append(observador.moneda()).append(": ").append(observador.actualizar()).append("\n");
                    }

                    System.out.println(mensaje);
                    break;

                case 2:
                    String cantidad = JOptionPane.showInputDialog("¿Cuánto desea cambiar?");
                    int amount = Integer.parseInt(cantidad);
                    double[] resultados = subject.obtenerResultados(amount);

                    StringBuilder mensaje2 = new StringBuilder();
                    for (double resultado : resultados) {
                        mensaje2.append(resultado).append("\n");
                    }

                    JOptionPane.showMessageDialog(null, mensaje2.toString());

                    break;

                case 3:

                    System.out.println("Agregar una moneda para el tipo de cambio: ");
                    String nuevaMoneda = scanner.nextLine();
                    double tipoCambio = Double.parseDouble(scanner.nextLine());
                    boolean monedaEncontrada= false;

                    // Verificar si ya existe una instancia de la misma clase con el mismo name
                    for (Observador observador : observadores) {
                        if (observador.moneda().equals(nuevaMoneda)) {
                            monedaEncontrada = true;
                            break;
                        }
                    }

                    if (!monedaEncontrada) {
                        // Crear una nueva instancia de la clase correspondiente

                        ObservadorConcreto observador = new ObservadorConcreto(nuevaMoneda, subject, tipoCambio);
                    /*

                        if (nuevaMoneda.equals("Sol")) {
                            observador = new SolPE(subject);
                        } else if (nuevaMoneda.equals("Peso Mexicano")) {
                            observador = new PesoMX(subject);
                        } else if (nuevaMoneda.equals("Peso Argentino")) {
                            observador = new PesoARG(subject);
                        } else if (nuevaMoneda.equals("Real")) {
                            observador = new RealBRA(subject);
                        }*/
                        // Añadir una nueva clase aquí si deseas agregar más tipos de moneda
                        if (observador != null) {

                            observadores.add(observador);
                            System.out.println("Si guarda");
                        }
                    } else {
                        System.out.println("Ya existe una moneda '" + nuevaMoneda + "' en la lista.");
                    }

                    break;
                case 4:
                    System.out.print("Ingresa una moneda a eliminar: ");
                    String monedaEliminar = scanner.nextLine();
                    monedaEncontrada = false;


                    for (int i = 0; i < observadores.size(); i++) {
                        Observador observador = observadores.get(i);
                        if (observador.moneda().equals(monedaEliminar)) {
                            observadores.remove(i);
                            monedaEncontrada = true;
                            break;
                        }
                    }

                    if (monedaEncontrada) {
                        System.out.println("Moneda eliminada exitosamente.");
                    } else {
                        System.out.println("No se encontró la moneda.");
                    }
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 5);


/*
        System.out.println("Si desea cambiar 10 d�lares obtendr� : ");
        double[] resultados =subject.setEstado(10);
        for (double resultado : resultados ) {
            System.out.println(resultado);
        }
*/
        System.out.println("-----------------");
        System.out.println("Si desea cambiar 100 d�lares obtendr� : ");




    }
}