# Proyecto - Ejecutar tests con pytest

## Requisitos
- Python 3.x
- pytest instalado

## Instalación
1. (Opcional) Crear y activar un entorno virtual:
   
   python3 -m venv .venv  
   source .venv/bin/activate

2. Actualizar pip e instalar pytest:

   pip install --upgrade pip  
   pip install pytest

## Ejecutar tests
- Ejecutar todos los tests (modo silencioso / corto):

  pytest -q


## Notas
- Ejecutar los comandos desde la raíz del proyecto, donde están los archivos `test_*.py`.  
- Si usas un entorno virtual asegúrate de activarlo antes de instalar o ejecutar pytest.