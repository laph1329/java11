package clase003;

public class Swan {
    String name;

    {//Inicializador de instacia
        name = "luiss";
    }

    //el constructor se ejecuta luego de que todos los campos y bloques de inicialziacon de instancia se ejecutan
    public Swan(){

    }

    private int numEgg; //variable de instancia, valor por defecto es 0
    String first = "lu";
    String last = "is";
    String full = first + " " + last; //full debe de estar luego de first y last porque los usa

    public static void main(String[] args) {
        {//no es inicializador de instancia, porque esta dentro de un metodo, solo es un bloque de codigo

        }
        Swan swan1 = new Swan(); //swan1 variable de referencia
        swan1.numEgg = 1;
        System.out.println(swan1.numEgg);
    }
}
