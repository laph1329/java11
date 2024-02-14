package clase014.igualdad;

public class Igualdad {
    public static void main(String[] args) {

        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        StringBuilder s3=s1.append("abc");
        System.out.println(s1==s2);//variables de referencia apuntan a distintos lugares de memoria false(se puede usar equals, es lo mismo para StringBuilder)
        System.out.println(s1==s3);//variables de referencia apuntan al mismo lugar de memoria true(se puede usar equals, es lo mismo para StringBuilder)


        //El método equals() para String compara el contenido, mientras que para StringBuilder compara las referencias.
        //esto es debido a que StringBuiler no implementa equals
        String x1="hola";
        String x2="   hola".trim();
        System.out.println(x1.equals(x2));//compara los valores dentro del string mas no las variables de referencia

        StringBuilder y1=new StringBuilder("java");
        StringBuilder y2=new StringBuilder("java");
        if(y1.equals(y2)){//en este caso compara referencias no contenido
            System.out.println("iguales");
        }else {
            System.out.println("diferentes");
        }
    }
}
