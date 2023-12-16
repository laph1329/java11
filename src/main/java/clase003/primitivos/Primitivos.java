package clase003.primitivos;

public class Primitivos {


    public static void main(String[] args) {

        //byte va de -128 a 127
        byte cat= '~';
        System.out.println(cat);

        //es valido porque el compilador le da el codigo ASCII de "d" que es 100
        short bird= 'd';

        //de igual manera el compilador toma el short 100 y lo convierte a "d" por codigo ASCII
        char mammal= (short) 100;

//        short reptile= 32768;//el limite es -32768 y 32767
//        char fish = (short) -1; //da error porque -1 no esta dentro de los valores de char, ningun negativo lo está

        System.out.println(bird);
        System.out.println(mammal);
    }
}
