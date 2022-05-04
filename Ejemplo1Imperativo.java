import java.util.*;

public class Ejemplo1Imperativo {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(18, 6, 4, 15, 55, 78, 12, 9, 8);
        
        int contador = 0;
        for(int numero : numeros) {
            if(numero > 10) {
                contador ++;
            }
        }
        System.out.println(contador);
    }
}