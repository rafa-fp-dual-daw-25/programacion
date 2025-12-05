# Proyecto Herencia y Polimorfismo 🐾

🧱 1. Concepto de Clase y Objeto  
Una clase es un plano o plantilla a partir de la cual se crean objetos. Un objeto es una instancia concreta de una clase, con sus propios valores.

🧬 2. Atributos y Métodos  
Los atributos representan las características de un objeto. Los métodos representan las acciones que un objeto puede realizar.

🔐 3. Encapsulación  
La encapsulación consiste en proteger los atributos mediante visibilidad privada (`private`) y permitir el acceso mediante métodos públicos **getters** y **setters**.

➕ 4. Herencia  
La herencia permite que una clase (subclase) reutilice atributos y métodos de otra clase (superclase). En este proyecto, todos los animales heredan de una clase abstracta `Animal`.

🔄 5. Polimorfismo  
El polimorfismo permite tratar objetos de distintas clases derivadas de manera uniforme, usando referencias a la clase base `Animal`. Esto permite que un mismo método (`hacerSonido()`) se comporte diferente según el tipo de animal.

🧩 6. Clases Abstractas  
Una clase abstracta es una clase que no puede instanciarse y que puede contener métodos abstractos que obligan a las subclases a implementarlos.

---

## 🚀 ¿Qué tienes que hacer?

1️⃣ Clona el repositorio.

🔧 **Clase Animal (abstracta)**  
2️⃣ Crea un atributo privado `nombre` con su getter y setter.  
3️⃣ Crea un constructor que reciba el nombre.  
4️⃣ Crea dos métodos abstractos:
- `hacerSonido()` → devuelve un `String` con el sonido del animal.
- `comer()` → devuelve un `String` con lo que come el animal.

🐶 **Clase Perro**  
5️⃣ Hereda de `Animal`.  
6️⃣ Implementa los métodos:
- `hacerSonido()` → retorna `"Guau"`.
- `comer()` → retorna algo como `"Come croquetas"`.

🐱 **Clase Gato**  
7️⃣ Hereda de `Animal`.  
8️⃣ Implementa los métodos:
- `hacerSonido()` → retorna `"Miau"`.
- `comer()` → retorna `"Come pescado"`.

🐄 **Clase Vaca**  
9️⃣ Hereda de `Animal`.  
🔟 Implementa los métodos:
- `hacerSonido()` → retorna `"Muuu"`.
- `comer()` → retorna `"Come pasto"`.

🧪 **Clase Main: Pruebas y Lógica**  
1️⃣1️⃣ Crea un `ArrayList<Animal>` llamado `listaAnimales`.  
1️⃣2️⃣ Crea instancias de perro, gato y vaca.  
1️⃣3️⃣ Añádelas al `ArrayList`.  
1️⃣4️⃣ Recorre la lista y llama a `hacerSonido()` y `comer()` para todos los animales, demostrando **polimorfismo**.

---

🎉 **Aprenderás con este ejercicio**  
✔ Concepto de clase y objetos  
✔ Atributos y métodos  
✔ Encapsulación (getters/setters)  
✔ Herencia  
✔ Polimorfismo  
✔ Clases abstractas  
✔ Uso de colecciones (`ArrayList`)  
✔ Sobrescritura de métodos (`@Override`)

💻 ¡A programar! 🐾
