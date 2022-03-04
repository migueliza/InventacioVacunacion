# Titulo

Inventario Vacunacion

## Construccion

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

## Ejecucion

1. Descargar las fuentes de la solución del gitHub (https://github.com/migueliza/InventacioVacunacion)
2. Importar el el IDE eclipse el proyecto descargado
3. Hacer un mvn clean install al proyecto
4. Ejecutar el proyecto haciendo clic derecho en el proyecto -- Run As -- Spring Boot App
5. Abrir un navegador y colocar la siguiente url: 
6. Probar los métodos que se muestran.
