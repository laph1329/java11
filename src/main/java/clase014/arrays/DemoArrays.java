package clase014.arrays;

public class DemoArrays {
    public static void main(String[] args) {
        //no se puede redimensionar en este caso su dimension sera 3
        int[] list= new int[3];//los valores por defecto son 0
        for (var i:list) {
            System.out.println(i);
        }
        String list2[]= new String[3];//los valores por defecto son null
        for (var i:list2) {
            System.out.println(i);
        }
        boolean [] list3= new boolean[3];//los valores por defecto son false
        for (var i:list3) {
            System.out.println(i);
        }
        char   []list4aux= new char[3];//los valores por defecto son "cero con raya diagonal"
        for (var i:list4aux) {
            System.out.println(i);
        }

        char list4  []= new char[]{'a','b'};//los valores por defecto son false
//        char[] list4= new char[2]{'a','b'}//da error de compilacion, no va el 2
        for (var i:list4) {
            System.out.println(i);
        }

        //array anonimo
        int [] list5={1,2,3};
        for(var i:list5){
            System.out.println(i);
        }

        int id[];//valido
        int[] ids, edades;//ambos son arrays
        int ides[], edadess;//solo ides es array,edadess es int
    }
}
