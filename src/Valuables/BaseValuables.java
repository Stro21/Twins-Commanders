/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Valuables;

import Items.BaseItem;
import Valuables.ValuablesTypes;

/**
 *
 * @author Eduardo Straub
 */
public class BaseValuables extends BaseItem {

    private ValuablesTypes value_types;

    /**
     * @return the value_types
     */
    public ValuablesTypes getValue_types() {
        return value_types;
    }

    /**
     * @param value_types the value_types to set
     */
    public void setValue_types(ValuablesTypes value_types) {
        this.value_types = value_types;
    }
}
