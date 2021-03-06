/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Character_Class;

import Race.BaseRace;
import Race.HumanRace;
import Stats.BaseIncreaseStats;
import Stats.BaseStats;
import Sex.*;

/**
 *
 * @author eduardo
 */
public class WarriorCaptainClass extends BaseClass{

    public WarriorCaptainClass() {
        setName("Warrior Captain");
        setDescription("Is the melee physical main character");
        BaseStats min = new BaseStats(0, 0, 0, 0, 0);
        setMinumunStats(min);
        BaseRace race = new HumanRace();
        setRace_class(race);
        BaseIncreaseStats stats = new BaseIncreaseStats(5, 5, 2, 5, 2);
        setStats_increase(stats);
        setSex(Sex_Specific.Unisex);
        setCan_lead(true);
        setPrevious_class(null);
        setCan_lead_a_legion(false);
    }
}
