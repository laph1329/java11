package clase005;

public class Static {
    static int VAR;//variable de clase
    static final int pi=3;//constante
    final static int pi2=3;//constante
    int length;

    public static void main(String[] args) {
        Static s1= new Static();
        Static s2= new Static();
        Static s3= new Static();
        s1.VAR=4;
        s2.VAR=5;
        s3.VAR=0;
        System.out.println(s1.pi);
        System.out.println(s1.VAR);
    }
}
