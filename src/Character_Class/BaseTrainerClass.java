/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Character_Class;

/**
 *
 * @author Eduardo Straub
 */
public class BaseTrainerClass extends BaseClass{
    public BaseTrainerClass(){
        setName("Trainer");
        setDescription("Basic trainer unit");
        setHp(35);
        setStrength(18);
        setMagic(12);
        setPhysical_defense(7);
        setMagical_defense(8);
        setRace(Race.HUMAN);
        setSex(SexSpecific.UNISEX);
        setCan_lead(false);
        setRace_description("Humans are the are most populated inteligent species.");
        setSize(1);
    }
}
