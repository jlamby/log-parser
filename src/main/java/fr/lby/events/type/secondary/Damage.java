package fr.lby.events.type.secondary;

import fr.lby.model.SpellSchool;

/**
 * Triggered on damage to health. Nothing Special. (overkill returns a number greater than or equal to zero)
 *
 * @author jlamby
 *
 */
public interface Damage {

    public int getAmount();

    public int getOverkill();

    public SpellSchool getSpellSchool();

    public boolean isResisted();

    public boolean isBlocked();

    public boolean isAbsorbed();

    public boolean isCritical();

    public boolean isGlancing();

    public boolean isCrushing();

}
