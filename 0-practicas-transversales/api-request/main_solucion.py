import requests
import json

def get_num_gender(url):
    dict = {}
    while(url):
        respuesta = requests.get(url)
        datos = respuesta.json()
        for p in datos["results"]:
            if(p['gender'] in dict):
                dict[p['gender']] = dict[p['gender']] + 1
            else:
                 dict[p['gender']] = 1
                
        url = datos['info']['next']
        print(dict)
    print(dict)

def get_num_episodes_for_character_in_first_page(url):
    dict = {}
    respuesta = requests.get(url)
    datos = respuesta.json()
    for p in datos["results"]:
            dict[p['name']] = len(p['episode'])
          
    print(json.dumps(dict, indent=4))


def get_num_species(url):
    dict = {}
    while(url):
        respuesta = requests.get(url)
        datos = respuesta.json()
        for p in datos["results"]:
            if(p['species'] in dict):
                dict[p['species']] = dict[p['species']] + 1
            else:
                 dict[p['species']] = 1
                
        url = datos['info']['next']
        print(dict)
    print(dict)



def get_all_names(url):
    while(url):
        respuesta = requests.get(url)
        datos = respuesta.json()
        for p in datos["results"]:
            print(p['name'])
        url = datos['info']['next']

if __name__ == "__main__":

    URL = "https://rickandmortyapi.com/api/character"
    print(get_all_names(URL))
    

    