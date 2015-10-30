package fr.lby.events.type.secondary;

import fr.lby.enums.PowerType;

/**
 * Same as {@link Energize} but this time you are losing energy/mana. Caused by enemies.
 *
 * @author jlamby
 *
 */
public interface Drain {

    public int getAmount();

    public PowerType getPowerType();

    public int getExtraAmount();

}
