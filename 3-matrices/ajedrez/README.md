# Simulador de movimientos de piezas de ajedrez

Este proyecto implementa las funciones para calcular los movimientos posibles de tres piezas de ajedrez: **caballo**, **alfil** y **torre**. Cada función toma como entrada la posición inicial de la pieza en un tablero de ajedrez de 8x8 y devuelve un tablero con los movimientos posibles marcados. Los posibles movimientos serán marcados como 1 y los que no como 0. Recuerda que al crear una matrix int[8][8] todas las posiciones las inicializa a 0.

## Funciones a implementar

### 1. Movimiento del Caballo

El caballo se mueve en forma de "L", es decir, dos casillas en una dirección (horizontal o vertical) y una casilla en la dirección perpendicular.

### 2. Movimiento del Alfil

El alfil se mueve en diagonal en cualquier dirección hasta el borde del tablero.

### 3. Movimiento de la Torre

La torre se mueve en línea recta, horizontal o verticalmente, hasta el borde del tablero.


## Cómo Ejecutar

1. Haz un fork este repositorio.
2. Clona el repositorio de tu remoto en tu máquina local.
3. Ejecuta el archivo `MainTest.java` para que fallen los test.
4. Cuando acabes las 3 funciones, implementa los casos de mivimientos de la reina y rei. Crea sus test
5. Hazme un Pull Request para que pueda revisar tu código.
