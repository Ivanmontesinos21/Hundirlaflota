public class tablero {
    public static void main(String[] args) {
        char[][] tableros = new char[10][10];
        rellenar(tableros);
        mostrar(tableros);
    }

    private static void mostrar(char[][] tableros) {
        //Tablero uno
    char letras='A';
     char numero='1';

        for (int x = 0; x < tableros.length; x++) {

            System.out.print(letras + " ");

            for (int y = 0; y < tableros.length; y++) {



                System.out.print( tableros[x][y] + " ");


            }

            System.out.println();
            letras++;
            }
        System.out.print("");
        for (int y = 0; y < tableros.length; y++) {
            System.out.print( " " + y );
            //hasta aqui tablero uno

        }

        }




    public static void rellenar(char tableros[][]) {

        char mar = '~';

        for (int x = 0; x < tableros.length; x++) {

            for (int y = 0; y < tableros.length; y++) {
                tableros[x][y] = mar;


            }


        }



        }

    }




