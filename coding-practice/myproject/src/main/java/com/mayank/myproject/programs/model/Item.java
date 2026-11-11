package com.mayank.myproject.programs.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Item {
    int id;
    String name;
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
