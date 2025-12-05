from fastapi import FastAPI
import requests

app = FastAPI()

NORRIS_URL = "https://api.chucknorris.io/"

@app.get("/")
async def root():
    return {
        "message": "API intermediaria de Chuck Norris",
        "api_publica": "https://api.chucknorris.io/",
        "instrucciones": {
            "/peticion": "Broma aleatoria de Chuck Norris",
            "/peticion?categoria=dev": "Broma por categoría",
            "/peticion/categorias": "Lista de categorías disponibles"
        }
    }

@app.get("/peticion")
async def obtener_broma_chuck_norris(categoria: str = None):
    if categoria:
        url = f"{NORRIS_URL}jokes/random?category={categoria}"
    else:
        url = f"{NORRIS_URL}jokes/random"
    
    response = requests.get(url)
    data = response.json()
    
    # Devolvemos TODOS los campos que devuelve la API original
    return data

@app.get("/peticion/categorias")
async def obtener_categorias():
    url = f"{NORRIS_URL}jokes/categories"
    response = requests.get(url)
    categorias = response.json()
    
    return {
        "categorias": categorias,
        "total": len(categorias)
    }

if __name__ == "__main__":
    import uvicorn
    uvicorn.run(app, host="0.0.0.0", port=8000)