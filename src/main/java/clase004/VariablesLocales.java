package clase004;

public class VariablesLocales {
    int variableInstancia;
    boolean var1;//por defecto es false
    byte var2;//por defecto es 0
    long var3;//por defecto es 0
    String var4;//por defecto es null
    char var5;// '\u0000' NUL
    float var6;
    double var7;
    int a,b=3;//a vale 0 y b vale 3

    public void método(){
        //las variables locales no tienen valor por defecto, se deben inicializar antes de usarlas
        //asi sea primitiva o de referencia, si es local se debe de inicializar antes de usarla
        int a;
        String b;
//        System.out.println(b);
//        System.out.println(a);//da error en tiempo de compilacion ya que tiene una variable local sin inicializar
    }

    public static void main(String[] args) {
        VariablesLocales variablesLocales=new VariablesLocales();
        System.out.println(variablesLocales.variableInstancia);
        System.out.println(variablesLocales.var1);
        System.out.println(variablesLocales.var2);
        System.out.println(variablesLocales.var3);
        System.out.println(variablesLocales.var4);
        System.out.println(variablesLocales.var5);
        System.out.println(variablesLocales.var6);
        System.out.println(variablesLocales.var7);
        System.out.println(variablesLocales.a);
        System.out.println(variablesLocales.b);
    }
}
