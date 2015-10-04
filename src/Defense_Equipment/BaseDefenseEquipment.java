/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Defense_Equipment;

import Equipment.BaseEquipment;

/**
 *
 * @author Eduardo Straub
 */
public class BaseDefenseEquipment extends BaseEquipment {
    private DefenseEquipmentTypes defense_equipment_types;

    /**
     * @return the defense_equipment_types
     */
    public DefenseEquipmentTypes getDefense_Equipment_Types() {
        return defense_equipment_types;
    }

    /**
     * @param defense_equipment_types the defense_equipment_types to set
     */
    public void setDefense_Equipment_Types(DefenseEquipmentTypes defense_equipment_types) {
        this.defense_equipment_types = defense_equipment_types;
    }
}
