# Titulo

Inventario Vacunacion

# Construccion

La solución desarrollada para los requerimientos fue contruida con Java bajo Spring boot 
Se utilizó el IDE Eclipse con los pluging de Spring Boot

Se inicio con el modelamiento de la base de datos con las tablas columnas etc necesarias luego de un análisis de los requerimientos, posterior construcción de la base de datos

Se generó el proyecto maven con las dependencias de Spring Boot
1. Configuración del archivo pom.xml con las dependencias necesarias
2. Configuración de la conexión a la base de datos en el archivo application.properties
3. Creación de las entidades en el paquete modelo
4. Creación de las clases de entrada y salida de los servicio entre ellas las clases DTO paquete dto
5. Se generó las interfaces(Dao) para los métodos definidos para interacción con las base de datos paquete dao
6. Se generó las interfaces para los métodos necesarios en el mismo las clases que las implementan paquete services
7. Creación de los controller para definir los métodos, path y la firma del servicio

# Ejecucion

## Pasos Previos Base de datos

1. Descargarse el archivo backup de la base de datos utilizada
2. Rrestaurar la base de datos creada en Postgres llamada: vacunacion 

## Compilacion servicio

NOTA para la compilacion se necesita que este configurado la maven en la maquina e instalado JAVA

* Configuracion maven
(http://codigoelectronica.com/blog/instalar-maven-en-windows)

1. Realizar la compilacion si se ha modificado las fuentes o para pruebas de la siguiente manera
2. Descargar las fuentes de la solución del gitHub (https://github.com/migueliza/InventacioVacunacion)
3. Editar el archivo application.properties ubicado: [ruta_descarga]\src\main\resources con los datos del servidor de base de datos y guardar
los siguientes datos:

* spring.datasource.url=jdbc:postgresql://localhost:5432/vacunacion
* spring.datasource.username=postgres
* spring.datasource.password=root

4. Abrir una consola de comando (cmd) y ubicarse en la ruta donde se descargo las fuentes
5. ejecutar el siguiente comando Hacer un mvn clean install

## Ejecucion servicios
1. Una vez compilado o solo descargado las fuentes ubicarse en la ruta de la carpeta targer
[ruta_descarga]\target
2. Ejecutar el archivo .jar (vacunacion-1.0.0.jar)
3. Abrir un navegador con la siguiente url: http://localhost:9090/swagger-ui.html
4. se puede utilizar los metodos que se encuentran en la documentacion swagger o utilizar otro probador como Postman

Muchas Gracias!
