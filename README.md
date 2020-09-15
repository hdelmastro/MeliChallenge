# MeliChallenge - Mutant en 2 días - Desaprobado por no hacer manejo de Excepciones, porque los test unitarios funcionan solo on-line y porque no tenia base de datos local (No se especificaba nada al respecto en el challenge así que hice lo que pude con el tiempo que tenía).

_API de verificacion de ADN Mutante_

## Comenzando 🚀

_A continuación se detalla los paso para la puesta en funcionamiento de forma local de la aplicación._

_También se encuentra disponible una versión en Heroku en la siguiente url https://meli-mutant-challenge.herokuapp.com/_

### Pre-requisitos 📋

_Debes tener instalado JAVA jdk 1.8 o posterior (https://www.oracle.com/ar/java/technologies/javase/javase-jdk8-downloads.html)._

_Y Maven para poder compilar el proyecto (https://maven.apache.org/download.cgi)._


### Instalación 🔧

_Una vez clonado el repositorio dirigirse a la carpeta de descarga, para ejecutarlo debe correr la siguiente linea de commandos:_

```
mvn spring-boot:run
```

## Pruebas ⚙️

_Para probar el servicio de varificacion de mutantes puede hacer un POST a alguno de los siguientes endpoints:_

```
http://localhost:8080/meli/mutant/

Con body:

{ 
	"dna":["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]
}

```

_O puede probar la version que se encuentra desplegada aquí:_

```
https://meli-mutant-challenge.herokuapp.com/meli/mutant/

Con body:

{ 
	"dna":["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]
}

```

_Para probar el servicio de stadisticas puede hacer un GET a alguno de los siguientes endpoints:_

```
http://localhost:8080/meli/stats/

```

_O puede probar la version que se encuentra desplegada aquí:_

```
https://meli-mutant-challenge.herokuapp.com/meli/stats/

```


## Nota 📄 

* Me hubiese gustado tener tiempo para agregarle Swagger para documentar correctamente la API.

## Construido con 🛠️

* [Maven](https://maven.apache.org/) - Manejador de dependencias

## Autores ✒️

* **Héctor Edgardo del Mastro** - *Trabajo Inicial* - [hdelmastro](https://github.com/hdelmastro)

