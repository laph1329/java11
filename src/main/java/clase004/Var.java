package clase004;

public class Var {

    //OJOO var (v con minuscula) no es una palabra reservada, pero si es un nombre de tipo reservado, prohibido usarlo como
    //nombre de class, interface, o enum

    //var aparecio desde java 10
//    var name=4;//no compila var es solo variables locales. no para variables de instancia, es decir se puede usar solo
    //en métodos, constructores y bloques de inicialización
    public Var(){
        var var=4;//en el constrcutor tambien se puede usar var, ya que es un metodo
    }
    public void var(){
        var var= "var";
    }
    public void metodo01(){
        var name=4;//OJO se declara junto con un valor inicial
//        name="Luis";// no se puede cambiar el tipo de dato una vez se le asigne valor
        System.out.println(name);
    }

    public void breakingDeclaration(){
        var name

                ="luis"; //se considera como una sola linea
    }
    public void twoTypes(){
//        var n=null;//No compila ya que java no intuye que tipo es
        var nulo=(String) null; //aqui si ya que estas diciendole que es tipo String
        int a,b=3;//a y b locales, no tienen valor por defecto, solo se asigna valor 3 al b
        int g=3,h;
//        System.out.println(a,b);//da error porque a no esta inicializada
//        int e,int f;// no se puede
//        int e=4,int f=5; //no se puede
        int c=5,d=6; //si se puede
//        var m=4,p=5; //var no permite declaraciones mutiples
    }

    //error var es solo variables locales, no como parametros del metodo
//    public void suma(var a, var b){
//
//    }

    public static void main(String[] args) {
        Var variable= new Var();
        variable.metodo01();
    }
}
