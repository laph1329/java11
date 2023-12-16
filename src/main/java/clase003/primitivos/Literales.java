package clase003.primitivos;

public class Literales {
    public static void main(String[] args) {
        //se agrega l o L, lo convencional es la L mayúscula
        //puede no llevar L si es que es un numero pequeño
        long dog = 154256751999999l;

        // java permite 4 sistemas
        // decimal, octal , hexadecimal y binario

        //decimal
        long val1 = 10;
        System.out.println(val1);
        //octal empieza con cero "0"
        long val2 = 017;
        System.out.println(val2);
        //hexadecimal permite x o X empieza con "cero" y "X"
        long val3 = 0x1A;
        System.out.println(val3);
        //binario permite b o B
        long val4 = 0b101;
        System.out.println(val4);

        int millon = 1000000;
        System.out.println(millon);
        //es valido pero la regla es que haya un numero antes y despues del guion o guiones, asi sea un decimal
        int millon2 = 1_000_000;
        System.out.println(millon2);
        int uggly= 1___3;
        System.out.println(uggly);
    }
}
