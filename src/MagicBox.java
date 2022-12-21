import java.util.Random;

public class MagicBox<T> {
    int objectCount;
    T[] items;

    public MagicBox(int objectCount) {
        this.objectCount = objectCount;
        items = (T[]) new Object[objectCount];
    }

    public boolean add(T newItem) {
        for (int i = 0; i < objectCount; i++) {
            if(items[i] == null){
                items[i] = newItem;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        for (int i = 0; i < objectCount; i++) {
            if (items[i] == null) {
                throw new RuntimeException("коробка не полна и осталось ещё " + (objectCount - 1) + " ячеек заполнить");
            }
        }

        Random random = new Random();
        int randomInt = random.nextInt(objectCount);
        return items[randomInt];
    }
}
