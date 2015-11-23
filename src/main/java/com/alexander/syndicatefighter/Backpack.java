package com.alexander.syndicatefighter;

import java.util.*;

/**
* Created by mohi7253 on 11/18/2015.
*/
public class Backpack {

    private Map<Item, Integer> items = new HashMap<Item, Integer>();

    public Backpack() {

    }

    public void useItem(Item item) throws Exception {
        int countOfItem = items.get(item);
        if (countOfItem == 1) {
            items.remove(item);
        } else {
            items.put(item, (countOfItem -1));
        }
    }

    public void addItem(Item item) throws Exception {
        int countOfItem = items.get(item);
        items.put(item, countOfItem + 1);
    }

    public void recycleItem(Item item) throws Exception {
        items.remove(item);
    }

    public List<String> listItem(Item item) throws Exception {

        List<String> allItems = new ArrayList<String>();

        for (Map.Entry<Item, Integer> entry : this.items.entrySet()) {
            allItems.add("Item: " + entry.getKey().getName() + ", Count: " + entry.getValue().toString());
        }
        return allItems;
    }

    //Methods to implement later: storeToJSON() : void

}
