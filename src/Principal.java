import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner entrada = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("""
                **********************************************
                Bienvenido/a al conversor de moneda =]
                1) USD <=> CLP
                2) ARS <=> USD
                3) USD <=> BRL
                4) COP <=> USD
                5) MXN <=> CLP
                6) EUR <=> USD
                7) GBP <=> EUR
                8) CHF <=> EUR
                9) Personalizado (por código de pais, ISO 4217)
                0) Salir
                **********************************************
                Elija una opción:
                """);

            opcion = entrada.nextInt();
            entrada.nextLine(); // limpiar buffer

            if (opcion == 0) {
                System.out.println("¡Hasta luego!");
                break;
            }

            String base = "", destino = "";

            switch (opcion) {
                case 1 -> { base = "USD"; destino = "CLP"; }
                case 2 -> { base = "ARS"; destino = "USD"; }
                case 3 -> { base = "USD"; destino = "BRL"; }
                case 4 -> { base = "COP"; destino = "USD"; }
                case 5 -> { base = "MXN"; destino = "CLP"; }
                case 6 -> { base = "EUR"; destino = "USD"; }
                case 7 -> { base = "GBP"; destino = "EUR"; }
                case 8 -> { base = "CHF"; destino = "EUR"; }
                case 9 -> {
                    menuPersonalizado(entrada, consulta);
                    continue;
                }
                default -> {
                    System.out.println("❌ Opción inválida.");
                    continue;
                }
            }

            // PREGUNTAR POR DIRECCIÓN
            System.out.printf("¿Desea convertir de %s a %s o de %s a %s?%n", base, destino, destino, base);
            System.out.println("1) " + base + " =>> " + destino);
            System.out.println("2) " + destino + " =>> " + base);
            int direccion = entrada.nextInt();
            entrada.nextLine();

            if (direccion == 2) {
                String temp = base;
                base = destino;
                destino = temp;
            }

            ejecutarConversion(entrada, consulta, base, destino);
        }
    }

    private static void menuPersonalizado(Scanner entrada, ConsultaMoneda consulta) throws IOException, InterruptedException {
        System.out.print("Ingrese código de moneda origen (ej: USD): ");
        String base = entrada.nextLine().toUpperCase();

        System.out.print("Ingrese código de moneda destino (ej: JPY): ");
        String destino = entrada.nextLine().toUpperCase();

        ejecutarConversion(entrada, consulta, base, destino);
    }

    private static void ejecutarConversion(Scanner entrada, ConsultaMoneda consulta, String base, String destino) throws IOException, InterruptedException {
        System.out.print("Ingrese el valor que desea convertir: ");
        double valor = entrada.nextDouble();

        double resultado = consulta.convertirMoneda(base, destino, valor);
        System.out.printf("El valor %.2f [%s] corresponde al valor final de =>>> %.2f [%s]%n", valor, base, resultado, destino);
        System.out.println("************************************************");
    }
}
