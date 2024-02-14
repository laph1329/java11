# JAVA 11
teoría para la certificación para Java 11

## CLASE 01 

### VERSIONES Y FRAMEWORKS
- Oracle compra a Sun MicroSystem, dona java EE a eclipse, y este lo cambia de nombre a Jakarta EE (el nombre lo dono la fundación apache)
crea microprofile (especificaciones para Micro servicios).
- Jakarta compite con Spring.
- Oracle es el actual dueño de Java, web logic, nube OCI. 
- Saca versiones de java, algunas de ellas son fijas LTS (Long-Term Support) Soporte a Largo Plazo.
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

- Luego de compilar, para ejecutar se puede hacer de dos maneras "java ruta/NombreClase" o java ruta.NombreClase 
(en este caso solo funciona cuando es igual al **package de la clase**, y se debe ubicar en el classpath)
  - Da error "java java/clase002/Main "
  - Da error "java java.clase002.Main " (da error porque no es igual al package)
  - Da error "java java/clase002.Main "

- la compilación en memoria "java NameClass.java" funciona siempre y cuando no exista el compilado (.class)

- para compilar en un directorio alternativo
  - javac -d classes packagea/classA.java packageb/classB.java

- para ejecutar el programa se especifica el classpath para que java sepa donde encontrar las clases, hay 3 ejemplos

  - java -cp classes packageb.classB
  - java -classpath classes packageb.classB
  - java --class-path classes packageb.classB

- Compilando archivos Jar

  - windows ::: java -cp ".;C:\temp\someotherLocation;c:\temp\myjar.jar" myPackage.Myclass
    (separacion por ; y \ para las rutas)
    (el punto es directorio actual;otro directorio que tiene clases que necesito; un jar que necesita para ejecutar)

  - Linux ::: java -cp ".:/temp/someotherLocation:/temp/myjar.jar" myPackage.Myclass
    (separacion por : y / para las rutas)
    (el punto es directorio actual; otro directorio que tiene clases que necesito; un jar que necesita para ejecutar)
- 
  - se puede usar wildcard(*) java -cp "C:\temp\directorywithjars\*" package.Myclass
    (no incluye jars que estén en subdirectorio de directorywithjars)

- Creando archivos Jar

  - jar -cvf newFile.jar .
  - jar --create -verbose -file nreFile.jar .
  - jar -cvf newFil.jar -C ruta/Classes .   (el punto indica que cree la ruta en el directorio actual)

  - JAR es la abreviatura de java archive Es un formato de archivo que se utiliza para almacenar aplicaciones y 
  herramientas escritas en el lenguaje Java. Los archivos JAR están comprimidos con el formato ZIP.
  - 
  - Un archivo JAR puede contener los siguientes tipos de archivos:
     1. Archivos de clase: Estos archivos contienen el código fuente de las clases Java que componen la aplicación o 
    herramienta.
     2. Archivos de configuración: Estos archivos contienen información sobre la configuración de la aplicación o 
    herramienta.
     3. Archivos de recursos: Estos archivos contienen recursos, como imágenes, sonidos y archivos de texto, que se 
    utilizan en la aplicación o herramienta.

## CLASE 14
### HEAP
 - En Java, el heap es un área de memoria dinámica donde se almacenan los objetos creados durante la ejecución del programa. Se puede considerar como un espacio de almacenamiento flexible que se asigna y libera automáticamente según las necesidades del programa.
 - VisualVM herramienta para visualisar estadisticas de la JVM
### String Pool
- es un área de memoria donde se almacenan todas las cadenas literales utilizadas en un programa. Es una forma de optimizar el uso de la memoria y mejorar el rendimiento.
### Arrays
- Es una area de memoria en el heap, con un espacio para un determinado numero de elementos, String es implementado por 
un Array, el String Builder tambien es implementado por un Array.
- Es un objeto que puede guardar datos de distintos tipos
