public class tableros {
    public static void main(String[] args) {
        char[][] tablerojugador = new char[10][10];
        char[][] tableroDisparos = new char[10][10];
        char[][] tableroPc = new char[10][10];
        char[][] tableroDisparosPc = new char[10][10];

        rellenar(tablerojugador,tableroDisparos);
        mostrarJugador(tablerojugador,tableroDisparos);
        rellenarpc(tableroPc,tableroDisparosPc);
        mostrarPc(tableroPc,tableroDisparosPc);

    }
    public static void rellenar(char[][] tablerojugador,  char[][] tableroDisparos) {
        System.out.print("\t"+"Tablero jugador"+  "\t\t\t\t\t" +"Tablero Disparos");
        System.out.println("");
        System.out.println("");

        for (int i = 0; i < tablerojugador.length; i++) {
            for (int j = 0; j < tablerojugador[i].length; j++) {
                tablerojugador[i][j] = '~';
            }
            for (int l = 0; l < 9; l++) {
                for (int k = 0; k < tableroDisparos.length; k++) {
                    for (int j = 0; j < tableroDisparos[i].length; j++) {
                        tableroDisparos[k][j] = '~';
                    }

                }
            }
        }
    }

    public static void mostrarJugador ( char[][] tablerojugador, char[][] tableroDisparos){

        char letras = 'A';
        //mostrar tableros jugador

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
    public static void rellenarpc ( char tableroPc[][], char tableroDisparosPc[][]){
        System.out.println("");
        System.out.println("");
        System.out.print("\t " + "Tablero Pc"+  "\t\t\t\t\t" +"Tablero DisparosPc");
        for (int i = 0; i < tableroPc.length; i++) {
            for (int j = 0; j < tableroPc.length; j++)
                tableroPc[i][j] = '~';
        }
        for (int i = 0; i < 9; i++) {


            for (int j = 0; j < tableroDisparosPc.length; j++) {
                tableroDisparosPc[i][j] = '~';
            }
        }

    }

    public static void mostrarPc ( char tableroPc[][], char tableroDisparosPc[][]){
        char letras='A';
        System.out.println("");
        for (int k = 0; k < tableroPc.length; k++) {
            System.out.print(letras);
            for (int j = 0; j < tableroPc.length; j++) {
                System.out.print(tableroPc[k][j] + " ");
            }
            System.out.print("\t\t\t");
            System.out.print(letras);
            for (int j = 0; j < tableroDisparosPc.length; j++) {
                System.out.print(tableroDisparosPc[k][j] + " ");
            }

            System.out.println("");
            letras++;
        }
        //poner numeros
        System.out.print(" ");
        for (int j = 0; j < tableroPc.length; j++) {
            System.out.print(" " + j);
        }
        System.out.print("           ");
        for (int j = 0; j < tableroDisparosPc.length; j++) {
            System.out.print(" " + j);
        }
    }
}
