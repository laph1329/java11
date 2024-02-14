package clase014.stringPool;

public class Casos {
    public static void main(String[] args) {
        String x="hi";
        String y= " hi".trim();
        System.out.println(x==y);
        /**
         * explicacion: ambos se registran en el String pool,pero en distintos tiempos
         * String x="hi";//se ejecuta en tiempo de compilacion
         * String y= " hi".trim();//recien se sabe que tipo de literal es en tiempo de ejecucion
         * System.out.println(x==y);//retorna falso
         */

        String a="hi w";
        String b="hi";
        b+="w";
        System.out.println(a==b);
        /**
         * String a="hi w"; se agrega al String pool
         * String b="hi"; se agrega al String pool
         * b+="w"; recien se ejecuta en tiempo de ejecucion(se crea un String)
         * System.out.println(a==b); retorna false
         */

        String p="hi w";
        String q="hi"+ " w";
        String r="hi";
        r+=" w";
        System.out.println(p==q);
        System.out.println(p==r);
        /**
         * String p="hi w"; va al pool
         * String q="hi"+ " w"; es facil deducir al compilador, va al pool tambien
         * String r="hi"; va al pool pero es otra referencia "hi"
         * r+=" w"; recien se ejecuta en tiempo de ejecucion
         */
    }
}
