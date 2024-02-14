package clase011.para;

public class Para {
    void prueba(){
        for(int i=0;i<4;i++)
            System.out.println(i);
//        System.out.println(1+i);//no compila este i esta fuera del scope del for
        for(var i=0;i<4;i++)
            System.out.println(i);
        for(int i=0;i<4;++i)
            System.out.println(i);
//        for(;;){//for infinito, y nunca se ejecuta lo que esta despues de este for( si compila)
//            System.out.println("loop infinito");}

        int x=0;
        for(long y=0,z=4;x<5 && y<10;x++,y++){
            System.out.println(x+y);
        }
        System.out.println(x);

//        int y=0;
//        for(int y=0;y<5;++y)//no compila doble declaracion
//            System.out.println(y);

        int y=0;
        for(y=0;y<5;++y)//si compila, solo una declaracion
            System.out.println(y);


//        for(int j=0, long k=0;x<50;x++)//no compila no se pueden declarar 2 variables de distinto tipo(int, long)

        for(int z=0;z<5;z++)
            z--;//for infinito
        for(int z=0;z<5;z++)
            z=0;//for infinito
        for(int z=0;z<5;)
            z++;//valido

    }
}
