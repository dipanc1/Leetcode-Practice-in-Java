//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Random;
//
//class RandomizedSet {
//
//    Map<Integer, Integer> integerMap;
//    ArrayList<Integer> arrayList;
//    Random random;
//
//    public RandomizedSet() {
//        integerMap = new HashMap<>();
//        arrayList = new ArrayList<>();
//        random = new Random();
//    }
//
//    public boolean insert(int val) {
//        if (integerMap.containsKey(val)) return false;
//
//        integerMap.put(val, arrayList.size());
//        arrayList.add(val);
//        return true;
//
//    }
//
//    public boolean remove(int val) {
//        if (!integerMap.containsKey(val)) {
//            return false;
//        }
//        int len = integerMap.get(val);
//        if (len < arrayList.size() - 1) {
//            int temp = arrayList.get(arrayList.size() - 1);
//            arrayList.set(len, temp);
//            integerMap.put(temp, len);
//        }
//        integerMap.remove(val);
//        arrayList.remove(arrayList.size() - 1);
//        return true;
//    }
//
//    public int getRandom() {
//        int id = random.nextInt(arrayList.size());
//        return arrayList.get(id);
//    }
//}
//
///**
// * Your RandomizedSet object will be instantiated and called as such:
// * RandomizedSet obj = new RandomizedSet();
// * boolean param_1 = obj.insert(val);
// * boolean param_2 = obj.remove(val);
// * int param_3 = obj.getRandom();
// */


import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class RandomizedSet {

    Set<Integer> integerSet;
    Random random;

    public RandomizedSet() {
        integerSet = new HashSet<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (integerSet.contains(val)) return false;
        integerSet.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!integerSet.contains(val)) return false;
        integerSet.remove(val);
        return true;
    }

    public int getRandom() {
        Integer[] array = integerSet.toArray(new Integer[integerSet.size()]);
        return array[random.nextInt(integerSet.size())];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */