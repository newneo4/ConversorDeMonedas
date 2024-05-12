import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String target = "";
        String origin = "";
        double mount = 0.0;
        int input = 0;
        Scanner opcion = new Scanner(System.in);

        String menu = "*******************\n" +
                "Sea bienvenido/a al conversor de Monedas \n" +
                "1) Dólar => Peso argentino\n" +
                "2) Peso argentino => Dólar\n" +
                "3) Dólar => Boliviano\n" +
                "4) Boliviano => Dólar\n" +
                "5) Dólar => Real brasileño\n" +
                "6) Real brasileño => Dólar\n" +
                "7) Dólar => Peso chileno\n" +
                "8) Peso chileno => Dólar\n" +
                "9) Dólar => Peso colombiano\n" +
                "10) Peso colombiano => Dólar\n" +
                "11) Salir\n";

        while(true) {
            System.out.println(menu);
            input = Integer.parseInt(opcion.nextLine());

            if(input == 11) {
                System.out.println("Saliendo...");
                break;
            }

            switch (input) {
                case 1:
                    target = "ARS";
                    origin = "USD";
                    break;
                case 2:
                    target = "USD";
                    origin = "ARS";
                    break;
                case 3:
                    target = "BOB";
                    origin = "USD";
                    break;
                case 4:
                    target = "USD";
                    origin = "BOB";
                    break;
                case 5:
                    target = "BRL";
                    origin = "USD";
                    break;
                case 6:
                    target = "USD";
                    origin = "BRL";
                    break;
                case 7:
                    target = "CLP";
                    origin = "USD";
                    break;
                case 8:
                    target = "USD";
                    origin = "CLP";
                    break;
                case 9:
                    target = "COP";
                    origin = "USD";
                    break;
                case 10:
                    target = "USD";
                    origin = "COP";
                    break;
                default:
                    System.out.println("Opción no válida, por favor ingrese una opción del 1 al 11.");
                    continue;
            }

            System.out.print("Ingrese la cantidad a convertir: ");
            mount = Double.parseDouble(opcion.nextLine());

            double conversion = ConversionMoneda.conversion(target, origin, mount);
            System.out.println("Valor de conversión de: " + mount + " " + origin + " es : " + conversion + " " + target
            );
        }
    }
}
