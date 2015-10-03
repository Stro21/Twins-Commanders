/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Race;

/**
 *
 * @author eduardo
 */
public class DragonRace extends BaseRace{

    public DragonRace() {
        setRace(Race.Dragon);
        setDescription("A powerful reptilian monster.");
        setSize(2);
        setBlock_size(1);
        setBlock_extra_size(0.5);
        setCan_fly_or_float(true);
    }
}
