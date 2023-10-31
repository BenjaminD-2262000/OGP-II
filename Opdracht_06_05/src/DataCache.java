import java.util.ArrayList;

public class DataCache<K, V> {
    ArrayList<K> keyList;
    ArrayList<V> valueList;
    int numbItems = 0;

    public DataCache() {
    keyList = new ArrayList<>();
    valueList = new ArrayList<>();
    }

    public void put(K key, V value) throws Exception{
        if(keyList.contains(key)){
            throw new Exception("Key already in use");
        }
        keyList.add(key);
        valueList.add(value);
        ++numbItems;
    }

    public V get(K key) throws Exception{
        int index = 0;
        while(keyList.get(index) != key || numbItems <= index){
            ++index;
        }
        if (numbItems <= index){
            throw new Exception("key not in use");
        }
        return valueList.get(index);
    }

    public void remove(K key) throws Exception{
        int index = 0;
        while(keyList.get(index) != key || numbItems <= index){
            ++index;
        }
        if (numbItems <= index){
            throw new Exception("key not in use");
        }
        keyList.remove(index);
        valueList.remove(index);
    }
}
