/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

/**
 *
 * @author Eduardo Straub
 */
public class BaseStatItem extends BaseItem {

    private int strenght;
    private int magic;
    private int physical_defence;
    private int magical_defence;

    /**
     * @return the strenght
     */
    public int getStrenght() {
        return strenght;
    }

    /**
     * @param strenght the strenght to set
     */
    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    /**
     * @return the magic
     */
    public int getMagic() {
        return magic;
    }

    /**
     * @param magic the magic to set
     */
    public void setMagic(int magic) {
        this.magic = magic;
    }

    /**
     * @return the physical_defence
     */
    public int getPhysical_defence() {
        return physical_defence;
    }

    /**
     * @param physical_defence the physical_defence to set
     */
    public void setPhysical_defence(int physical_defence) {
        this.physical_defence = physical_defence;
    }

    /**
     * @return the magical_defence
     */
    public int getMagical_defence() {
        return magical_defence;
    }

    /**
     * @param magical_defence the magical_defence to set
     */
    public void setMagical_defence(int magical_defence) {
        this.magical_defence = magical_defence;
    }
}
