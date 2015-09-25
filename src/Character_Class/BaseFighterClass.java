/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Character_Class;

/**
 *
 * @author Eduardo Straub
 */
public class BaseFighterClass extends BaseClass{
    public BaseFighterClass(){
        setName("Fighter");
        setDescription("The basic melee unit");
        setHp(40);
        setStrength(20);
        setMagic(10);
        setPhysical_defense(10);
        setMagical_defense(5);
        setRace(Race.HUMAN);
        setSex(SexSpecific.UNISEX);
        setCan_lead(false);
        setRace_description("Humans are the are most populated inteligent species.");
        setSize(1);
    }
}
