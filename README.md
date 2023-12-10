# JAVA 11
teoría para la certificación para Java 11

## CLASE 01 

### VERSIONES Y FRAMEWORKS
- Oracle compra a Sun MicroSystem, dona java EE a eclipse, y este lo cambia de nombre a Jakarta EE (el nombre lo dono la fundación apache)
crea microprofile (especificaciones para Micro servicios).
- Jakarta compite con Spring.
- Oracle es el actual dueño de Java, web logic, nube OCI. 
- Caca versiones de java, algunas de ellas son fijas LTS (Long-Term Support) Soporte a Largo Plazo.
- Oracle cobra por el JDK en producción, pero es libre en desarrollo y en test. Hay versiones Open Source como OpenJDK, y la version para empresas es "adoptopenjdk" por fundación eclipse (soportado por varias compañias), esta versión se puede usar en producción
- IBM también tiene su versión JDK "azulSystem" (es muy caro), si tienes Azure tienes azulSystem gratis ya que tiene un convenio con IBM
- Oracle cloud si usas su nube te da el JDK gratis.
- Amazon tiene su JDK "Amazon Corretto" gratis para sus clientes

### FRAMEWORKS ORIENTADOS A MICROSERVICIOS
- OJO:: MicroProfile es un conjunto de especificaciones, Quarkus (creado por RedHat) está basado en microProfile, es decir es la implementación.
- Oracle creo la máquina virtual GraalVM para Python, rubi, C y otros, incluido Java.
- Quarkus soporta ambas maquinas virtuales JVM y GraalVM.
- Micronaut tambien implementa microProfile es competencia de Quarkus.
- Helidon creado por Oracle implementa MicroProfile.
- Open Liberty lo cre IBM tambien implementa MicroProfile

### CONCEPTOS
- JRE: Java Runtime Enviroment (la sacaron desde la versión 9 en adelante), antes cuando se instalaba el JDK 1.8 también se instalaba el JRE

### Declaración de clases
- Un archivo de clase, puede tener muchas clases e interfaces declaradas dentro, pero solo debe tener una que sea publica y que coincida con el nombre del archivo  

### compilar
- Desde java 11 es suficiente colocar "java NombreClase.java" (siempre y cuando la clase no herede ni implemente ademas no se debe instanciar ningun objeto en su contenido).
- Al usar "java NombreClase.java", no genera un .class, quiere decir que se ejecuta en memoria.
- Antes era "javac NombreClase.java", y luego "java NombreClase" (javac genera el .class), tambien se puede usar en java 11.

## CLASE 02 

### compilar
- Para compilar un conjunto de clases se hace asi:
  - javac clase002/Main.java clase002/Animal.java (compila dos clases Main y Animal)
  - javac clase002/*.java (es para compilar todas las clases dentro de la carpeta clase002)
- para ejecutar se puede hacer de dos manera "java ruta/NombreClase" o java ruta.NombreClase (en este caso solo funciona cuando es igual al package de la clase, y se debe ubicar en el classpath)
  - Da error "java java/clase002/Main "
  - Da error "java java.clase002.Main " (da error porque no es igual al package)
  - Da error "java java/clase002.Main "
- la compilación en memoria "java NameClass.java" funciona siempre y cuando no exista el compilado (.class)