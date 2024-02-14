package clase011.switchCondition;

import java.time.DayOfWeek;

public class CondicionCambiar {
    private int valor;
    public void condicion1(){
        valor=10;
        switch(valor){//parentesis y llaves obligatorios
            default: //el default puede ir al comienzo pero debe tener un break para que salga del switch,default es opcional, puede no estar
                System.out.println("no se encontró valor");
//                break;
            case 1:
                System.out.println("es uno");//no son obligatorios los break, pero entrara a los demas case
            case 2:
                System.out.println("2");
            case 0:
                System.out.println("0");
                break;
        }
    }
    public void condicion2(){
        //valor solo puede ser byte, Byte,short,Short, Char, Character,int,Integer,enum,string, y "var" solo si toma el tipo de los anteriores en la lista
        switch (valor){}//es valido
    }

    // los case deben ser del mismo tipo de dato de la variable del switch, esto es:
    //Literales, Enums, Variables constantes(final e inicializado)
    final int getNum(){return 4;}
    public void condicion3(){
        final int ban=1;
        int app=2;
        int valor2=3;
        final int num=getNum();
        switch (valor2){
            case ban:
                break;
//            case app: //no es final, no compila
//                break;
//            case getNum()://no compila porque el valor aun se define en tiempo de ejecucion
//                break;
//            case num://no compila porque depende del anterior
//                break;
            case 3*5://si compila, es literal
        }
        String prueba="valorcio";
        switch (prueba){
            case "valor":
                break;
//            case DayOfWeek.SUNDAY: //no compila, no es un String es DayOfWeek
//                break;
//            case 5://no compila, no es del mismo tipo que la variable del switch
//                break;
        }
    }

    public void condicion4(){
        short size=7;
        final int samll=4;
        final int big=1______00000_0;
        switch (size){
            case samll: //si compila porque el valor samll cabe en short
            case 1+2: //si compila cabe en short
            case 32767:
//            case 32768:    //32768 no cabe en short, el valor maximo es 32767 y el minimo -32768
            case (short) 32768: //si compila
//            case big:   //no compila porque el valor de  big es mucho mas grande que short
        }
    }
}
