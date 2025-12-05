
# 1. Variables en Python
# a = int(input("Introduce un numero: "))
# b = int(input("Introduce otro numero: "))
# print("La suma es:", a + b)


# 2. Condicionales
# edad = 18
# if edad >= 18:
#     print("Eres mayor de edad")
# else:
#     print("Eres menor de edad")


# nota = float(input("Introduce tu nota: "))
# if nota >= 5:
#     print("Aprobado")
# else:
#     print("Suspenso")


# 3. Bucles
# for i in range(5):
#     print(i) # Imprime del 0 al 4
#
# contador = 0
# while contador < 5:
#     print(contador)
#     contador += 1
#
# for i in range(1, 21):
#     if i % 2 == 0:
#         print(i)


# 4. Listas
# frutas = ["manzana", "banana", "pera"]
# frutas.append("naranja") # Añade un elemento
# print(frutas[0]) # Accede al primer elemento
# print(len(frutas)) # Longitud de la lista
#
# nombres = []
# for i in range(3):
#     nombre = input("Introduce un nombre: ")
#     nombres.append(nombre)
# print("Lista de nombres: ", nombres)


# 5. Diccionarios
persona = {"nombre": "Ana", "edad": 25, "ciudad": "Madrid"}
print(persona["nombre"]) # Accede por clave
persona["edad"] = 26 # Modifica un valor
persona["profesion"] = "Ingeniera" # Añade una nueva clave

alumno = {"nombre":"","edad":"","curso": ""}
for i in range(3):
    alumno["nombre"] = input("Ingresa tu nombre: ")
    alumno["edad"] = input("Ingresa tu edad: ")
    alumno["curso"] = input("Ingresa tu curso: ")
    print(f"{alumno['nombre']} tiene {alumno['edad']} años y cursa {alumno['curso']}")