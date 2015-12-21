package com.alexander.syndicatefighter;

import com.alexander.syndicatefighter.Item.Contract.Contract;
import com.alexander.syndicatefighter.Item.Contract.RestrictedContract;
import com.alexander.syndicatefighter.Item.Item;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by mohi7253 on 11/18/2015.
 */
public class BackpackTest {
    Backpack backpack;
    Contract contract;

    @Before
    public void setUp() throws Exception {
        backpack = new Backpack();
        contract = new RestrictedContract();
        backpack.addItem(contract);
        backpack.addItem(contract);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testUseItem() throws Exception {
        backpack.useItem(contract);
        Map<Item, Integer> itemsInBackpack = backpack.getItems();
        assertEquals((Integer)1, itemsInBackpack.get(contract));
        backpack.useItem(contract);
        itemsInBackpack = backpack.getItems();
        assertEquals(false, itemsInBackpack.containsKey(contract));
    }

    @Test
    public void testAddItem() throws Exception {
        backpack.addItem(contract);
        Map<Item, Integer> itemsInBackpack = backpack.getItems();
        assertEquals((Integer)3, itemsInBackpack.get(contract));
    }

    @Test
    public void testRecycleItem() throws Exception {
        backpack.recycleItem(contract);
        Map<Item, Integer> itemsInBackpack = backpack.getItems();
        assertEquals((Integer)1, itemsInBackpack.get(contract));
    }

    @Test
    public void testSearchItem() throws Exception {

    }

    @Test
    public void testListItem() throws Exception {

    }
}
