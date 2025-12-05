# Proyecto de Iniciación en Java

## 🧱 1. Concepto de Clase y Objeto

Una **clase** es un plano o plantilla a partir de la cual se crean objetos. Un **objeto** es una instancia concreta de una clase, con sus propios valores.

---

## 🧬 2. Atributos y Métodos

Los **atributos** representan las características de un objeto.
Los **métodos** representan las acciones que un objeto puede realizar.

---

## 🔐 3. Encapsulación

La **encapsulación** consiste en proteger los atributos mediante visibilidad privada (`private`) y permitir el acceso mediante métodos públicos **getters** y **setters**.

---

## ➕ 4. Extensión

La **extensión**, en este proyecto, se entiende como **añadir nuevos métodos a una clase sin modificar los anteriores**.

---

## 🔗 5. Asociación entre Clases

Una **asociación** implica que una clase utiliza a otra. Ejemplo: la clase **Coche** contiene un objeto de tipo **Motor**.

---

# 🚀 ¿Qué tienes que hacer?

### 1️⃣ Clona el repositorio.

---

## 🔧 Clase Motor

### 2️⃣ El motor deberá tener 2 atributos privados con getters y setters:

* `potencia`
* `numBujias`

### 3️⃣ El motor deberá tener **un solo constructor** con todos sus atributos.

### 4️⃣ El motor tendrá además 2 métodos:

* `encender()` → muestra por pantalla: *"Motor encendido"*
* `apagar()` → muestra por pantalla: *"Motor apagado"*

---

## 🚗 Clase Coche

### 5️⃣ Coche deberá tener 3 atributos privados:

* `modelo`
* `marca`
* `motor` (asociación con clase Motor)

### 6️⃣ El atributo `motor` hace referencia a la clase Motor.

### 7️⃣ Coche tendrá **2 constructores**:

* Uno con todos los atributos.
* Uno **sin motor** (porque un coche puede crearse sin motor y añadirse después).

### 8️⃣ Coche tendrá 2 métodos:

* `arrancar()` → muestra: *"Arrancando el coche"* y enciende el motor.
* `detener()` → muestra: *"Deteniendo el coche"* y apaga el motor.

---

# 🧪 Clase Main: Pruebas y Lógica

### 9️⃣ Crea un ArrayList:

```java
ArrayList<Coche> listaCoches = new ArrayList<>();
```

### 🔟 Crea 2 motores: **diesel** y **gasolina**.

### 1️⃣1️⃣ Crea 4 coches:

* 2 con motor diesel
* 1 con gasolina
* 1 **sin motor**

### 1️⃣2️⃣ Añádelos al ArrayList.

### 1️⃣3️⃣ Recorre la lista y si encuentras un coche **sin motor**, añádele uno de gasolina.

---

# 🧤 Testeo

### 1️⃣4️⃣ Enciende todos los coches para verificar que arrancan bien.

### 1️⃣5️⃣ Finalmente, **detén todos los coches**.

---

## 🎉 ¡Listo! Con este ejercicio aprenderás:

✔ Concepto de clase y objetos
✔ Atributos y métodos
✔ Encapsulación (getters/setters)
✔ Extensión funcional
✔ Asociación entre clases
✔ Uso de colecciones (`ArrayList`)
✔ Trabajo con lógica básica de control

---

¡A programar! 💻🔥
