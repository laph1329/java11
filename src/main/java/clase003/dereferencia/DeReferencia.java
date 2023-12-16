package clase003.dereferencia;

//import java.lang.*; //esta libreria siempre esta por defecto

public class DeReferencia {

    java.util.Date today;
    String greeting;
    //da error porque a un primitivo no se le asigna null
    //int number= null;


    //nombre de variable, también se conoce como identificador

    //puede comenzar solo con letra, $ o _
    String $var;
    String _v;

    //no puede ser solo _
    //String _;

    //no puede iniciar con números
    //String 9v;

    String a,b,c="10"; //solo el c tiene valor 10




    public DeReferencia(){
        today=new java.util.Date();
        greeting=new String("saludo");
    }
    public static void main(String[] args) {
    }
}
