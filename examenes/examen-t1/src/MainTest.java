import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    int[] array1 = {1,2,3,4,5};
    int[] array2 = {0};
    int[] array3 = {10,11,12,13,14,15};
    int[] array4 = {20,30,40,50,60};

    int[][] matrix1 = {{5,10,5}, {10,2,7}};
    int[][] matrix2 = {{3,6,9}, {12,3,7}, {21,2,1}};
    int[][] matrix4 = {{3,6,9,33}, {12,3,35,12}, {21,2,1,14}, {4,5,6,16}};
    int[][] matrix5 = {{3,6,9,33}, {12,3,35,12}, {21,36,1,14}, {4,5,6,16}};
    int[][] matrix6 = {{3,5}, {31,17}, {41,47}};
    int[][] matrix7 = {{3,11,61}, {31,97,59}, {41,47,23}};


    @Test
    void getPrice() {
        //1.25 punto: Devuelve el precio correcto
        assertEquals(192, Main.getPrice(4, 35));
        assertEquals(72, Main.getPrice(2, 50));
        assertEquals(360, Main.getPrice(6, 34));
        assertEquals(0, Main.getPrice(0, 34));
    }

    @Test
    void getTotalMul() {
        //1.25 punto: Devuelve la multiplicación correcta de los números del array
        assertEquals(120, Main.getTotalMul(array1));
        assertEquals(0, Main.getTotalMul(array2));
        assertEquals(3603600, Main.getTotalMul(array3));
        assertEquals(72000000, Main.getTotalMul(array4));
    }

    @Test
    void getEvenArray() {
        //1.75: Devuelve un array con solo los números pares
        int[] arraySol1 = {2,4};
        assertArrayEquals(arraySol1, Main.getEvenArray(array1));
        assertEquals(arraySol1.length, Main.getEvenArray(array1).length);
        int[] arraySol2 = {0};
        assertArrayEquals(arraySol2, Main.getEvenArray(array2));
        assertEquals(arraySol2.length, Main.getEvenArray(array2).length);
        int[] arraySol3 = {10,12,14};
        assertArrayEquals(arraySol3, Main.getEvenArray(array3));
        assertEquals(arraySol3.length, Main.getEvenArray(array3).length);
        int[] arraySol4 = {20,30,40,50,60};
        assertArrayEquals(arraySol4, Main.getEvenArray(array4));
        assertEquals(arraySol4.length, Main.getEvenArray(array4).length);
    }

    @Test
    void mergeArrays() {
        //1.75 puntos: Devuelve el array con todos los numeros correctamente unidos
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 0}, Main.mergeArrays(array1, array2));
        assertArrayEquals(new int[]{0,10,11,12,13,14,15}, Main.mergeArrays(array2, array3));
        assertArrayEquals(new int[]{0,1,2,3,4,5}, Main.mergeArrays(array2, array1));
        assertArrayEquals(new int[]{10,11,12,13,14,15,1,2,3,4,5}, Main.mergeArrays(array3, array1));
    }

    @Test
    void isPrimeMatrix() {
        //2 puntos: Devuelve si una matriz esta formada complemtamente por números primos
        assertFalse(Main.isPrimeMatrix(matrix1));
        assertFalse(Main.isPrimeMatrix(matrix2));
        assertTrue(Main.isPrimeMatrix(matrix6));
        assertTrue(Main.isPrimeMatrix(matrix7));

    }

    @Test
    void getMaxInvertedDiagonal() {
        //2 puntos: Devuelve el numero más alto de la diagonal secundaria
        assertEquals(21, Main.getMaxInvertedDiagonal(matrix2));
        assertEquals(35, Main.getMaxInvertedDiagonal(matrix4));
        assertEquals(36, Main.getMaxInvertedDiagonal(matrix5));
    }

}