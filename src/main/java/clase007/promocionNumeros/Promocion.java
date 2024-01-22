package clase007.promocionNumeros;

import java.lang.reflect.Type;

public class Promocion {
    public static void main(String[] args) {
        int x = 1;
        long y = 2;
        var z = x + y;//z sera tipo long
        System.out.println(z);

        short x1 = 5;
        short y2 = 10;
//        short alt=x1*y2;// no compila
        var z1 = x1 * y2; //z1 sera tipo entero
        System.out.println(z1);

        //float egg= 2.0/9;//no compila
        float egg = 2.0f / 9;
        float egg1 = 10F / 2;
        System.out.println(egg1);
        //int i= 1.0; //no compila

        int trainer = (int) 1.0;
        System.out.println(trainer);
        short traier1 = (short) 554784544544444L;
        System.out.println(traier1);//overflow si es positivo, underflow si es negativo
        int j = (int) 9F;
        System.out.println(j);

        short p = 1;
        short p1 = 5;
        //short r=p*p1;//no compila porque el resultado es int


        long goat = 5;
        int sheep = 4;
//        sheep=sheep*goat;//no compila porque el resultado es long y sheep es int
        //primero convierte sheep a long, luego multipla, luego el resultado se convierte en int y se asigna a sheep
        sheep *= goat;


        long wolf = 5;
        long coyote = (wolf = 3);

        boolean healthy = false;
        if (healthy = true)
            System.out.println("Good!");

        String a="as";
        a="asd";
        System.out.println(a);
    }
}
