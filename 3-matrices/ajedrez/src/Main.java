
public class Main {
    public static void main(String[] args) {

    }

    public static int[][] movimientoCaballo(int fila, int columna) {
        int[][] tablero = new int[8][8];
        int[][] movimientos = {
                {2, 1},
                {2, -1},
                {-2, 1},
                {-2, -1},
                {1, 2},
                {1, -2},
                {-1, 2},
                {-1, -2}
        };

        for (int[] movimiento : movimientos) {
            int nuevaFila = fila + movimiento[0];
            int nuevaColumna = columna + movimiento[1];

            if ((nuevaFila >= 0 && nuevaFila < 8) && (nuevaColumna >= 0 && nuevaColumna < 8)) {
                tablero[nuevaFila][nuevaColumna] = 1;
            }
        }
        return tablero;
    }

    public static int[][] movimientoAlfil(int fila, int columna) {
        int[][] tablero = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (fila )
            }

        }

        return tablero;
    }

    public static int[][] movimientoTorre(int fila, int columna) {
        int[][] tablero = new int[8][8];

        for (int i = 0; i < 8; i++) {
            if (i != fila) {
                tablero[i][columna] = 1;
            }
        }

        for (int j = 0; j < 8; j++) {
            if (j != columna) {
                tablero[fila][j] = 1;
            }
        }
            return tablero;
    }
}