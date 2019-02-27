package rocks.zipcode.assessment2.collections.inventory;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.assessment2.collections.Inventory;

public class UnlistItem {
    @Test
    public void test1() {
        String itemToBeCleared = "Football";
        String[] itemsTobeAdded = {"Baseball", "Baseball", "Basketball", itemToBeCleared};
        test(itemsTobeAdded, itemToBeCleared);
    }


    @Test
    public void test2() {
        String itemToBeCleared = "Baseball";
        String[] itemsTobeAdded = {itemToBeCleared, itemToBeCleared, "Basketball", "Football"};
        test(itemsTobeAdded, itemToBeCleared);
    }

    @Test
    public void test3() {
        String itemToBeCleared = "Basketball";
        String[] itemsTobeAdded = {"Baseball", "Baseball", itemToBeCleared, "Football"};
        test(itemsTobeAdded, itemToBeCleared);
    }



    private void test(String[] itemsToAddToInventory, String itemToRemove) {
        // given
        int expected = 0;
        Inventory inventory = new Inventory();
        for (String item : itemsToAddToInventory) {
            inventory.addItemToInventory(item);
        }

        // when
        inventory.unlistItem(itemToRemove);
        int actual = inventory.getItemQuantity(itemToRemove);

        // then
        Assert.assertEquals(expected, actual);
    }


}
