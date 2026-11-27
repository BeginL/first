package lt.vcd.homework9;

import java.util.StringJoiner;

public class OMasyvas<T> {
    private final Object[] elements;

    public OMasyvas(int size) {
        elements = new Object[size];
    }
    public void set(int index, T value) throws Exception {
        checkIndex(index);
        elements[index] = value;
    }
    @SuppressWarnings("unchecked")
    public T get(int index) throws Exception {
        checkIndex(index);
        return (T) elements[index];
    }
    private void checkIndex(int index) throws Exception {
        if (index < 0 || index >= elements.length) {
            throw new Exception("Index out of bounds: " + index);
        }
    }
    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ", "[", "]");

        for (int i = 0; i < elements.length; i++) {
            Object value = elements[i];
            String text = String.valueOf(value);

            if (value instanceof String) {
                text = "\"" + text + "\"";
            }
            result.add(i + "=>" + text);
        }
        return result.toString();
    }
}
