/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Equipment;

import Items.*;
import Stats.BaseStats;
/**
 *
 * @author Eduardo Straub
 */
public class BaseEquipment extends BaseItem {

    private EquipmentTypes equipment_type;
    private BaseStats stats;

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
     * @return the stats
     */
    public BaseStats getStats() {
        return stats;
    }

    /**
     * @param stats the stats to set
     */
    public void setStats(BaseStats stats) {
        this.stats = stats;
    }
}
