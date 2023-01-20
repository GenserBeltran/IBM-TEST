### IBM-TEST

Proyecto, prueba técnica de oferta de trabajo.

####Problema: 
El cliente nos ha solicitado recibir un fichero plano con la información de sus proveedores, el reporte no debe de tener ningún formato especifico y únicamente hace falta que se genere de forma plana con sus respectivas cabeceras.

####Instrucciones técnicas: 
Necesitamos desarrollar un pequeño programa en lenguaje Java que se conecte a una base de datos (mysql) y obtenga los datos para generar un fichero plano. 
 
El ejecutable debe de recibir un parámetro el cual será el código del cliente, por ejemplo: ./programa.jar 1
El programa debe de recibir el parámetro 1 y realizar una consulta a la tabla de proveedores en base de datos, estos datos deben de ser recolectados en una lista y recorrerlos para generar un fichero plano final con los registros volcados por la base de datos.
Si el código no tiene registros, el programa debe de mostrar por consola que el cliente no tiene proveedores asignados.

### Lenguajes - Frameworks - IDE - DB
![](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white) ![](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white) ![](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) ![](https://img.shields.io/badge/Visual_Studio_Code-0078D4?style=for-the-badge&logo=visual%20studio%20code&logoColor=white) ![](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)

#### Caracteristicas Del Proyecto
El programa se base en una arquitectura monolítica, en el back con JavaEE (v.17) - Mysql (8.30) - Maven - commons-dbcp2

+ Capa de datos
    + APÍ JDBC
	+ Patron de diseño DTO

#### Caracteristicas Del Proyecto

### Autores

* Daniel Beltran  ***Desarrollo - Pruebas - Documentación***
![](https://img.shields.io/github/stars/GenserBeltran?style=social)


