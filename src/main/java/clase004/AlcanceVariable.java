package clase004;

public class AlcanceVariable {
    public void metodo(boolean valor){
        if(valor){
            int a=1;
            {
                var valor1=true;
                System.out.println(valor1);
            }
//            System.out.println(valor1);//da error ya que el scope de valor1 es dentro de las llaves
        }
//        System.out.println(a);//da error ya que el scope del a es dentro del if, no se puede usar fuera
    }

}
