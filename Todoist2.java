// para importar una clase que no eata en el paquete basico de java
import java.util.ArrayList;

/**
 *Clase que permite almacenar las tareas que tenemos por hacer
 */
public class Todoist2
{
    // array que almacena tareas

    private ArrayList<String> tareas;

    /**
     * Constructor for objects of class Todoist
     */
    public Todoist2()
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

    /** 
     * Metodo que imprime todas las tareas existentes, una por linea.
     * El metodo imprime el numero de posicion de la tarea antes del
     * nombre de la tarea.
     */  
    public void mostrarTareasNumeradas(){
        // vamos a usar bucles por primera vez  para imprimir las tareas numeradas
        // bucle for-each
        // declara una variable local de tipo string que es 
        // la variable del bucle y se ejecuta tantas veces como elementos tenga mi arraylist

        int numeroPosicion = 1;
        //tareas dento del bucle es el arraylist (String tarea : tareas)
        for(String tarea : tareas){
            System.out.println(numeroPosicion + ". "+tarea);
            numeroPosicion = numeroPosicion + 1;

        }
    }

    /**
     * Muestra solo las tareas en posiciones impares sin numero delante ni nada,
     * solo la tarea
     */
    //mostrarTareasEnPosicionImpar
    public void mostrarTareasEnPosicionImpar(){

        int numeroPosicion = 0;
        for(String tarea : tareas){
            numeroPosicion = numeroPosicion + 1;
            if (numeroPosicion % 2 != 0 ){
                System.out.println(tarea);
            }
        }
    }

    /**
     * muestra por pantalla todas las tareas que contienen el texto indicado como parametro, 
     * una cada linea y ademas muestra un mensaje al final indicando el numero de conincidencias encontrada.Si no hay ninguna que contenga el texto buscado, ** informa de la situcion,insensible a mayusculas y minusculas
     */
    public void mostrasCoincidentes(String textoABuscar){

        boolean textoConCoincidencias = false;
        int coincidencias = 0;
        for(String tarea : tareas){
            // if(tarea.equals(textoABuscar)){
            // System.out.println(tarea);
            // }

            // equals tiene que ser el mismo texto para que funcione y contains con que contenga algo del texto vale
            //encadenas invocacines de metodos es meter un metodo detras de otro

            if( tarea.toLowerCase().contains( textoABuscar.toLowerCase() ) ){
                System.out.println(tarea);
                textoConCoincidencias = true;
                coincidencias = coincidencias +1;

            }
        }
        if (textoConCoincidencias == false) {
            System.out.println("No se ha encontrado ninguna tarea con el texto buscado!");
        }

        System.out.println("Tienes estas estas coincidencias: "+ coincidencias);
    }

    /**
     * muestra por pantalla la primera tarea que contenga el texto indicado como parametro
     * En caso de que no haya ninguna coincidencia no muestra nada.
     */

    // public void mostrarPrimeraCoincidente(String textoABuscar)
    // {
    // boolean yaSeHaImpresoLaPrimeraTareaCoincidente =  false;  
    // for (String tarea : tareas){
    // if(tarea.toLowerCase().contains(textoABuscar.toLowerCase())){
    // if (!yaSeHaImpresoLaPrimeraTareaCoincidente) {
    // System.out.println(tarea);
    // yaSeHaImpresoLaPrimeraTareaCoincidente = true;
    // }
    // }
    // }
    // }

    public void mostrarPrimeraCoincidente(String textoPrimeroABuscar){
        int coincidencias = 0;
        //bucle for each
        for(String tarea : tareas){

            if( tarea.toLowerCase().contains( textoPrimeroABuscar.toLowerCase() ) ){
                coincidencias = coincidencias +1;
                if (coincidencias ==1 ){
                    System.out.println(tarea);
                }
            }
        }

    }

    /**
     * muestre por pantalla todas las tareas existentes,una por linea.
     * usando un bucle while
     */
    public void mostrarTareas2()
    {
        int posicionTareaActual = 0 ;

        while(posicionTareaActual < tareas.size()){
            System.out.println(tareas.get(posicionTareaActual)); 
            posicionTareaActual ++;
        }
    }

    /**
     * muestra las tareas numeradas usando un buvle while empezando en 1
     */
    public void mostrarTareasNumeradas2(){
        int posicionTareaActual = 0 ;

        while(posicionTareaActual < tareas.size()){

            System.out.println((posicionTareaActual + 1) +" "+ tareas.get(posicionTareaActual)); 
            posicionTareaActual= posicionTareaActual+ 1;
        }
    }

    /**
     * muestra por pantalla las primeras n tareas(siendo n un parametro)
     * en caso de que no haya suficiente tareas muestra solo las que haya
     */

    public void mostrasNPrimeras(int n){
        int posicionTareaActual = 0 ;

        while(posicionTareaActual < n && posicionTareaActual < tareas.size() ){

            System.out.println((posicionTareaActual + 1) +" "+ tareas.get(posicionTareaActual)); 
            posicionTareaActual= posicionTareaActual+ 1;
        }

    }

    /**
     * Devuelve true si hay al menos una tarea que contenga el texto indicado
     * como parámetro y false en caso contrario. El metodo se implementar usando
     * un  bucle for-each
     */
    public boolean hayTareaCoincidente(String textoABuscar)
    {
        boolean aDevolver = false ;
        for(String tarea : tareas){

            if(tarea.toLowerCase().contains(textoABuscar.toLowerCase() ) ){
                aDevolver = true; 

            }

        }
        return aDevolver;
    }

    /**
     * Devuelve true si hay al menos una tarea que contenga el texto indicado
     * como parámetro y false en caso contrario. El metodo se debe ejecutar de la
     * forma mas rapida posible
     */
    public boolean hayTareaCoincidenteEficiente(String textoABuscar)
    {
        boolean hayTareasCoincidentes = false;
        String tarea = "";
        int contador = 0;

        while(contador <tareas.size() && hayTareasCoincidentes == false){
            tarea = tareas.get(contador);

            if(tarea.toLowerCase().contains(textoABuscar.toLowerCase() ) ){
                hayTareasCoincidentes = true; 

            }
            contador ++;
        }
        return hayTareasCoincidentes;

    } 

    /**
     * Elimina la primera tarea que contiene el texto indicado por parámetro
     */
    public void eliminaPrimeraTareaCoincidente(String textoABuscar)
    {
        boolean hayTareasCoincidentes = false;
        String tarea = "";
        int contador = 0;

        while(contador <tareas.size() && hayTareasCoincidentes == false){
            tarea = tareas.get(contador);

            if(tarea.toLowerCase().contains(textoABuscar.toLowerCase() ) ){
                
                tareas.remove(tarea);
                hayTareasCoincidentes = true; 

            }
            contador ++;
        }
    }
}
