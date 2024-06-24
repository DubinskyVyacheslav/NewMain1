package homework7;



import java.util.Collection;


public class MyArrayList<T> implements MyList<T> {

    private final int DefaultLength = 10;
    private Object[] array = new Object[DefaultLength];
    private int size;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {

        boolean a = false;

        if (size == 0) {

            a = true;
        } else if (size != 0) {

            a = false;

        }

        return a;

    }

    @Override
    public boolean contains(Object value) {

        boolean a = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                a = true;
                break;
            } else {
                a = false;
            }
        }
        return a;
    }

    @Override
    public void add(T value) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == null) {
                array[i] = value;
                size++;
                break;
            }
        }

        if (size > array.length) {

            // Должен работать, но не работает((((
            Object[] updatedArray = new Object[array.length + array.length / 2];
            System.arraycopy(array, 0, updatedArray, 0, size);
            array = updatedArray;
        }

    }

    @Override
    public void add(int index, T value) {

        // Я забыл как перебрать массив
        // И через copy пытался
        // Зашёл в тупик полный!((

//        Object[] firstCopy=new Object[index];
//
//        for (int i = 0; i<index;i++ ) {
//
//            firstCopy[i]=array[i];
//
//        }
//
//        firstCopy[index]=value;
//
//        Object[] secondCopy =new Object[index];
//
//        for (int i = index; i<size;i++ ) {
//
//            secondCopy[i]=array[i];
//
//        }
//
//        if (size > array.length) {
//            Object[] updatedArray = new Object[array.length + array.length / 2];
//            System.arraycopy(array, 0, updatedArray, 0, size);
//            array = updatedArray;
//        }
    }

    @Override
    public boolean remove(Object value) {

        // Забил так как перебор сверху не смог оформить ((
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> value) {

        Object[] arrayList = value.toArray();
        Object[] resultArray = new Object[array.length + arrayList.length];

        for (int i = 0; i < array.length; i++) {
            resultArray[i] = array[i];
            resultArray[i + array.length] = arrayList[i];
        }

        array=resultArray;

        return false;
    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public T remove(int index) {

        // Забил так как перебор сверху не смог оформить ((
        return null;
    }

    @Override
    public void set(int index, T value) {

        array[index] = value;

    }

    @Override
    public int indexOf(Object value) {

        int a = 0;

        for (int i = 0; i < size; i++) {

            if (array[i] == value) {
                a = 1;
                break;
            }
            else if (array[i] != value) {
                a = -1;
            }
        }
        return a;
    }
}
