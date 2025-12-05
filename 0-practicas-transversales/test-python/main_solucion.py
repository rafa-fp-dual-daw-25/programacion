
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
    for elem in lista:
        if isinstance(elem, int) and elem % 2 == 0:
            return True
    return False


def cuenta_caracteres(cadena):
    """
    Devuelve el número de caracteres de la cadena `cadena`.
    Lanza TypeError si `cadena` no es de tipo str.
    """
    if not isinstance(cadena, str):
        raise TypeError("`cadena` debe ser de tipo str")
    return len(cadena)

def obtener_secreto(d):
    """
    Devuelve el valor de la clave `secreto` en el diccionario `d`.
    Lanza TypeError si `d` no es dict y KeyError si `secreto` no existe.
    """
    if not isinstance(d, dict):
        raise TypeError("`d` debe ser un diccionario")
    try:
        return d['secreto']
    except KeyError:
        raise KeyError("La clave `secreto` no está presente en el diccionario")

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
    if not isinstance(cuota_mensual, (int, float)):
        raise TypeError("`cuota_mensual` debe ser numérico")
    if not isinstance(años_fidelidad, (int, float)):
        raise TypeError("`años_fidelidad` debe ser numérico")
    if cuota_mensual < 0:
        raise ValueError("`cuota_mensual` no puede ser negativo")
    if años_fidelidad < 0:
        raise ValueError("`años_fidelidad` no puede ser negativo")

    if años_fidelidad > 10:
        descuento = 0.20
    elif años_fidelidad > 5:
        descuento = 0.10
    elif años_fidelidad > 3:
        descuento = 0.05
    else:
        descuento = 0.0

    return cuota_mensual * (1 - descuento)

if __name__ == "__main__":
    print(cuenta_caracteres("hola"))       # 4           # 0
    print(cuenta_caracteres("áéíóúñ"))     # 6
    print(checkLista([1, 3, 5]))      # False
    print(checkLista([1, 4, 5]))      # True
