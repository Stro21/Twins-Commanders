/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Accesories;

import Accesories.AccesoriesTypes;
import Items.BaseItem;

/**
 *
 * @author Eduardo Straub
 */
public class BaseAccesories extends BaseItem {
    private AccesoriesTypes accesories_types;

    /**
     * @return the accesories_types
     */
    public AccesoriesTypes getAccesories_types() {
        return accesories_types;
    }

    /**
     * @param accesories_types the accesories_types to set
     */
    public void setAccesories_types(AccesoriesTypes accesories_types) {
        this.accesories_types = accesories_types;
    }
}
