public class prueba2 {
    public static void main(String[] args) {
        char[][] tableroPc = new char[10][10];
        char[][] tableroDisparosPc = new char[10][10];
        rellenarpc(tableroPc);
        mostrarPc(tableroPc);
    }
    public static void rellenarpc(char tableroPc[][]){
        for (int i = 0; i < tableroPc.length; i++) {
            for (int j = 0; j < tableroPc.length; i++)
                tableroPc[i][j] = '~';
        }
    }
    public static void mostrarPc(char tableroPc[][] ){
        for (int i = 0; i < tableroPc.length; i++)
            for (int j = 0; j < tableroPc[i].length; j++)
                System.out.print(tableroPc[i][j] );





            }

    }

