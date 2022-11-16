public class metodos {
    public static void main(String[] args) {
        char[][] tablero = new char[10][10];
        char[][] tablero2 = new char[10][10];
        inicializarTablero(tablero, tablero2);


    }


    public static void inicializarTablero(char[][] tablero, char[][] tablero2) {
        //tablero1
        char mar = '~';


        for (int x = 0; x < tablero.length; x++) {

            for (int y = 0; y < tablero.length; y++) {
                tablero[x][y] = mar;


            }


        }


        char letras = 'A';

        for (int x = 0; x < tablero.length; x++) {
            System.out.print(letras + " ");
            for (int y = 0; y < tablero.length; y++) {


                System.out.print(tablero[x][y] + " ");

            }
            System.out.println();

            letras++;

        }
        System.out.print("");
        for (int y = 0; y < tablero.length; y++) {
            System.out.print(" " + y);
        }
        for (int x = 0; x < tablero2.length; x++) {
            System.out.print(letras + " " + letras);
            for (int y = 0; y < tablero2.length; y++) {


                System.out.print(tablero2[x][y] + " ");
        //hasta aqui tablero uno
        //tablero 2




            }


        }


        for (int x = 0; x < tablero2.length; x++) {
            System.out.print(letras + " ");
            for (int y = 0; y < tablero2.length; y++) {


                System.out.print(tablero2[x][y] + " ");

            }
            System.out.println();

            letras++;

        }
        System.out.print(" ");
        for (int y = 0; y < tablero2.length; y++) {
            System.out.print(" " + y);

        }

    }
}


