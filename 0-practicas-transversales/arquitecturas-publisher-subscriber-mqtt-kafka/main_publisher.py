import paho.mqtt.client as mqtt

def on_connect(client, userdata, flags, rc):
    print(f"Conectado con código: {rc}")
    client.publish("dawdual/nombre-apellido", userdata)  # accedes directamente al mensaje
    print(f"Mensaje '{userdata}' enviado a dawdual/nombre-apellido")

if __name__ == "__main__":
    #consulta con requests el json de tu pokemon
    nombre = "el nombre de tu pokemon"

    client = mqtt.Client(userdata=nombre)  # aquí pasas el valor
    client.on_connect = on_connect

    client.connect("test.mosquitto.org", 1883, 60)
    client.loop_start()
    input("Presiona Enter para salir...\n")
    client.loop_stop()
    client.disconnect()
