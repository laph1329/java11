package clase002;
/**
 * redundancia
 */

import java.util.Random;
import java.util.*;     // es redundante
import clase002.Animal; // es redundante

public class Main {
    public static void main(String... args){
        Random random= new Random();
        System.out.println(random.nextInt(10));
        Animal animal=new Animal();
        animal.mensaje();
    }
}
