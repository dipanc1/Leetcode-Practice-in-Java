import java.util.ArrayList;
import java.util.List;

class MyHashSet {
    List<Integer> list;

    public MyHashSet() {
        list = new ArrayList<Integer>();
    }

    public void add(int key) {
        if (!list.contains(key)) list.add(key);
    }

    public void remove(int key) {
        Integer k = key;
        list.remove(k);
    }

    public boolean contains(int key) {
        return list.contains(key);
    }
}
public class design_hashset {
    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();
    }
}
