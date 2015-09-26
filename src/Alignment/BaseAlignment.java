/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alignment;

/**
 *
 * @author eduardo
 */
public final class BaseAlignment {
    private Alignment alignment;
    private int align;

    public BaseAlignment(int align) {
        if (correct_alignment(align)) {
            this.align = align;
            what_align(align);
        }
    }
    
    
    
    /**
     * @return the alignment
     */
    public Alignment getAlignment() {
        return alignment;
    }

    /**
     * @param alignment the alignment to set
     */
    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    /**
     * @return the align
     */
    public int getAlign() {
        return align;
    }

    /**
     * @param align the align to set
     */
    public void setAlign(int align) {
        this.align = align;
    }
    
    public boolean correct_alignment(int alig){
        return alig >= 0 && alig <= 100;
    }
    
    public boolean very_chaotic(int alig){
        return alig >= 0 && alig <= 14;
    }
    
    public boolean chaotic(int alig){
        return alig >= 15 && alig <= 29;
    }
    
    public boolean neutral_chaotic(int alig){
        return alig >= 30 && alig <= 44;
    }
    
    public boolean neutral(int alig){
        return alig >= 45 && alig <= 55;
    }
    
    public boolean neutral_lawful(int alig){
        return alig >= 55 && alig <= 70;
    }
    
    public boolean lawful(int alig){
        return alig >= 71 && alig <= 85;
    }
    
    public boolean very_lawful(int alig){
        return alig >= 86 && alig <= 100;
    }
    
    public void what_align(int alig){
        if (correct_alignment(alig)){
            if(very_chaotic(alig)){
                alignment = Alignment.Very_Chaotic;
            }
            else if (chaotic(alig)) {
                alignment = Alignment.Chaotic;
            }
            else if (neutral_chaotic(alig)) {
                alignment = Alignment.Neutral_Chaotic;
            }
            else if (neutral(alig)) {
                alignment = Alignment.Neutral;
            }
            else if (neutral_lawful(alig)) {
                alignment = Alignment.Neutral_Lawful;
            }
            else if (lawful(alig)) {
                alignment = Alignment.Lawful;
            }
            else if (very_lawful(alig)) {
                alignment = Alignment.Lawful;
            }
            else {
                
            }
        }
    }
}
