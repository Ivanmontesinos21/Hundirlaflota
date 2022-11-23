public class prueba {
    public static void main(String[] args) {
        char[][] tablerojugador = new char[10][10];
        char[][] tableroDisparos = new char[10][10];
        char[][] tableroPc = new char[10][10];
        char[][] tableroDisparosPc = new char[10][10];
        rellenar(tablerojugador,tableroDisparosPc);
        mostrarJugador(tablerojugador,tableroDisparos);
        rellenarpc(tableroPc,tableroDisparosPc);
        mostrarPc(tableroPc,tableroDisparosPc);


    }

    public static void rellenar(char[][] tablerojugador, char[][] tableroDisparos ) {

        for (int i = 0; i < tablerojugador.length; i++) {
            System.out.print("");
            for (int j = 0; j < tablerojugador[i].length; j++) {
                tablerojugador[i][j] = '~';
            }
        }
        for (int i = 0; i < tableroDisparos.length; i++) {
            System.out.print(" ");
            for (int j = 0; j < tableroDisparos[i].length; j++) {
                tableroDisparos[i][j] = '~';
            }
        }
    }


            public static void mostrarJugador ( char[][] tablerojugador, char[][] tableroDisparos){

                for (int i = 0; i < tablerojugador.length; i++) {
                    for (int j = 0; j < tablerojugador.length; j++) {
                        System.out.print(tablerojugador[i][j] + " ");


                    }
                }
                for (int i = 0; i < tableroDisparos.length; i++) {

                    for (int j = 0; j < tableroDisparos.length; j++) {
                        System.out.print(tableroDisparos[i][j] + " ");
                }

            }





                    }





       public static void rellenarpc ( char tableroPc[][], char tableroDisparosPc[][]){
            for (int i = 0; i < tableroPc.length; i++) {
                for (int j = 0; j < tableroPc.length; i++)
                    tableroPc[i][j] = '~';
            }
           for (int i = 0; i < tableroDisparosPc.length; i++) {
               System.out.println();
               for (int j = 0; j < tableroDisparosPc[i].length; j++) {
                   tableroDisparosPc[i][j] = '~';
               }
           }

        }



        public static void mostrarPc ( char tableroPc[][], char tableroDisparosPc[][]){
            for (int i = 0; i < tableroPc.length; i++)
                for (int j = 0; j < tableroPc[i].length; j++)
                    System.out.println(tableroPc[i][j] +"");

        }

    }



