package com.alexander.syndicatefighter;

import java.util.List;

/**
 * Created by mohi7253 on 11/18/2015.
 */
public class Backpack {
    private List<Item> items;
    private List<Integer> itemCount;

    public Backpack() {

    }

    public void useItem(int indexOfItems) throws Exception {

    }

    public int addItem(Item item) throws Exception {
        return items.indexOf(item);
    }

    public void recycleItem(int indexOfItems) throws Exception {

    }

   /* public int searchItem(Item item) throws Exception {
        return item.index;
    }*/

    public Item listItem(Item item) throws Exception {

            //return this.items, this.count to peek in the backpack
    }

    //Methods to implement later: storeToJSON() : void

}
