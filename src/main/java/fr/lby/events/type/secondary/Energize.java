package fr.lby.events.type.secondary;

import fr.lby.enums.PowerType;

/**
 * Any effect that restores energy/mana. <br/>
 * <br/>
 * Spell/trinket/item set bonuses can trigger this event. IE: Vampiric Touch, or Mark of Defiance (Trinket)
 *
 * @author jlamby
 *
 */
public interface Energize {

    public int getAmount();

    public PowerType getPowerType();

}
