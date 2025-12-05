from fastapi import FastAPI, Body, Form
from fastapi.responses import FileResponse, HTMLResponse

app = FastAPI()

# Variable con el nombre de la película
PELICULA_CORRECTA = "el sexto sentido"
ARCHIVO_RESPUESTAS = "respuestas.txt"
ARCHIVO_OPINIONES = "opiniones.txt"


@app.get("/")
def pagina_principal():
    html_content = f"""
    <!DOCTYPE html>
    <html>
    <head>
        <title>Adivina la Película</title>
    </head>
    <body>
        <h1>¿Qué película es?</h1>
        <img src="/pista1" alt="Pista de la película" style="max-width: 500px;">
        <br><br>

        <!-- Enlaces a las pistas -->
        <p>
            <a href="/pista1">Pista 1 (Imagen)</a> | 
            <a href="/pista2">Pista 2 (Frase)</a> | 
            <a href="/pista3">Pista 3 (Ayuda)</a>
        </p>

        <form action="/respuesta" method="post">
            <input type="text" name="mensaje" placeholder="Escribe el nombre de la película" required>
            <input type="submit" value="Enviar respuesta">
        </form>
    </body>
    </html>
    """
    return HTMLResponse(content=html_content)


@app.get("/pista1")
def image():
    file = "el_sexto_sentido.jpg"
    return FileResponse(file, media_type="image/jpg") @ app.get("/pista1")


@app.get("/pista2")
def pista_frase():
    html_content = """
    <h2>Pista 2: Frase famosa</h2>
    <p><em>"Veo gente muerta..."</em></p>
    <p>Un niño le confiesa esto a su psicólogo.</p>
    <br>
    <a href="/">Volver al inicio</a>
    """
    return HTMLResponse(content=html_content)


@app.get("/pista3")
def pista_ayuda():
    html_content = f"""
    <h2>Pista 3: Más ayuda</h2>
    <p>La película es: "El ______ _______"</p>
    <p>Protagonista: Bruce Willis</p>
    <p>Año: 1999</p>
    <br>
    <a href="/">Volver al inicio</a>
    """
    return HTMLResponse(content=html_content)


@app.post("/respuesta")
async def get_message(mensaje: str = Form(...)):
    with open(ARCHIVO_RESPUESTAS, "a", encoding="utf-8") as f:
        f.write(mensaje + "\n")
    if mensaje.lower() == PELICULA_CORRECTA:
        html_response = """<h2>Has acertado!</h2>
        <a href='/opinion-form'>Escribe tu opinión</a>"""
        return HTMLResponse(content=html_response)
    else:
        html_response = """<h2>Has errado!</h2>
                <a href='/pista2'>Intentar de nuevo</a>"""
        return HTMLResponse(content=html_response)


@app.get("/opinion-form")
def opinion_form():
    html_form = f"""
    <h2>Escribe tu opinión sobre "{PELICULA_CORRECTA.title()}"</h2>
    <form action="/opinion" method="post">
        <textarea name="mensaje" rows="5" cols="40" placeholder="¿Qué te pareció la película?"></textarea>
        <br><br>
        <input type="submit" value="Enviar opinión">
    </form>
    <a href="/">Volver al início</a>
    """
    return HTMLResponse(content=html_form)


@app.post("/opinion")
async def save_opinion(mensaje: str = Form(...)):
    with open(ARCHIVO_OPINIONES, "a", encoding="utf-8") as f:
        f.write(f"{PELICULA_CORRECTA}: {mensaje}\n")
    html_response = f"""
        <h2>¡Opinión guardada correctamente!</h2>
        <p>Tu opinión sobre {PELICULA_CORRECTA.title()} ha sido guardada.</p>
        <a href='/'>Volver al inicio</a>
    """
    return HTMLResponse(content=html_response)
