import java.util.ArrayList;
/** 
 * Cabecera: luis
 * Atributos: Gian carlo
 * Constructor: Aitor
 * mostrarTareasNumeradas: Samuel
 * agregarTarea: Omar
 * marcarTareaComoCompletada: Cristian
 **/

public class Todoist2{
    private ArrayList<Tarea> listaDeTareas;
    /**
     * Constructor de la clase Todoist2
     */
    public Todoist2(){
        listaDeTareas = new ArrayList<Tarea>();
    }

    /**
     * Mostrar tareas numeradas
     */
    public void mostrarTareasNumeradas()
    {
        int posicionTareaActual = 0;
        while (posicionTareaActual < listaDeTareas.size()) {
            System.out.println((posicionTareaActual+1) + ". " + listaDeTareas.get(posicionTareaActual).getDatosTarea());
            posicionTareaActual++;
        }
    }

    /**
     * Añade una tarea
     */
    public void addTarea(String tarea)
    {
        Tarea nuevaTarea = new Tarea(tarea);
        listaDeTareas.add(nuevaTarea);

    }

    /**
     * Marca como completada la tarea indicada como parametro. Por ejemplo,
     * si el parámetro es 0 marca como completada la primera tarea, si es 1 la
     * segunda, etc.
     */
    public void marcarComoCompletada(int indiceTarea)
    {
        Tarea tareaActual = listaDeTareas.get(indiceTarea);
        tareaActual.tareaCompletada();
        listaDeTareas.set(indiceTarea, tareaActual);
    }
    
    public void cambiarPrioridadTarea(int indiceTarea, int numPrioridad)
    {
        if (listaDeTareas.size() > indiceTarea && indiceTarea>=0) {
            Tarea tareaActual = listaDeTareas.get(indiceTarea);
            tareaActual.prioridadTarea(numPrioridad);
            listaDeTareas.set(indiceTarea, tareaActual);    
        }
    }
    
    /**
     * Imprime todos los datos de la tarea con mayor prioridad. Si hay empate,
     * imprime la última encontrada. Si no hay tareas no imprime nada.
     */
    public void tareaDeMayorPrioridad()
    {
        if (listaDeTareas.size() > 0) {   
            Tarea tareaPrioridadMaxima = listaDeTareas.get(0);
            int prioridadMaxima = 0;        
            for (Tarea tareaActual: listaDeTareas) {
                if (tareaActual.getPrioridad() >= prioridadMaxima) {
                    tareaPrioridadMaxima = tareaActual;
                    prioridadMaxima = tareaActual.getPrioridad();
                }
                System.out.println(tareaPrioridadMaxima.getDatosTarea());            
            }
        }
    }
    
    public void estadisticaTareas()
    {
        int totalTareas = listaDeTareas.size();
        int totalTareasHechas = 2; 
    }
}
