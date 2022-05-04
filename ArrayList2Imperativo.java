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
public class Ejemplo2Imperativo {

    public static void main(String[] args) {

        ArrayList<Persona> milista= new ArrayList<Persona>();
        milista.add(new Persona("Mariano"));
        milista.add(new Persona("Sergi"));
        milista.add(new Persona("Laura"));
        milista.add(new Persona("Miguel"));
        Collections.sort(milista,new Comparator<Persona>() {
            public int compare(Persona p1,Persona p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        });
        for (Persona p: milista) {
            if(!p.getNombre().startsWith("M"))
               System.out.println(p.getNombre());
        }
    }
}