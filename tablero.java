public class tablero {
    public static void main(String[] args) {
        char[][] tablero = new char[10][10];
        char[][] tablero2 = new char[10][10];
        System.out.println("tablero jugador" + "                 " + "Tablero disparos");
        rellenar(tablero, tablero2);
        mostrar(tablero, tablero2);
    }

    private static void mostrar(char[][] tablero, char[][] tablero2) {
        //Tablero uno
        char letras = 'A';


        for (int i = 0; i < tablero.length; i++) {
            System.out.print(letras + " ");
            for (int j = 0; j < tablero.length; j++) {


            }
            for (i = 0; i < tablero2.length; i++) {
                System.out.println(letras +" ");
                for (int j = 0; j < tablero2.length; j++) {
                    System.out.print(  tablero2[i][j]+ "" );

                }
            }

            System.out.println();
            letras++;

        }
        System.out.print("");
        for (int j = 0; j < tablero.length; j++) {
            System.out.print(" " + j);
            //hasta aqui tablero uno


        }
    }


        public static void rellenar ( char tablero[][], char tablero2[][]){

            char mar = '~';

            for (int x = 0; x < tablero.length; x++) {

                for (int y = 0; y < tablero.length; y++) {
                    tablero[x][y] = mar;


                }



            }
            for (int x = 0; x < tablero2.length; x++) {

                for (int y = 0; y < tablero2.length; y++) {
                    tablero2[x][y] = mar;


                }

            }
        }

    }





