package clase014.igualdad;

import java.util.Objects;

public class IgualObjetos {
    String name;
    int edad;
    public static void main(String[] args) {

        IgualObjetos x1= new IgualObjetos();
        IgualObjetos x2= new IgualObjetos();
        IgualObjetos x3=x1;
        System.out.println(x1==x3);//compara referencias del lugar memoria, es true
        System.out.println(x1==x2);//compara referencias del lugar memoria, es false
        System.out.println(x1.equals(x3));//true
        System.out.println(x1.equals(x2));//compara referencias del lugar memoria, ya que esta clase no implementa
        //equals, a diferencia de String que si compararia valores y no referencias, es false
        //lineas abajo se implementa el equals, en ese caso si daria verdadero, ya que compararia valores

        String a="a";
        StringBuilder b=new StringBuilder(a);
        System.out.println(a.equals(b));//si compila, false
//        System.out.println(a==b);//no compila
        System.out.println(a==b.toString());//false, apuntan a distintas referencias, son disntintos tipos de objetos

    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        IgualObjetos that = (IgualObjetos) o;
//        return edad == that.edad && Objects.equals(name, that.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, edad);
//    }
}
