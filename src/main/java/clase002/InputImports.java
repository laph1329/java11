package clase002;
/**
 * Redundancia
 */

import java.nio.file.*;
//import java.nio.file.*;//redundancia
//import java.nio.file.*;//redundancia
//import java.nio.*.*; no se puede hacer esto
//import java.nio.file.Paths.*; //no se puede importar metodos, valido y no afecta el codigo

public class InputImports {
    public void read(Files files){
        Paths.get("name");
    }
}
