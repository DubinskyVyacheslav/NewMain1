package homework7;

import java.util.Collection;
import java.util.List;

public interface MyList<T> {

    int size(); //количество элементов в коллекции.

    boolean isEmpty(); // проверяет на наличие элементов

    boolean contains(Object value); // проверяет содержится ли элемент.

    void add(T value); // добавляет элемент в конец списка.

    void add(int index, T value); // добавляет в список по индексу index объект value

    boolean remove(Object value); // удаляет элемент по элементу.

    boolean addAll(Collection<? extends T> value); // добавляет элементы одной коллекции в конец другой.

    T get(int index); // возвращает объект из списка по индексу index

    T remove(int index); // удаляет элемент по индексу index, возвращает при этом удалённый объект.

    void set(int index, T value); // присваивает значение объекта value элементу, который находиться по индексу index.

    int indexOf(Object value); // возвращает индекс первого вхождения объекта value в список. Если объект не найден вернуть -1;


}
