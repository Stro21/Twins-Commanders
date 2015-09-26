/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Character_Class;

import Stats.*;
import Race.*;
/**
 *
 * @author Eduardo Straub
 */
public class BaseArcherClass extends BaseClass{
    public BaseArcherClass(){
        setName("Archer");
        setDescription("Basic ranged unit");
        BaseStats min = new BaseStats(0, 0, 0, 0, 0);
        setMinumunStats(min);
        BaseIncreaseStats stats = new BaseIncreaseStats(1, 1, 3, 1, 3);
        setStats_increase(stats);
        BaseRace race = new HumanRace();
        setRace_class(race);
        setSex(SexSpecific.UNISEX);
        setCan_lead(false);
        
    }
}
