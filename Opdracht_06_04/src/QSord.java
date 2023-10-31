import java.util.ArrayList;
import java.util.List;

public class QSord {
    public QSord(){}

    public static <T extends Comparable<T>> List<T> quickSort(List<T> list){
        if(list == null || list.size() <= 1){
            return list;
        }

        T middle = list.get(list.size()/2);
        List<T> lessThan = new ArrayList<>();
        List<T> moreThan = new ArrayList<>();
        List<T> equal = new ArrayList<>();
        for (T item : list){
            int cmp = middle.compareTo(item);
            if (cmp < 0){
                lessThan.add(item);
            } else if (cmp > 0){
                moreThan.add(item);
            } else {
                equal.add(item);
            }
        }
        List<T> result = new ArrayList<>();
        result.addAll(quickSort(moreThan));
        result.addAll(equal);
        result.addAll(quickSort(lessThan));

        return result;
    }

    /**
     * Main provided for testing by chatGPT
     */
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(6);
        integerList.add(8);
        integerList.add(10);
        integerList.add(1);
        integerList.add(2);

        List<Integer> sortedIntegerList = quickSort(integerList);
        System.out.println("Sorted Integer List: " + sortedIntegerList);

        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("banana");
        stringList.add("grape");
        stringList.add("cherry");

        List<String> sortedStringList = quickSort(stringList);
        System.out.println("Sorted String List: " + sortedStringList);
    }
}
