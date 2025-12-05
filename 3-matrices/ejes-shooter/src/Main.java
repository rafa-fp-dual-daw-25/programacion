public class Main {
    public static void main(String[] args) {

    }

    public static int getDamage(int speed, int armor, int distance) {

        int damage = 0;

        if (distance <= 3) {
            damage = speed / 10;
        } else if (speed > 500) {
            if (distance < 20) {
                damage = speed / 10;
            } else {
                damage = (speed / 10) - armor;
            }
        } else {
            damage = (speed / 10) - armor - (distance / 10);
        }

        return Math.max(damage, 0);
    }

    public static boolean isDeadByBodyShot(int life, int damage) {

        return life <= damage;
    }

    public static int getNumObjects(boolean[][] map) {

        int count = 0;

        for (boolean[] booleans : map) {
            for (int j = 0; j < map[0].length; j++) {
                if (booleans[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isHit(boolean[][] screen, int y, int x) {
        return screen[y][x];

    }

    public static boolean isHeadShot(boolean[][] screen, int y, int x) {
        // Buscar la primera fila donde aparece el enemigo
        for (int i = 0; i < screen.length; i++) {
            for (int j = 0; j < screen[i].length; j++) {
                if (screen[i][j]) {
                    // Encontramos el inicio del enemigo
                    int startX = j;
                    int width = 0;

                    // Calcular ancho del enemigo en esta fila
                    while (j < screen[i].length && screen[i][j]) {
                        width++;
                        j++;
                    }

                    // La cabeza está en la fila i, columna central
                    int headX = startX + width / 2;
                    return (y == i && x == headX);
                }
            }
        }
        return false; // No hay enemigo
    }

    /*SOLUCION SERGIO

    public static boolean isHeadShot(boolean[][] screen, int y, int x) {
        if (screen[y][x - 1] && screen[y][x + 1]) {
            for (int i = y; i < y + 4; i++) {
                if (!screen[i][x])
                    return false;
            }
        } else
            return false;
        return true;
    }*/

    public static int[] getEnemyPosition(boolean[][] screen) {
        int centerX = 0;
        int centerY = 0;

        for (int i = 0; i < screen.length; i++) {
            for (int j = 0; j < screen[i].length; j++) {
                if (screen[i][j]) {
                    centerY = i + 2;
                    centerX = j + 1;
                    return new int[]{centerY, centerX};
                }
            }
        }
        return new int[]{0, 0};
    }
}