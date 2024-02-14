package clase014.stringPool;

public class StringPool {
    //Heap es el lugar donde se crean los objetos, por defecto cubre la cuarta parte del total de la RAM
    //String pool, ubicacion la JVM, que guardan los string, tiene valores literales y constantes

    String a="Hola mundo";//si va al String pool
    String b= new String("hola");//no va al String pool

    public static void main(String[] args) {
        String x="hi";
        String y="hi";
        System.out.println(x==y);
        /*
        explicacion: como ambos son literales, ambos van al String pool.
        String x="hi"; se registra en el String pool la cadena "hi", x apunta a este "hi"
        String y="hi"; no se registra, ya que "hi" ya existe en el String pool por lo que la variable "y" tambien apunta
        al mismo "hi"
        System.out.println(x==y); como ambos apuntan al mismo "hi" misma referencia, entonces retorna verdadero
         */

        String m="hola";//si va al String pool
        String n= new String("hola");//no va al String pool
        System.out.println(m==n);
        /*
        Explicación: solo el m va String pool, el n va al heap.
        String m="hola"; se registra en el String pool la cadena "hola", x apunta a este "hola"
        String n= new String("hola"); no se registra en el String pool, se registra en el heap, por lo que n apunta a
        "hola" en el heap
        System.out.println(m==n); como ambos tienen diferente referencia, entonces retorna falso
         */

        String p= new String("hola");//no va al String pool
        String q= new String("hola");//no va al String pool
        System.out.println(p==q);
        /*
        Explicación: ambos van al heap, distintas referencias, es decir se registran 2 "hola" en el heap.
        System.out.println(p==q); como ambos tienen diferente referencia, entonces retorna falso
         */
    }
}
