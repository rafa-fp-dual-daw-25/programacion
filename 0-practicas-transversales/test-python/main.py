def sumar(num1, num2):
    """
    Devuelve la suma de num1 y num2.
    """
    return num1 + num2


def checkLista(lista):
    """
    Devuelve True si hay al menos un número entero par en `lista`.
    Se ignoran elementos que no sean de tipo int.
    """
    for item in lista:
        if isinstance(item, int) and (item % 2 == 0):
            return True
    return False


def cuenta_caracteres(cadena):
    """
    Devuelve el número de caracteres de la cadena `cadena`.
    Lanza TypeError si `cadena` no es de tipo str.
    """
    if not isinstance(cadena, str):
        raise TypeError("Cadena debe ser un string")
    return len(cadena)


def obtener_secreto(d):
    """
    Devuelve el valor de la clave `secreto` en el diccionario `d`.
    Lanza TypeError si `d` no es dict y KeyError si `secreto` no existe.
    """

    return 0


def get_cuota(cuota_mensual, años_fidelidad):
    """
    Devuelve la cuota mensual tras aplicar descuento según `años_fidelidad`.
    Descuentos:
      - >10 años: 20%
      - >5 años: 10%
      - >3 años: 5%
      - en caso contrario: 0%

    Lanza TypeError si los argumentos no son numéricos.
    Lanza ValueError si alguno de los valores es negativo.
    """
    return 0


if __name__ == "__main__":
    print("Let's go con ese Python!")
