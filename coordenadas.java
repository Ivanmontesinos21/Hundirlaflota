import java.util.Scanner;

public class coordenadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        getcoordenada();


    }

    public static void getcoordenada() {
        Scanner sc = new Scanner(System.in);
        String coordenadas;
        boolean correcto = false;
        boolean funcionabien = false;

        do {
            do {
                System.out.println("\n" + "introduce una cordenada");
                coordenadas = sc.nextLine();

                if (coordenadas.length() == 2)
                    correcto = true;
                else
                    System.out.println("No se han usados los caracteres correctos");
            } while (!correcto);

            if (coordenadas.toUpperCase().charAt(0) >= 'A' && coordenadas.toUpperCase().charAt(0) <= 'J') {
                funcionabien = true;
            } else {
                System.out.println("no es letra");
            }

            if (funcionabien) {
                if (Integer.parseInt(String.valueOf(coordenadas.charAt(1))) >= 0 && Integer.parseInt(String.valueOf(coordenadas.charAt(1))) <= 9) {
                    funcionabien = true;
                }
            }


        } while (!funcionabien);
    }
}

