package com.alexander.syndicatefighter;

import java.util.*;

/**
* Created by mohi7253 on 11/18/2015.
*/
public class Backpack {
    //private List<Item> items;
    //private List<Integer> itemCount;

    private String itemName;
    private int itemCount;
    private Map<Item, Integer> items = new HashMap<Item, Integer>();

    // Associative Arrays:

    public Backpack() {

    }

    public void useItem(Item item) throws Exception {
        items.remove(item);
        //decrease count by 1
    }

    public void addItem(Item item) throws Exception {
        items.put(item, itemCount + 1);
    }

    public void recycleItem(Item item) throws Exception {
        items.remove(item);
        //decrease itemCount by 1
        //increase power
    }

   /* public int searchItem(Item item) throws Exception {
        return item.index;
    }*/

    public Item listItem(Item item) throws Exception {
            //return this.items, this.count to peek in the backpack
    }

    //Methods to implement later: storeToJSON() : void

}
