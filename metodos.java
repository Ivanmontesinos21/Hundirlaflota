public class metodos {
    public static void main(String[] args) {
        char[][] tablero = new char[10][10];
        char[][] tableroDisparos = new char[10][10];
        inicializarTablero(tablero);


    }


    public static void inicializarTablero(char[][] tablero) {
        //tablero1
        //Poner el agua

        for (int x = 0; x < tablero.length; x++) {
            for (int y = 0; y < tablero.length; y++) {
                tablero[x][y] = '~';
            }
        }
        for (int x = 0; x < tablero.length; x++) {
            for (int y = 0; y < tablero.length; y++) {
                tablero[x][y] = '~';

                for (int j = 0; j < tablero.length; j++) {

                    System.out.print( tablero[x][y] + "");

                }

                char letras = 'A';
                for (int i = 0; i < tablero.length; i++) {
                    System.out.print(letras + " ");
                    for (int j = 0; j < tablero.length; j++) {
                        System.out.print(tablero[i][j] + " ");
                    }
                    System.out.println("");
                    letras++;
                }
                //Poner numeros.
                System.out.print(" ");
                for (int j = 0; j < tablero.length; j++) {
                    System.out.print(" " + j);

                }
            }

        }

    }
}

   // public static void visualizarTablero(char[][] tablero,char[][] tableroDisparos){}
    // Metodo que implementa el disparo del jugador

   // public static boolean disparoJugador (char[][] tableroDisparosJugador, char[][] tableroPC){}






    //public static boolean disparoPC(char[][] tableroDisparosPC, char[][] tableroJugador){}




//Este metodo borra la terminal

  //  public static void borrarPantalla(){}


// Este metodo suma todos los valores de un vector

   // public static int sumaCeldas(int[] unVector){}


//Este metodo coloca los barcos pasados como vector dentro del tablero del Jugador

    //public static void colocarBarcosJugador(char[][] tablero, int[] barcos){}


//Este metodo coloca los barcos pasados como vector dentro del tablero del PC

   // public static void colocarBarcosPC(char[][] tablero,int[] barcos){}

//Este metodo comprueba si hay algun barco en la zona del barco a colocar

   // public static boolean hayColision(char[][] tablero, int longitudBarco, int fila, int columna, int orientacion){}

//Este metodo comprueba si el barco está en los límites del tablero

    //public static boolean cabeBarco(char[][] tablero, int longitudBarco, int fila, int columna, int orientacion){}


//Este metodo coloca un barco en una posicion si este cabe en tablero y no coincide ninguna posicion con otro barco en la zona

   // public static boolean colocarBarco(char[][] tablero, int longitudBarco, int fila, int columna, int orientacion,boolean jugador){}




