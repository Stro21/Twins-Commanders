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
public class HawkmanRace extends BaseRace{
    public HawkmanRace(){
        setRace(Race.Hawkman);
        setDescription("A man with hawk wings.");
        setSize(1);
        setBlock_size(1);
        setBlock_extra_size(0);
        setCan_fly_or_float(true);
    }
}
