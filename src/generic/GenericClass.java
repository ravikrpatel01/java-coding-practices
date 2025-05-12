package generic;

public class GenericClass<T> {
    T val;
    public GenericClass(T val) {
        this.val = val;
    }
    public T getValue() {
        return this.val;
    }
}
