package clase014.stringBuilder;

public class DemoStringBuilder {
    public static void main(String[] args) {

        String alpha="";
        for(char current='a';current<='z';current++)//es ineficiente
            alpha+=current;//se crean 26 instacias de las cuales solo queda la ultima, el resto es para el garbage collection
        System.out.println(alpha);


        StringBuilder stringBuilder= new StringBuilder();
        for(char current='a';current<='z';current++)
            stringBuilder.append(current);
        System.out.println(stringBuilder);

        StringBuilder sb= new StringBuilder("start");
        sb.append("+middle");
        StringBuilder same=sb.append("+end");
        System.out.println(sb.toString());
        System.out.println(same.toString());


        StringBuilder a= new StringBuilder("abc");
        StringBuilder b= a.append("de");
        b.append("f").append("g");
        System.out.println(a);//a apuntan al mismo lugar de memoria
        System.out.println(b);//b apuntan al mismo lugar de memoria

        String m="abc";
        String n=m.concat("de");
        n=n.concat("f").concat("g");
        System.out.println(m);
        System.out.println(n);

        //StrinBuffer es para en casos de concurrencia multiHilos Threads, es mas lento que StringBuilder, no viene en el examen


        //Metodos de StringBuilder, funcionan igual que el de String
        StringBuilder sb1= new StringBuilder("animals");
        String sub= sb1.substring(sb1.indexOf("a"),sb1.indexOf("al"));//sb1 sigue mantiendo su valor inicial, no se modifica
        int len=sb1.length();
        char ch=sb1.charAt(6);
        System.out.println(sub);
        System.out.println(len);
        System.out.println(ch);

        //otra forma de crear instancia
        StringBuilder s3= new StringBuilder().append(1).append('X').append("-").append("\u2000").append(true);
        System.out.println(s3);

        StringBuilder s4=new StringBuilder("animals");
        s4.insert(7,7);
        System.out.println(s4);
        s4.insert(0,"0");
        System.out.println(s4);
        s4.insert(3,true);
        System.out.println(s4);
        s4.insert(4,"\u2000");
        System.out.println(s4);

        StringBuilder s5= new StringBuilder("abcdefg");
        s5.delete(7,70);
        System.out.println(s5);
        s5.delete(1,3);
        System.out.println(s5);
        s5.delete(1,100);//el primer parametro debe ser menor igual a la cantidad de caracteres de la cadena sino dara exception
        System.out.println(s5);
//        s5.deleteCharAt(100);//StringIndexOutOfBoundsException

        StringBuilder s6=new StringBuilder("abcdefgh");
        s6.replace(3,5,"1234");
        System.out.println(s6);
        System.out.println(s6.reverse());
        String s6String=s6.toString();



    }
}
