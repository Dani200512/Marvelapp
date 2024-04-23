package com.adso.marvelapp.data

import com.adso.marvelapp.modelo.Superheroe

class DataSource {
    fun getSuperHeroes():MutableList<Superheroe> {
        var superheroes: MutableList<Superheroe> = mutableListOf()


        superheroes.add(Superheroe("Spiderman","marvel","peter","https://static.wikia.nocookie.net/ficcion-sin-limites/images/6/6b/Spidey.png/revision/latest?cb=20210226124716&path-prefix=es"))
        superheroes.add(Superheroe("Thor","marvel","thor odinson","https://static.wikia.nocookie.net/marvelcinematicuniverse/images/0/0b/Thor.png/revision/latest?cb=20230122204800&path-prefix=es"))
        superheroes.add(Superheroe("Flash","DC","jay garrick","https://www.serietotaal.nl/images/nieuws/t/cwfc31mrztfy-600x338.jpg"))
        superheroes.add(Superheroe("Green","DC","alan","https://www.serietotaal.nl/images/nieuws/t/863uxf7w108x-600x338.jpg"))
        superheroes.add(Superheroe("Daredevil","marvel","matthew","https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Daredevil_C2E2_2016_%2825328511184%29.jpg/800px-Daredevil_C2E2_2016_%2825328511184%29.jpg"))
        superheroes.add(Superheroe("Hulk","marvel","Bruce Banner","https://elcomercio.pe/resizer/HdNSF9Y1TiKH3aFJvBaVCF7FQG4=/580x330/smart/filters:format(jpeg):quality(75)/arc-anglerfish-arc2-prod-elcomercio.s3.amazonaws.com/public/ZMA3AZW5VNDAJND3JJCEHENXVA.jpg"))
        superheroes.add(Superheroe("Black Widow","marvel"," Natasha Romanoff","https://upload.wikimedia.org/wikipedia/commons/0/00/Scarlett_Johansson_-_Captain_America_2_press_conference_%28retouched%29_2.jpg"))
        superheroes.add(Superheroe("Capitán América","marvel"," Steven ","https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Chris_Evans_SDCC_2014_%282%29.jpg/800px-Chris_Evans_SDCC_2014_%282%29.jpg"))
        superheroes.add(Superheroe("Deadpool","marvel","Wade Winston Wilson","https://e.rpp-noticias.io/xlarge/2020/05/18/345934_943539.jpg"))
        superheroes.add(Superheroe("SuperMan","DC","Clark Kent","https://i0.wp.com/therationalmale.com/wp-content/uploads/2011/09/clark_kent.jpg"))

     return superheroes
    }
}