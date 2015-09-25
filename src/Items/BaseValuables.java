/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

/**
 *
 * @author Eduardo Straub
 */
public class BaseValuables extends BaseItem {

    private ValuablesTypes value_types;
    private int spellEffectID;

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

    /**
     * @return the spellEffectID
     */
    public int getSpellEffectID() {
        return spellEffectID;
    }

    /**
     * @param spellEffectID the spellEffectID to set
     */
    public void setSpellEffectID(int spellEffectID) {
        this.spellEffectID = spellEffectID;
    }
}
