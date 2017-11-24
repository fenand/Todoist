
/**
 *Clase que permite almacenar las tareas que tenemos por hacer
 */
public class Todoist
{
    // primera tarea atributo que permite guardar la primera tarea
    private String tarea0;
    // segundo tarea atributo que permite guardar la segunda tarea
    private String tarea1;
    // tercera tarea atributo que permite guardar la tercera tarea
    private String tarea2;

    /**
     * Constructor for objects of class Todoist
     */
    public Todoist()
    {
        // iniciar los tres atributos con el String vacio 
        tarea0 = null;
        tarea1 = null;
        tarea2 = null;
    }

    /**
     * 
     * Insertar la tarea especiica en la posicion indicada
     */
    public  void addTarea(String nombreTarea, int posicionTarea)
    {
        if(posicionTarea == 0){
            tarea0 = nombreTarea;       
        }
        else if (posicionTarea == 1){
            tarea1 = nombreTarea;
        }
        else if(posicionTarea == 2){
            tarea2 = nombreTarea;    
        }
    }

    public void mostrarTareas()
    {
        System.out.println("Las Tareas Existentes son: ");
        if (tarea0 !=null){
          System.out.println( "Tarea 1: "+tarea0 );              
        } 
        if (tarea1 !=null){
          System.out.println( "Tarea 2: "+tarea1 );              
        }
        if (tarea2 !=null){
          System.out.println( "Tarea 3: "+tarea2 );              
        }
    }
}
