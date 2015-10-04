/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Weapons;

import Equipment.BaseEquipment;

/**
 *
 * @author Eduardo Straub
 */
public class BaseWeapon extends BaseEquipment {

    private WeaponTypes weapon_type;

    /**
     * @return the weapon_type
     */
    public WeaponTypes getWeapon_type() {
        return weapon_type;
    }

    /**
     * @param weapon_type the weapon_type to set
     */
    public void setWeapon_type(WeaponTypes weapon_type) {
        this.weapon_type = weapon_type;
    }
}
