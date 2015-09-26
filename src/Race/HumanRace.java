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
public class HumanRace extends BaseRace{
    public HumanRace(){
        setRace(Race.Human);
        setDescription("The most abundant intelligent race.");
        setSize(1);
        setBlock_size(1);
        setBlock_extra_size(0);
    }
}
