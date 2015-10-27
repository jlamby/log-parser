package fr.lby.events.type.secondary;

import fr.lby.enums.MissType;

/**
 * Triggered when effect isn't applied but mana/energy is used.<br/>
 * <br/>
 * IE: ABSORB BLOCK DEFLECT DODGE EVADE IMMUNE MISS PARRY REFLECT RESIST
 *
 * @author jlamby
 *
 */
public interface Missed {

    public MissType getMissType();

    public boolean isOffHand();

    public boolean isMultistrike();

    public int getAmountMissed();

}
