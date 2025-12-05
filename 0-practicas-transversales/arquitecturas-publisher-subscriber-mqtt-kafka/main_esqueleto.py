import paho.mqtt.client as mqtt
import time

BROKER = ""
PORT = 1883
TOPIC_HUM = ""
TOPIC_TEMP = ""
TOPIC_LED = ""

def on_connect(client, userdata, flags, rc):
    print(f"Conectado con código: {rc}")

def on_message(client, userdata, msg):
    global mensaje_recibido
    mensaje_recibido = msg.payload.decode()

def subscribe(client, topic, timeout=5):
  
    global mensaje_recibido
    mensaje_recibido = None
    client.subscribe("AÑADE ALGO")
    client.loop_start()
    inicio = time.time()
    while mensaje_recibido is None and time.time() - inicio < timeout:
        time.sleep(0.1)
    client.loop_stop()
    client.unsubscribe(topic)
    return mensaje_recibido

def publish(client, color):
    client.publish("AÑADE LOS DATOS")
    print(f"Color del LED cambiado a: {color}")

def menu_arduino():
    #client = mqtt.Client()
    #client.on_connect = on_connect
    #client.on_message = on_message
    #client.connect(BROKER, PORT, 60)

    while True:
        print("\n--- MENÚ Arduino ---")
        print("1. Ver humedad")
        print("2. Ver temperatura")
        print("3. Cambiar color del LED")
        print("4. Salir")
        opcion = input("Selecciona una opción: ")

        if opcion == "1":
            print("TODO")
          
        elif opcion == "2":
           print("TODO")
           
        elif opcion == "3":
            color = input("Introduce color (rojo, verde, azul, etc.): ")
            
        elif opcion == "4":
            print("Desconectando...")
            #client.disconnect()
            break
        else:
            print("Opción no válida.")

if __name__ == "__main__":
    menu_arduino()