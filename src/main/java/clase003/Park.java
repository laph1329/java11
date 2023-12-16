package clase003;

public class Park {
    public Park(){
        name="Luis";
    }


    {//solo en este caso de "ERROR"" cuando la declaracion esta despues del inicializador de instancia y
        //se quiere usar la variable "name"

//        System.out.println("desde el inicializador de instancias "+name);
    }
    {//el inicializador de instancia debe estar luego de las declaraciones de las variables
        //se ejecuta antes que el constructor
        name="Lu";
    }
    String name="L";

    public static void main(String[] args) {
        Park p= new Park();
        System.out.println(p.name);
    }
}
