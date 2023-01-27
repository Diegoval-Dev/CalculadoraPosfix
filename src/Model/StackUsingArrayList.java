package Model;
import java.util.ArrayList;
public class StackUsingArrayList<T> implements IStack{

    private ArrayList<T> miListaInterna;

    public StackUsingArrayList() {
        miListaInterna = new ArrayList<T>();
    }

    @Override
    public int count() {
        return miListaInterna.size();
    }

    @Override
    public boolean isEmpty() {
        return miListaInterna.isEmpty();
    }

    @Override
    public void push(Object value) {
        miListaInterna.add(0, (T) value);
    }

    @Override
    public T pull() {
        return miListaInterna.remove(0);
    }

    @Override
    public T peek() {
        return miListaInterna.get(0);
    }
}
