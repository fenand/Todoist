
import java.util.ArrayList;

public class Test
{
    /**
     * Metodo principal
     */
    public static void main(String[] args) 
    {
     System.out.println("Creamos un objeto todoist...");
        Todoist2 todoist = new Todoist2();
        
        System.out.println("\nMostramos el numero de tareas pendientes...");
        todoist.mostrarNumeroDeTareasPendientes();
        
        System.out.println("\nAñadimos una tarea...");
        todoist.addTarea("Limpiar la cocina");
        
        System.out.println("\nAñadimos otra tarea...");
        todoist.addTarea("Sacar la basura");
        
        System.out.println("\nAñadimos otra tarea...");
        todoist.addTarea("Dormir la siesta");
        
        System.out.println("\nMostramos todas las tareas...");
        todoist.mostrarTareas();
        
        System.out.println("\nEliminamos la segunda tarea...");
        boolean valorADevolver;
        valorADevolver =todoist.eliminarTareaSeleccionada(1);
        
        System.out.println("\nEliminamos la tarea...");
        System.out.println(valorADevolver);
        
        System.out.println("\nMostramos todas las tareas...");
        todoist.mostrarTareas(); 
        
        System.out.println("\nIntentamos borrar una tarea que no existe...");
        todoist.eliminarTareaSeleccionada(1582);
        System.out.println("\nEliminamos la tarea...");
        System.out.println(valorADevolver);
        
        System.out.println("\nMostramos todas las tareas...");
        
    }

}
