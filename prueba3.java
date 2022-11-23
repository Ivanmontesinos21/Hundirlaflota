public class prueba3 {
    public static void main(String[] args) {
        char[][] tablerojugador = new char[10][10];
        char[][] tableroDisparos = new char[10][10];
        char[][] tableroPc = new char[10][10];
        char[][] tableroDisparosPc = new char[10][10];
        rellenar(tablerojugador);
        mostrarJugador(tablerojugador,tableroDisparos);
    }

    public static void rellenar(char[][] tablerojugador) {

        for (int i = 0; i < tablerojugador.length; i++) {
            for (int j = 0; j < tablerojugador[i].length; j++) {
                tablerojugador[i][j] = '~';
            }
        }

    }

    public static void mostrarJugador(char[][] tablerojugador, char[][] tableroDisparos) {

        char letras = 'A';
        //mostrar tablero
        for (int k = 0; k < tablerojugador.length; k++) {
            System.out.print(letras);
            for (int j = 0; j < tablerojugador.length; j++) {
                System.out.print(tablerojugador[k][j] + " ");
            }
            System.out.print("\t\t\t");
            System.out.print(letras);
            for (int j = 0; j < tablerojugador.length; j++) {
                System.out.print(tablerojugador[k][j] + " ");
            }
            System.out.println("");
            letras++;
        }
        //poner numeros
        System.out.print(" ");
        for (int j = 0; j < tablerojugador.length; j++) {
            System.out.print(" " + j);
        }
        System.out.print("           ");
        for (int j = 0; j < tablerojugador.length; j++) {
            System.out.print(" " + j);
        }


    }

    }



