package Model;
import java.util.ArrayList;
public class StackUsingArrayList<T> implements IStack{

    private ArrayList<T> miListaInterna;

    /**
     * Constructor
     */
    public StackUsingArrayList() {
        miListaInterna = new ArrayList<T>();
    }

    /**
     * Contar la cantidad de elementos del stack
     * @return Cantidad de elementos del stack
     */
    @Override
    public int count() {
        return miListaInterna.size();
    }

    /**
     * Evaluar si el stack esta vacio o no
     * @return si esta vacio o no
     */
    @Override
    public boolean isEmpty() {
        return miListaInterna.isEmpty();
    }

    /**
     * Agregar objeto al stack
     * @param value objeto a agregar al stack
     */
    @Override
    public void push(Object value) {
        miListaInterna.add(0, (T) value);
    }

    /**
     * Extrae el primer elemento del stack
     * @return elemento extraido del stack
     */
    @Override
    public T pull() {
        return miListaInterna.remove(0);
    }

    /**
     * Visualiza el primer elemento del stack
     * @return
     */
    @Override
    public T peek() {
        return miListaInterna.get(0);
    }
}
