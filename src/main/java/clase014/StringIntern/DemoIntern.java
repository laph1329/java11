package clase014.StringIntern;

public class DemoIntern {
    public static void main(String[] args) {
        String a="hw";
        String b= new String("hw").intern();
        System.out.println(a==b);
        /**
         * String a="hw"; va al pool string
         * String b= new String("hw").intern(); intern fuerza usar el "hw" del string pool, para que b apunte
         * a la referencia del string pool
         */

        String x="rat"+1;
        String y= "r"+"a"+"t"+1;
//        String y= 'r'+'a'+"t"+1;//si fuera asi no seria literal, se ejecuta en tiempo de compilacion
        String z= "r"+"a"+"t"+new String("1");
//        String z= 'r'+'a'+"t"+new String("1");//si fuera asi no seria literal, se ejecuta en tiempo de compilacion
        System.out.println(x==y);
        System.out.println(x==y.intern());
        System.out.println(x==z);
        System.out.println(x==z.intern());
    }
}
