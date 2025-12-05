import requests


def get_data_parkings(url_parkings):
    print("PARKINGS DE VIGO:")
    print("==================")
    response = requests.get(url_parkings)
    parkings = response.json()
    for parking in parkings:
        porcentaje_libre = (parking['plazaslibres'] / parking['totalplazas']) * 100
        print(f"{parking['nombre']}")
        print(f"{parking['plazaslibres']}/{parking['totalplazas']} ({porcentaje_libre:.1f}% libre)")
        print(f"{parking['fechahora']}")
        print()


def get_traffic(url_traffic):
    try:
        # Obtener datos del tráfico
        response = requests.get(url_traffic)
        tramos = response.json()

        print("TRAMOS CON ATASCO:")
        print("==================")

        hay_atascos = False

        for tramo in tramos:
            nombre = tramo['nombre_tramo']
            tiempo = tramo['tiempo']
            actualizacion = tramo['actualizacion']

            if "min." in tiempo:
                # Extraer el número de minutos
                partes = tiempo.split()
                minutos = int(partes[0])

                # Si tiene más de 2 minutos, hay atasco
                if minutos > 2:
                    hay_atascos = True
                    print("ATASCO EN: " + nombre)
                    print("Tiempo: " + tiempo)
                    print("Actualizado: " + actualizacion)
                    print()

        # Si no hay atascos
        if not hay_atascos:
            print("No hay atascos significativos en este momento")
            print("Todo circula con normalidad")

    except Exception as e:
        print("Error al obtener el trafico: " + str(e))


def get_restaurants(url_restaurants):
    print("COCINA GALLEGA:")
    print("==================")

    response = requests.get(url_restaurants)
    restaurants = response.json()

    for restaurant in restaurants:

    print("MARISQUERÍAS:")
    print("==================")


if __name__ == "__main__":
    url_p = "https://datos.vigo.org/data/trafico/parkings-ocupacion.json"
    url_t = "https://datos.vigo.org/data/trafico/treal_congestion.json"
    url_r = "https://datos.vigo.org/data/turismo/poi-res-gallega-gl.json"

    get_data_parkings(url_p)
    print("=" * 50)
    get_traffic(url_t)
    print("=" * 50)
    get_restaurants(url_r)
