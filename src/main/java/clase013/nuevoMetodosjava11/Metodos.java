package clase013.nuevoMetodosjava11;

public class Metodos {
    public static void main(String[] args) {
        System.out.println("    ab c ".strip());//nuevo desde java11, hace lo mismo que trim quitas espacios en blanco solo de los lados
        System.out.println("    ab c ".trim());//existe antes de java11
        System.out.println("    ab c ".length());
        System.out.println("    ab c ".strip().length());
        //Strip soporta unicode
        System.out.println("    a\u2000bc\u2000".strip());// solo borra los \u2000 de los lados, no los del medio del string
        System.out.println("    a\u2000bc\u2000".trim());// \u2000 es espacio en blanco en unicode, el trim no lo borra, strip sí
        System.out.println("    abc\u2000".strip().length());
        System.out.println("    abc\u2000".trim().length());

        System.out.println("\n    ab c \t ".trim().length());
        System.out.println("\n    ab c \t ".strip().length());
        System.out.println("\n    ab c \t ".stripLeading().length());//borra el lado del comienzo
        System.out.println("\n    ab c \t ".stripTrailing().length());//borra el lado del final


    }
}
