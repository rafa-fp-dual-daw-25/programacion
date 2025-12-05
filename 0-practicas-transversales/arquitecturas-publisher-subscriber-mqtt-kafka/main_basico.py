import paho.mqtt.client as mqtt

def on_connect(client, userdata, flags, rc):
    print(f"Conectado con código: {rc}")
    client.subscribe("arduino/temp")

def on_message(client, userdata, msg):
    print(f"Temperatura: {msg.payload.decode()}°")

client = mqtt.Client()
client.on_connect = on_connect
client.on_message = on_message

client.connect("test.mosquitto.org", 1883, 60)
client.loop_start()
input("Presiona Enter para salir...\n")
client.loop_stop()
client.disconnect()