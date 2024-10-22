package set;

public class MyHashSetV3Main {

    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>(10);
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

        String searchValue = "A";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);


        MySet<Integer> integerSet = new MyHashSetV3<>(10);
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);

        System.out.println(set);

        Integer value = 3;
        boolean result1 = integerSet.contains(value);
        System.out.println("set.contains(" + value + ") = " + result1);
    }
}
