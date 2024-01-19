package clase006;



//alcanca de variables locales es solo en el bloque al que pertenecen
//alcance de variables de instncia, es hasta que el objeto pase al recolector de basura
//alcance de variables de clase es hasta que el programa se termine de ejecutar


public class VariableClase {
    //cuando es final static el valor de la const se debe declarar en la misma linea, o como alternativa, en un
    //bloque estatico
    final static double pi;
    //da error inicializar en el bloque de inicializacion ya que pi es statico, se debe de hacer en un bloque estatico
//    {
//        pi=3;
//    }
    //bloque estatico
    static {
        pi=3D;
    }

    public static void main(String[] args) {
        var var=new VariableClase();
        System.out.println(var.pi);
    }
}
