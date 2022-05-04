import java.util.*;
class Persona{
    private String nombre;
    public Persona(String nom){
        nombre=nom;
    }

    public String getNombre(){
        return nombre;
    }
}
public class Ejemplo2Funcional {

   

    public static void main(String[] args) {

        ArrayList<Persona> milista= new ArrayList<Persona>();
        milista.add(new Persona("Mariano"));
        milista.add(new Persona("Sergi"));
        milista.add(new Persona("Laura"));
        milista.add(new Persona("Miguel"));
        Collections.sort(milista,
            (Persona p1,Persona p2)-> p1.getNombre().compareTo(p2.getNombre())
        );
        milista.stream().filter(p -> !p.getNombre().startsWith("M"))
        .forEach(p -> System.out.println(p.getNombre()));
    }
}