import requests
import json


def get_num_gender(url):
    dict = {}
    while (url):
        respuesta = requests.get(url)
        datos = respuesta.json()
        for p in datos["results"]:
            if (p['gender'] in dict):
                dict[p['gender']] = dict[p['gender']] + 1
            else:
                dict[p['gender']] = 1

        url = datos['info']['next']
        print(dict)
    print(dict)
    return dict


def get_num_episodes_for_character_in_first_page(url):
    dict = {}
    respuesta = requests.get(url)
    datos = respuesta.json()
    for p in datos["results"]:
        dict[p['name']] = len(p['episode'])

    print(json.dumps(dict, indent=4))


def get_num_species(url):
    species_count = {}
    while url:
        response = requests.get(url)
        data = response.json()

        for character in data["results"]:
            species = character['species']
            if species in species_count:
                species_count[species] += 1
            else:
                species_count[species] = 1

        url = data['info']['next']
        print(species_count)


def get_all_names(url):
    while (url):
        respuesta = requests.get(url)
        datos = respuesta.json()
        for p in datos["results"]:
            print(p['name'])
        url = datos['info']['next']


def get_first_page_names(url):
    respuesta = requests.get(url)
    datos = respuesta.json()
    for p in datos["results"]:
        print(p['name'])


if __name__ == "__main__":
    URL = "https://rickandmortyapi.com/api/character"
    print(get_first_page_names(URL))
    print(get_num_gender(URL))
    print(get_num_episodes_for_character_in_first_page(URL))
    (get_num_species(URL))
