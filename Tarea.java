
/**
 * Crea un objeto que almacena una tarea y su estado (completada o no).
 * 
 * @author 1ºDAM 2017/2018
 * @version 10/11/2018
 */
public class Tarea 
{
    private String descripcion;
    // El estado de la tarea: True: Completada; False: No Completada. 
    private boolean estado;
    // La prioridad de la tarea.
    private int prioridad;
    /**
     * Constructor de la clase Tarea.
     * @param descripcion La descripción de la tarea
     * Sergio
     */
    public Tarea(String descripcion)
    {
        this.descripcion = descripcion;
        estado = false;
        prioridad = 1;
    }

    /**
     * Devuelve si el estado es true o false.
     */
    public boolean getEstado()
    {
        return estado;  
    }

    /**
     * Devuelve la descripción de la tarea.
     */
    public String getDescripcion()
    {
        return descripcion;
    }

    /**
     * Devuelve toda la informacion de la tarea en formato String
     */
    public String getDatosTarea()
    {
        String aDevolver = prioridad + ". " + descripcion;
        if (estado) {
            aDevolver = "[X] " + aDevolver;
        }
        else {
            aDevolver = "[ ] " + aDevolver;
        }
        return aDevolver; 
    }    
    
    /**
     * Metodos setter
     * Javier y Jorge
     */
    public void tareaCompletada() {
        estado = true;
    }
    
    /**
     * Cambia la prioridad de la tarea seleccionada.
     */
    public void prioridadTarea(int nuevaPrioridad)
    {
        prioridad = nuevaPrioridad;
    }  
}
