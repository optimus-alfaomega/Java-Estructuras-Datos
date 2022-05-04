import java.util.*;

public class Ejemplo1Funcional {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(18, 6, 4, 15, 55, 78, 12, 9, 8);
        
        long contador = numeros.stream().filter(n->n > 10).count();
        System.out.println(contador);
    }
}