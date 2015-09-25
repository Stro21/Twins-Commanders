/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

/**
 *
 * @author Eduardo Straub
 */
public class BaseItem {

    private String name;
    private String description;
    private int itemID;
    private Item_Type item_Type;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the itemID
     */
    public int getItemID() {
        return itemID;
    }

    /**
     * @param itemID the itemID to set
     */
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    /**
     * @return the item_Type
     */
    public Item_Type getItem_Type() {
        return item_Type;
    }

    /**
     * @param item_Type the item_Type to set
     */
    public void setItem_Type(Item_Type item_Type) {
        this.item_Type = item_Type;
    }
}
