/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Character_Class;

/**
 *
 * @author Eduardo Straub
 */
public class BaseArcherClass extends BaseClass{
    public BaseArcherClass(){
        setName("Archer");
        setDescription("Basic ranged unit");
        setHp(30);
        setStrength(15);
        setMagic(15);
        setPhysical_defense(5);
        setMagical_defense(10);
        setRace(Race.HUMAN);
        setSex(SexSpecific.UNISEX);
        setCan_lead(false);
        setRace_description("Humans are the are most populated inteligent species.");
        setSize(1);
    }
}
