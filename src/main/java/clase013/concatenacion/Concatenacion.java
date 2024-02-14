package clase013.concatenacion;

public class Concatenacion {
    public static void main(String[] args) {

        System.out.println(1+2);
        System.out.println(1+"2");
        System.out.println(1+2+"3");
        System.out.println("1"+"2"+3);
        System.out.println("1"+2+3);

        String s="1";
        s+="2";//es igual a s=s+2
        System.out.println(s);
        s+=3; //es igual a s=s+3
        System.out.println(s);
    }
}
