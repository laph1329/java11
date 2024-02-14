package clase013.inmutabilidad;

import java.util.Locale;

public class Mutable {
    //inmutabilidad es algo que no puede ser cambiado mientras el programa esta vivo
    //la clase String es inmutable
    private String s;

    public void setS(String s) {
        this.s = s;
    }
    public String getS(){
        return s;
    }

    public static void main(String[] args) {
        String s1="1";
        String s2=s1.concat("2");
        s2.concat("3");//es como si no existiera esta linea, ya que no se asigna a nadie, s2 no varia es inmutable
        System.out.println(s2);

        String anim="an1mals";
        System.out.println(anim.length());//para string length lleva (), para arrays no lleva, y size es para listas, arrayList
        System.out.println(anim.charAt(5));
//        System.out.println(anim.charAt(7));//compila pero da excepcion StringIndexOutOfBoundsException

        System.out.println(anim.indexOf("a"));
        System.out.println(anim.indexOf("al"));
        System.out.println(anim.indexOf("x"));
        System.out.println(anim.indexOf('a',3));//busca 'a' desde la posicion 3
        System.out.println(anim.indexOf(49));//49 es ASCII es 1, por lo que lo encuentra

        System.out.println(anim.substring(3));//de la posicion 3 en adelante
        System.out.println(anim.substring(3,5));//de la posicion 3 al 5, no considera el caracter de la posicion 5
        System.out.println(anim.substring(3,3));//empty
//        System.out.println(anim.substring(3,2));//StringIndexOutOfBoundsException
//        System.out.println(anim.substring(3,8));//StringIndexOutOfBoundsException

        System.out.println(anim.toUpperCase());
        System.out.println("ABC12".toLowerCase());

        String string="abc";
        System.out.println(string.equals("abc"));//equals como parametro se le pone cualquier Object
        System.out.println(string.equals("ABC"));
        System.out.println(string.equalsIgnoreCase("ABc"));//equalsIgnoreCase como parametro se le pone String


        System.out.println(string.startsWith("A"));
        System.out.println(string.startsWith("a"));
        System.out.println(string.endsWith("c"));
        System.out.println(string.endsWith("C"));

        System.out.println("ababab".replace('a','A'));//parametro char para "ambos"
//        System.out.println("ababab".replace('a',"A"))//error de compilacion, diferentes tipo de parametros
        System.out.println("ababab".replace("a","AB"));//parametro CharSequence para "ambos"

        System.out.println("abcde".contains("CD"));
        System.out.println("abcde".contains("cd"));//parametro CharSequence
//        System.out.println("abcde".contains('d'));//error no es CharSequence
        System.out.println("abcde".contains("d"));


    }
}
final class inmutable{
    private String s="name";
    public String getS(){
        return s;
    }
}
