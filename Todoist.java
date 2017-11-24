// para importar una clase que no eata en el paquete basico de java
import java.util.ArrayList;

/**
 *Clase que permite almacenar las tareas que tenemos por hacer
 */
public class Todoist
{
    // array que almacena tareas

    private ArrayList<String> tareas;

    /**
     * Constructor for objects of class Todoist
     */
    public Todoist()
    {
        // crear un nuevo arraylist llamado tareas sobre la misma variable tareas y no una nueva 
        tareas = new ArrayList<String>();
    }

    /**
     * metodo para añadir tareas
     */
    public void addTarea(String nombreTarea){
        // metodo add para añadir al array elementos
        tareas.add(nombreTarea);
    }

    /**
     * metodo para mostrar por pantalla las tareas si tienen algo en la tarea
     */
    public void mostrarTareas()
    {
        System.out.println("Las Tareas Existentes son: ");  
        //muestra por pantalla las tareas
        System.out.println( tareas );              
    }

    /**
     * metodo que devuelve el numero de tareas pendientes
     */
    public int getNumeroDeTareas(){
        //el metodo size devuelve el numero de elementos del arraylist
        return tareas.size();
    }

    /**
     * imprime por pantalla el numero de tareas pendientes
     */
    public void mostrarNumeroDeTareasPendientes(){
        System.out.println("Tienes estas tareas pendientes; "+tareas.size());
    }

    /**
     * borrar la tarea que ocupa la posicion indicada como
     * un parametro empezando en 0
     * --
     * cambiamos el tipo de dato de void a boolean y 
     * si es true si elmina ina tarea y false en caso contrario
     */
    public boolean eliminarTareaSeleccionada(int posicionTarea){
        //definir una variable local del tipo de elemento que devuelve el dato en la primera linea en la seguna la devolvemosii        
        //boolean valorADevolver =  false;
        //if(esValidoElIndice(posicionTarea)){
        //    tareas.remove(posicionTarea);
        //    valorADevolver = true;
        //}
        //return valorADevolver;
        if (esValidoElIndice(posicionTarea)){
            tareas.remove(posicionTarea);
        }
        return esValidoElIndice(posicionTarea);
    }

    /**
     * Metodo que comprueba si una posicion es valida y devuelve
     * true en caso afirmativo o false en otro caso
     */
    public boolean esValidoElIndice(int indice){
        //boolean valorADevolver = false; 
        //if(indice >= 0 && indice < tareas.size()){
        //    valorADevolver = true; 
        //}
        //return valorADevolver;
        return (indice >= 0 && indice < tareas.size());
    }

    /**
     * metodo que devuelve true en caso de que haya tareas por hacer, false en otro caso
     */
    public boolean hayTareasPendienes(){
        //boolean tareasPendientes = false;
        //if(tareas.size()>0){
        //    System.out.println("Quedan tareas pendienes");
        //    tareasPendientes= true;
        //}
        //return tareasPendientes;
        // return (mostrarNumeroDeTareasPendientes()>o);
        // metodo que devuelve true si quedan tareas
        return !tareas.isEmpty();
    }
}
