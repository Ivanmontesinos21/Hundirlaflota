import java.util.Scanner;

public class coordenadas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[][] tablero = new char[10][10];
        String coordenada;
        coordenada=sc.next();



    }
    public  static void pedircordenada(char[][] tablero, String coordenada, int[] barcos) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < barcos.length; i++) {
            System.out.println("Indicame las coordenadas del barco " + barcos[i] + ":");
            coordenada = sc.next();
        }

        }

    }

