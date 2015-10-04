/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Expendables;

import Items.BaseItem;
import Items.BaseItem;
import Expendables.ExpendablesTypes;

/**
 *
 * @author Eduardo Straub
 */
public class BaseExpendables extends BaseItem {

    private ExpendablesTypes expendables_types;

    /**
     * @return the expendables_types
     */
    public ExpendablesTypes getExpendables_types() {
        return expendables_types;
    }

    /**
     * @param expendables_types the expendables_types to set
     */
    public void setExpendables_types(ExpendablesTypes expendables_types) {
        this.expendables_types = expendables_types;
    }
}
