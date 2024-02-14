package clase012.paraCada;

import java.util.ArrayList;
import java.util.List;

public class ParaCada {
    void prueba(){
        //OJOOOOOOOOOOOOO
        //el lado derecho puede ser un Array o un objeto que implemente de la clase Java.lang.Iterable
        final String[] names=new String[3];
        names[0]="0";
        names[1]="1";
        names[2]="2";
        for (String name: names)
            System.out.println(name);
    }

    void prueba2(){
        //List interface, ArrayList es clase
        List<String> values=new ArrayList<>();
        values.add("3");
        values.add("2");
        values.add("1");
        for (var value:values)//se puede usar var
            System.out.println(value);
    }

    public static void main(String[] args) {
        ParaCada paraCada=new ParaCada();
        paraCada.prueba();
        paraCada.prueba2();
    }
}
