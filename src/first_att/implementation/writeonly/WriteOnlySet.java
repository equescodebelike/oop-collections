package first_att.implementation.writeonly;

import first_att.interfaces.SetExample;

import java.util.Set;

/**
 * Created by korobov_a_e on 24.09.2022.
 */
public class WriteOnlySet<T> implements SetExample<T> {

    private final Set<T> original;

    public WriteOnlySet(Set<T> set) {
        original = set;
    }

    @Override
    public int size() {
        return original.size();
    }

    @Override
    public boolean isEmpty() {
        return original.size() != 0;
    }

    @Override
    public boolean contains(Object o) {
        throw new RuntimeException("You can't read elements in writeonly set");
    }

    @Override
    public boolean add(T e) {
        return original.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return original.remove(o);
    }

    @Override
    public void clear() {
        original.clear();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}