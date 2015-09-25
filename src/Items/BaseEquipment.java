/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

/**
 *
 * @author Eduardo Straub
 */
public class BaseEquipment extends BaseStatItem {

    private EquipmentTypes equipment_type;
    private int spellEffectID;

    /**
     * @return the equipment_type
     */
    public EquipmentTypes getEquipment_type() {
        return equipment_type;
    }

    /**
     * @param equipment_type the equipment_type to set
     */
    public void setEquipment_type(EquipmentTypes equipment_type) {
        this.equipment_type = equipment_type;
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
