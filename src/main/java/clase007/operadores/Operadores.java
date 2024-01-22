package clase007.operadores;

public class Operadores {
    public static void main(String[] args) {
        int nume= 5;
        int cero= 0;
        System.out.println(-(0));
        // con parentesis el - es multiplicación
        System.out.println(-(-nume));


        int num= 10;
        int num2= 10;
        int result;
        int result2;
        // primero asigna, luego antes de pasar a la siguiente linea num aumenta en 1
        result=num++;
        // primero num2 aumenta en 1, luego asigna
        result2=++num2;
        System.out.println(result);
        System.out.println(result2);

        float num3= 10;
//        System.out.println("Resultado           ::: "+ (++num3)+(num3++)+2*(num3--)+(num3--));
//        double res=(((num3--)+10)/(num3++));
        double res=num3--*5/--num3;
        System.out.println("Resultado           ::: "+res);
//        System.out.println("Resultado           ::: "+(++num3)+2*(num3--));
        System.out.println("valor final de num3 ::: "+num3);
    }
}
