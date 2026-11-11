package concurrency;

public class Item {
    private final int id;
    private final String name;
    static int count = 0;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Item createItem() {
        count++;
        return new Item(count, "Dummy_" + count);
    }

}
