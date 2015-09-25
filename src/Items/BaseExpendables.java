/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

/**
 *
 * @author Eduardo Straub
 */
public class BaseExpendables extends BaseItem {

    private ExpendablesTypes expendables_types;
    private int spellEffectID;

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
