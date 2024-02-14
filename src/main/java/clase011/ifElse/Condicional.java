package clase011.ifElse;

public class Condicional {
    private int numPrueba=5;
    public void condicion(){
        if(numPrueba<6)
            System.out.println("es menor que 6");
            System.out.println("siempre se imprime, no pertenece al if");
    }
    public void condicion2(){
        numPrueba=9;
        if(numPrueba<15){
            System.out.println("menor que 15");
        } else if (numPrueba<10) {
            System.out.println("menor que 11");//unrechable code
        }else {
            System.out.println("mayor que 15");
        }

//        if(numPrueba=9) cuidado!!! no compila
    }
}
