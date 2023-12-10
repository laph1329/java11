package clase002;
/**
 * Conflicto de nombres
 */

//import java.util.Date;en cojunto hay error, es ambiguo
//import java.sql.Date;en cojunto hay error, es ambiguo

//import java.util.Date; esto en conjunto si los permite, ya que toma el que es mas especifico
//import java.sql.*; esto en conjunto si los permite, ya que toma el que es mas especifico

public class Conflictos {
    java.util.Date date;
}
