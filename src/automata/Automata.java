package automata;
import java.util.Scanner;
public class Automata {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        clsDT obj = new clsDT();
        System.out.println("Escribir una palabra: ");
        String cad = leer.next();
        boolean sw = obj.aceptaCadena(cad);
        System.out.println("Cadena aceptada? "+sw);
    }
    
}
